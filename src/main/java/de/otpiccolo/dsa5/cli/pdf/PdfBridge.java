package de.otpiccolo.dsa5.cli.pdf;

import java.io.File;
import java.io.IOException;
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
	 * Writes the give pdf model to a PDF.
	 *
	 * @param pdf
	 *            the model describing what to write to the PDF.
	 * @throws IOException
	 *             If the PDF file could not be written.
	 * @throws FactoryException
	 *             If the PDF could not be created because of data problems.
	 */
	public static final void writePdf(final Pdf pdf) throws IOException, FactoryException {
		writePdf(pdf, pdf.getPdfDestination(), pdf.getPdfSource());
	}

	/**
	 * Writes the give pdf model to a PDF.
	 *
	 * @param pdf
	 *            the model describing what to write to the PDF.
	 * @param destination
	 *            Use the given destination instead of the one given in the pdf
	 *            model. If <code>null</code> is given, no PDF will be written.
	 * @param source
	 *            Use the given source instead of the one given in the pdf
	 *            model. If <code>null</code> ist given, no source will be used.
	 * @throws IOException
	 *             If the PDF file could not be written.
	 * @throws FactoryException
	 *             If the PDF could not be created because of data problems.
	 */
	public static final void writePdf(final Pdf pdf, final File destination, final File source) throws IOException, FactoryException {
		final PdfWriter writer = new PdfWriter();
		writer.setDestination(destination);
		writer.setSource(source);
		writer.setPages(createPageStream(pdf.getPages()));
		writer.writeDocument();
	}

	private static final Stream<IPage> createPageStream(final List<Page> pages) throws FactoryException {
		final List<IPage> convertedPages = new ArrayList<>(pages.size());
		for (final Page page : pages) {
			convertedPages.add(DsaPageFactory.createPage(page));
		}
		return convertedPages.stream();
	}

}
