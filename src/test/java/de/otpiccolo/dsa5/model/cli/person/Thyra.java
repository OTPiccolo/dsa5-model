package de.otpiccolo.dsa5.model.cli.person;

import java.util.Arrays;

import org.eclipse.emf.common.util.EList;

import de.otpiccolo.dsa5.model.pdf.Pdf;
import de.otpiccolo.dsa5.model.pdf.PdfFactory;
import de.otpiccolo.dsa5.model.pdf.content.ContentFactory;
import de.otpiccolo.dsa5.model.pdf.content.ContentType;
import de.otpiccolo.dsa5.model.pdf.content.DataContent;
import de.otpiccolo.dsa5.model.pdf.content.PageContent;
import de.otpiccolo.dsa5.model.pdf.content.ParagraphContent;
import de.otpiccolo.dsa5.model.pdf.page.DefaultPage;
import de.otpiccolo.dsa5.model.pdf.page.PageFactory;

/**
 * Information about Thyra.
 */
public class Thyra {

	private final Pdf pdf;

	/**
	 * Constructor.
	 */
	public Thyra() {
		pdf = PdfFactory.eINSTANCE.createPdf();

		final DefaultPage vorteilNachteilPage = createPage("Vorteile & Nachteile");
		fillData(vorteilNachteilPage, ContentType.VORTEIL, "Altersresistenz (*)", "Beidhändig", "Kälteresistenz", "Verbesserte Regeneration (Astralenergie) I-III", "Waffenbegabung");
		fillData(vorteilNachteilPage, ContentType.NACHTEIL, "Hitzeempfindlich", "Verpflichtungen I-III", "Zauberanfällig I-II");
		pdf.getPages().add(vorteilNachteilPage);

		final DefaultPage kampfPage = createPage("Kampfsonderfertigkeiten");
		fillData(kampfPage, ContentType.KAMPFSONDERFERTIGKEIT, "Beidhändiger Kampf I-II", "Belastungsgewöhnung I-II", "Finte I-III");
		pdf.getPages().add(kampfPage);

		final DefaultPage zauberPage1 = createPage("Zaubersprüche");
		fillData(zauberPage1, ContentType.ZAUBER, "Balsam Salabunde", "Blick in die Gedanken", "Harmlose Gestalt", "Hexenknoten");
		pdf.getPages().add(zauberPage1);
		final DefaultPage zauberPage2 = createPage(null);
		fillData(zauberPage2, ContentType.HEXENFLUCH, "Hagelschlag");
		fillData(zauberPage2, ContentType.ZAUBER, "Katzenaugen", "Krötensprung", "Odem Arcanum", "Tiergedanken");
		pdf.getPages().add(zauberPage2);

		final DefaultPage sonstigesPage = createPage("Sonstiges");
		fillParagraph(sonstigesPage, "Familie", "Vater: Kjaskar (Stammeshäuptling)");
		fillParagraph(sonstigesPage, "Mentor", "Eishexe", "Gut oder böse?");
		pdf.getPages().add(sonstigesPage);
	}

	/**
	 * Get the PDF model.
	 *
	 * @return The PDF model.
	 */
	public Pdf getPdf() {
		return pdf;
	}

	private DefaultPage createPage(final String title) {
		final DefaultPage page = PageFactory.eINSTANCE.createDefaultPage();
		page.setTitle(title);
		return page;
	}

	private void fillData(final DefaultPage page, final ContentType type, final String... data) {
		final EList<PageContent> contents = page.getContents();
		for (final String date : data) {
			final DataContent content = ContentFactory.eINSTANCE.createDataContent();
			content.setContentType(type);
			content.setContent(date);
			contents.add(content);
		}
	}

	private void fillParagraph(final DefaultPage page, final String title, final String... paragraphs) {
		final ParagraphContent content = ContentFactory.eINSTANCE.createParagraphContent();
		content.setTitle(title);
		content.getParagraphs().addAll(Arrays.asList(paragraphs));
		page.getContents().add(content);
	}

}
