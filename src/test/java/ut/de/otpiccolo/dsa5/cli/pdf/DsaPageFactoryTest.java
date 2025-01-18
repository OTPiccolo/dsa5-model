package ut.de.otpiccolo.dsa5.cli.pdf;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.io.IOUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.otpiccolo.dsa5.cli.pdf.DsaPageFactory;
import de.otpiccolo.dsa5.cli.pdf.PdfBridge;
import de.otpiccolo.dsa5.model.pdf.Pdf;
import de.otpiccolo.dsa5.model.pdf.PdfFactory;
import de.otpiccolo.dsa5.model.pdf.page.PageFactory;
import de.otpiccolo.dsa5.model.pdf.page.PdfPage;
import de.otpiccolo.dsa5.pdf.PdfWriter;
import de.otpiccolo.dsa5.pdf.page.IPage;
import de.otpiccolo.pdf.PDUtil;

/**
 * Tests for {@link DsaPageFactory}.
 */
@SuppressWarnings("javadoc")
public class DsaPageFactoryTest {

	private static final Logger LOG = LoggerFactory.getLogger(DsaPageFactoryTest.class);

	private static File pdfFile;
	private static File outputFile;

	private Pdf pdf;

	@BeforeAll
	public static final void beforeAll() throws Exception {
		createOutputFile();

		createPdfFile();
	}

	private static void createOutputFile() throws IOException {
		outputFile = File.createTempFile("ut-pagefactory-output", ".pdf");
		outputFile.deleteOnExit();
		LOG.info("Temporary PDF file to write to: {}", outputFile);
	}

	private static void createPdfFile() throws IOException {
		pdfFile = File.createTempFile("ut-pagefactory-pdf", ".pdf");
		pdfFile.deleteOnExit();
		LOG.info("Temporary PDF file to read: {}", pdfFile);
		final PDDocument doc = new PDDocument();
		for (int i = 0; i < 20; i++) {
			final PDPage page = new PDPage(PDRectangle.A4);
			doc.addPage(page);
			final PDRectangle mediaBox = page.getMediaBox();
			final float horizontalOffset = mediaBox.getLowerLeftX() + PDUtil.PAGE_MARGIN;
			final float verticalOffset = mediaBox.getUpperRightY() - PDUtil.PAGE_MARGIN;
			try (PDPageContentStream content = new PDPageContentStream(doc, page)) {
				content.beginText();
				content.setFont(PDUtil.FONT, PDUtil.FONT_SIZE);
				content.newLineAtOffset(horizontalOffset, verticalOffset);
				content.showText(String.valueOf(i));
				content.endText();
			}
		}
		doc.save(pdfFile);
	}

	@BeforeEach
	public final void beforeEach() throws Exception {
		pdf = PdfFactory.eINSTANCE.createPdf();
		pdf.setPdfDestination(outputFile.getCanonicalPath());
	}

	@Test
	public final void testPdfPage_FullPdf() throws Exception {
		final PdfPage page = PageFactory.eINSTANCE.createPdfPage();
		page.setFile(pdfFile.getCanonicalPath());
		pdf.getPages().add(page);

		final PdfWriter writer = PdfBridge.createWriter(pdf);
		final List<IPage> pages = writer.getPages().toList();
		assertEquals(1, pages.size());
		final de.otpiccolo.dsa5.pdf.page.PdfPage createdPage = (de.otpiccolo.dsa5.pdf.page.PdfPage) pages.get(0);
		assertEquals(Collections.emptyList(), createdPage.getPageIndices());

		writer.setPages(pages.stream());
		writer.writeDocument();

		final PDDocument createdPdf = Loader.loadPDF(outputFile);
		assertEquals(20, createdPdf.getNumberOfPages());
		for (int i = 0; i < 20; i++) {
			final PDPage numberedPage = createdPdf.getPage(i);
			try (InputStream is = numberedPage.getContents()) {
				final byte[] bytes = IOUtils.toByteArray(is);
				final String pageContent = new String(bytes, StandardCharsets.UTF_8);
				assertTrue(pageContent.contains("(" + i + ")"), "Wrong page encountered. Expected page " + i + " but got: " + pageContent);
			}
		}
	}

	@Test
	public final void testPdfPage_SomePages() throws Exception {
		final PdfPage page = PageFactory.eINSTANCE.createPdfPage();
		page.setFile(pdfFile.getCanonicalPath());
		// Page numbers done on purpose with strange formatting and duplicate
		// entries.
		page.setPageNumbers("1, 3, 4-6,9, 11 - 15, 17, 8, 12-13");
		pdf.getPages().add(page);

		final PdfWriter writer = PdfBridge.createWriter(pdf);
		final List<IPage> pages = writer.getPages().toList();
		assertEquals(1, pages.size());
		final de.otpiccolo.dsa5.pdf.page.PdfPage createdPage = (de.otpiccolo.dsa5.pdf.page.PdfPage) pages.get(0);
		assertEquals(Arrays.asList(0, 2, 3, 4, 5, 8, 10, 11, 12, 13, 14, 16, 7, 11, 12), createdPage.getPageIndices());

		writer.setPages(pages.stream());
		writer.writeDocument();

		final PDDocument createdPdf = Loader.loadPDF(outputFile);
		assertEquals(createdPage.getPageIndices().size(), createdPdf.getNumberOfPages());
		int i = 0;
		for (final Iterator<Integer> iter = createdPage.getPageIndices().iterator(); iter.hasNext();) {
			final Integer index = iter.next();
			final PDPage numberedPage = createdPdf.getPage(i++);
			try (InputStream is = numberedPage.getContents()) {
				final byte[] bytes = IOUtils.toByteArray(is);
				final String pageContent = new String(bytes, StandardCharsets.UTF_8);
				assertTrue(pageContent.contains("(" + index + ")"), "Wrong page encountered. Expected page " + index + " but got: " + pageContent);
			}
		}
	}

}
