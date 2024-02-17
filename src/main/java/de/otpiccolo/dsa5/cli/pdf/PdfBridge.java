package de.otpiccolo.dsa5.cli.pdf;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import de.otpiccolo.dsa5.model.pdf.Page;
import de.otpiccolo.dsa5.model.pdf.Pdf;
import de.otpiccolo.dsa5.model.pdf.content.PageContent;
import de.otpiccolo.dsa5.pdf.PdfWriter;
import de.otpiccolo.dsa5.pdf.data.IDataWriter;
import de.otpiccolo.dsa5.pdf.page.DefaultPage;
import de.otpiccolo.dsa5.pdf.page.IPage;

/**
 * Bridge between EMF model to save and read data, and the classes to read and
 * write PDFs.
 */
public class PdfBridge {

	/**
	 * Creates the writer to write a PDF, from the given pdf model.
	 *
	 * @param pdf
	 *            The model describing what to write in the PDF.
	 * @return A writer for the PDF.
	 */
	public static final PdfWriter createWriter(final Pdf pdf) {
		final PdfWriter writer = new PdfWriter();
		writer.setDestination(pdf.getPdfDestination());
		writer.setSource(pdf.getPdfSource());
		writer.setPages(createPageStream(pdf.getPages()));
		return writer;
	}

	private static final Stream<IPage> createPageStream(final List<Page> pages) {
		final List<IPage> convertedPages = new ArrayList<>(pages.size());
		for (final Page page : pages) {
			final DefaultPage convertedPage = DsaPageFactory.createPage(page.getPageType());
			convertedPage.setTitle(page.getTitle());
			convertedPage.getWriters().addAll(createDataWriters(page.getContents()));
			convertedPages.add(convertedPage);
		}
		return convertedPages.stream();
	}

	private static final List<IDataWriter> createDataWriters(final List<PageContent> pageContents) {
		final List<IDataWriter> writers = new ArrayList<>();
		for (final PageContent content : pageContents) {
			writers.add(createWriter(content));
		}
		return writers;
	}

	private static final IDataWriter createWriter(final PageContent content) {
		return DsaContentFactory.createDataWriter(content);
	}

}
