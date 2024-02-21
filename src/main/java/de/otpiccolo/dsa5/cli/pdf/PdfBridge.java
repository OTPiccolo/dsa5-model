package de.otpiccolo.dsa5.cli.pdf;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import de.otpiccolo.dsa5.model.pdf.Pdf;
import de.otpiccolo.dsa5.model.pdf.page.Page;
import de.otpiccolo.dsa5.pdf.PdfWriter;
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
	 * @throws FactoryException
	 *             If the PDF writer could not be created because of data
	 *             problems.
	 */
	public static final PdfWriter createWriter(final Pdf pdf) throws FactoryException {
		final PdfWriter writer = new PdfWriter();
		writer.setDestination(pdf.getPdfDestination());
		writer.setSource(pdf.getPdfSource());
		writer.setPages(createPageStream(pdf.getPages()));
		return writer;
	}

	private static final Stream<IPage> createPageStream(final List<Page> pages) throws FactoryException {
		final List<IPage> convertedPages = new ArrayList<>(pages.size());
		for (final Page page : pages) {
			convertedPages.add(DsaPageFactory.createPage(page));
		}
		return convertedPages.stream();
	}

}
