package de.otpiccolo.dsa5.model.cli.person;

import java.util.Arrays;

import org.eclipse.emf.common.util.EList;

import de.otpiccolo.dsa5.model.pdf.Pdf;
import de.otpiccolo.dsa5.model.pdf.PdfFactory;
import de.otpiccolo.dsa5.model.pdf.content.ContentFactory;
import de.otpiccolo.dsa5.model.pdf.content.ContentType;
import de.otpiccolo.dsa5.model.pdf.content.DataContent;
import de.otpiccolo.dsa5.model.pdf.content.ImageContent;
import de.otpiccolo.dsa5.model.pdf.content.PageContent;
import de.otpiccolo.dsa5.model.pdf.content.ParagraphContent;
import de.otpiccolo.dsa5.model.pdf.page.DefaultPage;
import de.otpiccolo.dsa5.model.pdf.page.Page;
import de.otpiccolo.dsa5.model.pdf.page.PageFactory;
import de.otpiccolo.dsa5.model.pdf.page.PredefinedPage;
import de.otpiccolo.dsa5.model.pdf.page.PredefinedType;

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
		final EList<Page> pages = pdf.getPages();

		final DefaultPage vorteilNachteilPage = createPage("Vorteile & Nachteile");
		fillData(vorteilNachteilPage, ContentType.VORTEIL, "Altersresistenz (*)", "Beidhändig", "Kälteresistenz", "Verbesserte Regeneration (Astralenergie) I-III", "Waffenbegabung");
		fillData(vorteilNachteilPage, ContentType.NACHTEIL, "Hitzeempfindlich", "Verpflichtungen I-III", "Zauberanfällig I-II");
		pages.add(vorteilNachteilPage);

		final DefaultPage kampfPage = createPage("Kampfsonderfertigkeiten");
		fillData(kampfPage, ContentType.KAMPFSONDERFERTIGKEIT, "Beidhändiger Kampf I-II", "Belastungsgewöhnung I-II", "Finte I-III", "Wuchtschlag I-III");
		fillData(kampfPage, ContentType.KARMALE_TRADITION, "Praios");
		pages.add(kampfPage);

		final DefaultPage zauberPage1 = createPage("Zaubersprüche");
		fillData(zauberPage1, ContentType.ZAUBER, "Balsam Salabunde", "Blick in die Gedanken");
		fillData(zauberPage1, ContentType.ZAUBERERWEITERUNG, "Blick in die Gedanken#Sichtung 1");
		fillData(zauberPage1, ContentType.ZAUBER, "Harmlose Gestalt", "Hexenknoten");
		pages.add(zauberPage1);
		final DefaultPage zauberPage2 = createPage(null);
		fillData(zauberPage2, ContentType.ZAUBERERWEITERUNG, "Hexenknoten#Ausgenommen Freunde 1");
		fillData(zauberPage2, ContentType.HEXENFLUCH, "Hagelschlag");
		fillData(zauberPage2, ContentType.ZAUBER, "Katzenaugen");
		fillData(zauberPage2, ContentType.ZAUBERERWEITERUNG, "Katzenaugen#Längere Aufrechterhaltung");
		fillData(zauberPage2, ContentType.ZAUBER, "Krötensprung", "Odem Arcanum", "Tiergedanken");
		pages.add(zauberPage2);

		final DefaultPage sonstigesPage = createPage("Sonstiges");
		fillParagraph(sonstigesPage, "Familie", "Vater: Kjaskar (Stammeshäuptling)", "Mutter: Norhild. Unklar. Vermutlich bei Geburt gestorben, aber offen.", "Lehrmeisterin: Runa. Hexe. Ehemaliger 'Reaper'. Erhält 'Kälteimmunität' von ihr.", "Beschützerin von: Tiri. Ehemalige Adelige, deren Eltern getötet wurden.");
		fillParagraph(sonstigesPage, "Heimat", "Dorf Drakkarsheim auf der Insel Lassir.");
		fillParagraph(sonstigesPage, "Gegenstände", "Kristallschlag: Magisches Schwert der Kälte. Ehemalige Klinge von Runa. Kann nur mit 'Kälteimmunität' geführt werden. Macht Frostschaden.", "Eulenamulett: Geschenk von Tiri. Ermöglicht einmal pro Tag für 10 Minuten, +4 Zähigkeit/Schaden/Körperkraft. Eine Aktion als Aktivierung.");
		fillParagraph(sonstigesPage, "Gedicht von Tiri", "In Thorwals stürmischer, wilder See, Segelt mutig eine Maid, so kühn und frei. Mit Herz voll Güte, barmherzig wie Schnee, Bringt sie Hoffnung, wo Dunkelheit sei.", "An ihrer Seite, eine Schneeeule weiß, Ein stiller Wächter in der dunklen Nacht. Sie kämpfen gemeinsam, so sicher und leis, Gegen das Böse, mit mutiger Macht.", "Schwarzmagier und Piraten sind ihr Ziel, Mit Schwert und Magie, stets voll Gnade. Für eine Welt, die in Frieden erblüht, Dank der Thorwalerin und ihrer heldenhaften Pfade.");
		fillParagraph(sonstigesPage, "Sonstiges", "Held der Zyklopen-Insel: Hat die Stadt <Name> vor dem Untergang durch einen Angriff der Fischmenschen gerettet. Dafür wurde sie zur Heldin der Zyklopen-Inseln ernannt. Kriegt +1 auf alle sozialen Interaktionen mit Horasiern.", "Erweiterung Ausgetauscht: Optolith kann anscheinend \"Blick in die Gedanken # Sichtung 1\" nicht. Darum ist angzeigte Erweiterung \"#Kampfhandlung vorhersehen\" als Ersatz genommen.");
		pages.add(sonstigesPage);

		final PredefinedPage traviaPage = PageFactory.eINSTANCE.createPredefinedPage();
		traviaPage.setId(PredefinedType.TRAVIA);
		pages.add(traviaPage);
		final PredefinedPage zauberModPage = PageFactory.eINSTANCE.createPredefinedPage();
		zauberModPage.setId(PredefinedType.ZAUBER_MOD);
		pages.add(zauberModPage);
		final PredefinedPage schipsPage = PageFactory.eINSTANCE.createPredefinedPage();
		schipsPage.setId(PredefinedType.SCHICKSALSPUNKTE);
		pages.add(schipsPage);

		final DefaultPage imagePage = createPage(null);
		final ImageContent imageContent = ContentFactory.eINSTANCE.createImageContent();
		imageContent.setImagePath("D:\\RP\\Bilder\\Thyra.jpg");
		imagePage.getContents().add(imageContent);
		pages.add(imagePage);
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
