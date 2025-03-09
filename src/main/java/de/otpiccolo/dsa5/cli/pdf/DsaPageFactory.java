package de.otpiccolo.dsa5.cli.pdf;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;

import de.otpiccolo.dsa5.model.pdf.content.PageContent;
import de.otpiccolo.dsa5.model.pdf.page.DefaultPage;
import de.otpiccolo.dsa5.model.pdf.page.Page;
import de.otpiccolo.dsa5.model.pdf.page.PdfPage;
import de.otpiccolo.dsa5.model.pdf.page.PredefinedPage;
import de.otpiccolo.dsa5.model.pdf.page.PredefinedType;
import de.otpiccolo.dsa5.pdf.data.IDataWriter;
import de.otpiccolo.dsa5.pdf.page.IPage;
import de.otpiccolo.dsa5.pdf.page.predefined.EntrueckungTrancePage;
import de.otpiccolo.dsa5.pdf.page.predefined.FernkampfModPage;
import de.otpiccolo.dsa5.pdf.page.predefined.SchicksalspunktePage;
import de.otpiccolo.dsa5.pdf.page.predefined.SegenPage;
import de.otpiccolo.dsa5.pdf.page.predefined.ZauberModPage;
import de.otpiccolo.dsa5.pdf.page.predefined.geweihte.BoronPage;
import de.otpiccolo.dsa5.pdf.page.predefined.geweihte.EfferdPage;
import de.otpiccolo.dsa5.pdf.page.predefined.geweihte.FirunPage;
import de.otpiccolo.dsa5.pdf.page.predefined.geweihte.HesindePage;
import de.otpiccolo.dsa5.pdf.page.predefined.geweihte.IngerimmPage;
import de.otpiccolo.dsa5.pdf.page.predefined.geweihte.PerainePage;
import de.otpiccolo.dsa5.pdf.page.predefined.geweihte.PhexPage;
import de.otpiccolo.dsa5.pdf.page.predefined.geweihte.PraiosPage;
import de.otpiccolo.dsa5.pdf.page.predefined.geweihte.RahjaPage;
import de.otpiccolo.dsa5.pdf.page.predefined.geweihte.RondraPage;
import de.otpiccolo.dsa5.pdf.page.predefined.geweihte.TraviaPage;
import de.otpiccolo.dsa5.pdf.page.predefined.geweihte.TsaPage;

/**
 * Factory to generate DSA page.
 */
public class DsaPageFactory {

	private static final Pattern PAGE_NUMBER_PATTERN = Pattern.compile("(?<first>\\d+)(?: *- *(?<second>\\d+))?");

	/**
	 * Creates a DSA page for the given page.
	 *
	 * @param page
	 *            The model page.
	 * @return The created DSA page.
	 * @throws FactoryException
	 *             If the page could not be created because of data problems.
	 */
	public static final de.otpiccolo.dsa5.pdf.page.IPage createPage(final Page page) throws FactoryException {
		if (page instanceof final DefaultPage dp) {
			return createDefaultPage(dp);
		}
		if (page instanceof final PdfPage pp) {
			return createPdfPage(pp);
		}
		if (page instanceof final PredefinedPage pp) {
			return createPredefinedPage(pp);
		}
		throw new FactoryException("Unknown pace encountered: " + page);
	}

	private static final de.otpiccolo.dsa5.pdf.page.DefaultPage createDefaultPage(final DefaultPage page) throws FactoryException {
		final de.otpiccolo.dsa5.pdf.page.DefaultPage createdPage = new de.otpiccolo.dsa5.pdf.page.DefaultPage();
		createdPage.setTitle(page.getTitle());
		createdPage.getWriters().addAll(createDataWriters(page.getContents()));
		return createdPage;
	}

	private static final List<IDataWriter> createDataWriters(final List<PageContent> pageContents) throws FactoryException {
		final List<IDataWriter> writers = new ArrayList<>();
		for (final PageContent content : pageContents) {
			writers.add(createWriter(content));
		}
		return writers;
	}

	private static final IDataWriter createWriter(final PageContent content) throws FactoryException {
		return DsaContentFactory.createDataWriter(content);
	}

	private static final de.otpiccolo.dsa5.pdf.page.PdfPage createPdfPage(final PdfPage page) throws FactoryException {
		final File file = page.getFile();
		if (file == null) {
			throw new FactoryException("Could not create PDF page. No file was given.");
		}

		PDDocument doc;
		try {
			doc = Loader.loadPDF(file);
		} catch (final IOException e) {
			throw new FactoryException("Could not read PDF from \"" + file + "\". Error message: " + e.getMessage(), e);
		}

		final de.otpiccolo.dsa5.pdf.page.PdfPage createdPage = new de.otpiccolo.dsa5.pdf.page.PdfPage(doc);
		if (page.getPageNumbers() != null) {
			createdPage.getPageIndices().addAll(createPageIndices(page.getPageNumbers()));
		}
		return createdPage;
	}

	// Page numbers are usually given one based index (human input), while the
	// machine needs zero based index.
	private static final Collection<Integer> createPageIndices(final String pageNumbers) {
		final List<Integer> indices = new ArrayList<>();
		final Matcher matcher = PAGE_NUMBER_PATTERN.matcher(pageNumbers);
		while (matcher.find()) {
			final String first = matcher.group("first");
			final String second = matcher.group("second");
			if (second == null) {
				indices.add(Integer.parseInt(first) - 1);
			} else {
				final int fromInc = Integer.parseInt(first) - 1;
				final int toExc = Integer.parseInt(second);
				for (int i = fromInc; i < toExc; i++) {
					indices.add(i);
				}
			}
		}
		return indices;
	}

	private static IPage createPredefinedPage(final PredefinedPage pp) throws FactoryException {
		final PredefinedType id = pp.getId();
		if (id == null) {
			throw new FactoryException("Could not create Predefined page. No ID was given.");
		}

		return switch (id) {
		case BORON -> new BoronPage();
		case EFFERD -> new EfferdPage();
		case ENTRUECKUNG_TRANCE -> new EntrueckungTrancePage();
		case FERNKAMPF_MOD -> new FernkampfModPage();
		case FIRUN -> new FirunPage();
		case HESINDE -> new HesindePage();
		case INGERIMM -> new IngerimmPage();
		case PERAINE -> new PerainePage();
		case PHEX -> new PhexPage();
		case PRAIOS -> new PraiosPage();
		case RAHJA -> new RahjaPage();
		case RONDRA -> new RondraPage();
		case SCHICKSALSPUNKTE -> new SchicksalspunktePage();
		case SEGEN -> new SegenPage();
		case TRAVIA -> new TraviaPage();
		case TSA -> new TsaPage();
		case ZAUBER_MOD -> new ZauberModPage();
		default -> throw new FactoryException("Unknown predefined page encountered. Not yet implemented: " + id.getLiteral());
		};
	}

}
