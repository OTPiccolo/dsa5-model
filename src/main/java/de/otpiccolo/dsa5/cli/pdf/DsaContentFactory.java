package de.otpiccolo.dsa5.cli.pdf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import de.otpiccolo.dsa5.data.elfenlied.ElfenliedReader;
import de.otpiccolo.dsa5.data.elfenlied.ElfenliedWriter;
import de.otpiccolo.dsa5.data.elixiere.ElixierReader;
import de.otpiccolo.dsa5.data.elixiere.ElixierWriter;
import de.otpiccolo.dsa5.data.erweiteterliturgiestil.ErweiterterLiturgiestilReader;
import de.otpiccolo.dsa5.data.erweiteterliturgiestil.ErweiterterLiturgiestilWriter;
import de.otpiccolo.dsa5.data.hexenfluch.HexenfluchReader;
import de.otpiccolo.dsa5.data.hexenfluch.HexenfluchWriter;
import de.otpiccolo.dsa5.data.kampfsonderfertigkeiten.KampfsonderfertigkeitReader;
import de.otpiccolo.dsa5.data.kampfsonderfertigkeiten.KampfsonderfertigkeitWriter;
import de.otpiccolo.dsa5.data.kampfstilsonderfertigkeiten.KampfstilsonderfertigkeitReader;
import de.otpiccolo.dsa5.data.kampfstilsonderfertigkeiten.KampfstilsonderfertigkeitWriter;
import de.otpiccolo.dsa5.data.karmalesonderfertigkeiten.KarmaleSonderfertigkeitReader;
import de.otpiccolo.dsa5.data.karmalesonderfertigkeiten.KarmaleSonderfertigkeitWriter;
import de.otpiccolo.dsa5.data.karmaletradition.KarmaleTraditionReader;
import de.otpiccolo.dsa5.data.karmaletradition.KarmaleTraditionWriter;
import de.otpiccolo.dsa5.data.liturgien.LiturgieReader;
import de.otpiccolo.dsa5.data.liturgien.LiturgieWriter;
import de.otpiccolo.dsa5.data.liturgiestil.LiturgiestilReader;
import de.otpiccolo.dsa5.data.liturgiestil.LiturgiestilWriter;
import de.otpiccolo.dsa5.data.nachteile.NachteilReader;
import de.otpiccolo.dsa5.data.nachteile.NachteilWriter;
import de.otpiccolo.dsa5.data.predigt.PredigtReader;
import de.otpiccolo.dsa5.data.predigt.PredigtWriter;
import de.otpiccolo.dsa5.data.segen.SegenReader;
import de.otpiccolo.dsa5.data.segen.SegenWriter;
import de.otpiccolo.dsa5.data.vision.VisionReader;
import de.otpiccolo.dsa5.data.vision.VisionWriter;
import de.otpiccolo.dsa5.data.vorteile.VorteilReader;
import de.otpiccolo.dsa5.data.vorteile.VorteilWriter;
import de.otpiccolo.dsa5.data.zauber.ZauberReader;
import de.otpiccolo.dsa5.data.zauber.ZauberWriter;
import de.otpiccolo.dsa5.data.zaubererweiterung.ZaubererweiterungReader;
import de.otpiccolo.dsa5.data.zaubererweiterung.ZaubererweiterungWriter;
import de.otpiccolo.dsa5.data.zaubertrick.ZaubertrickReader;
import de.otpiccolo.dsa5.data.zaubertrick.ZaubertrickWriter;
import de.otpiccolo.dsa5.data.zeremonialgegenstand.ZeremonialgegenstandReader;
import de.otpiccolo.dsa5.data.zeremonialgegenstand.ZeremonialgegenstandWriter;
import de.otpiccolo.dsa5.data.zeremonien.ZeremonieReader;
import de.otpiccolo.dsa5.data.zeremonien.ZeremonieWriter;
import de.otpiccolo.dsa5.model.pdf.content.ContentType;
import de.otpiccolo.dsa5.model.pdf.content.DataContent;
import de.otpiccolo.dsa5.model.pdf.content.ImageContent;
import de.otpiccolo.dsa5.model.pdf.content.PageContent;
import de.otpiccolo.dsa5.model.pdf.content.ParagraphContent;
import de.otpiccolo.dsa5.pdf.data.IDataReader;
import de.otpiccolo.dsa5.pdf.data.IDataWriter;
import de.otpiccolo.dsa5.pdf.data.image.ImageReader;
import de.otpiccolo.dsa5.pdf.data.image.ImageWriter;
import de.otpiccolo.dsa5.pdf.data.paragraph.ParagraphData;
import de.otpiccolo.dsa5.pdf.data.paragraph.ParagraphWriter;

/**
 * Factory to generate DSA writer.
 */
public class DsaContentFactory {

	private static final Map<ContentType, Function<List<String>, IDataWriter>> map;

	static {
		map = new EnumMap<>(ContentType.class);
		map.put(ContentType.ELFENLIED, d -> fillWriter(ElfenliedWriter::new, ElfenliedReader::new, d));
		map.put(ContentType.ELIXIER, d -> fillWriter(ElixierWriter::new, ElixierReader::new, d));
		map.put(ContentType.ERWEITERTER_LITURGIESTIL, d -> fillWriter(ErweiterterLiturgiestilWriter::new, ErweiterterLiturgiestilReader::new, d));
		map.put(ContentType.HEXENFLUCH, d -> fillWriter(HexenfluchWriter::new, HexenfluchReader::new, d));
		map.put(ContentType.KAMPFSONDERFERTIGKEIT, d -> fillWriter(KampfsonderfertigkeitWriter::new, KampfsonderfertigkeitReader::new, d));
		map.put(ContentType.KAMPFSTILSONDERFERTIGKEIT, d -> fillWriter(KampfstilsonderfertigkeitWriter::new, KampfstilsonderfertigkeitReader::new, d));
		map.put(ContentType.KARMALE_SONDERFERTIGKEIT, d -> fillWriter(KarmaleSonderfertigkeitWriter::new, KarmaleSonderfertigkeitReader::new, d));
		map.put(ContentType.KARMALE_TRADITION, d -> fillWriter(KarmaleTraditionWriter::new, KarmaleTraditionReader::new, d));
		map.put(ContentType.LITURGIE, d -> fillWriter(LiturgieWriter::new, LiturgieReader::new, d));
		map.put(ContentType.LITURGIESTIL, d -> fillWriter(LiturgiestilWriter::new, LiturgiestilReader::new, d));
		map.put(ContentType.NACHTEIL, d -> fillWriter(NachteilWriter::new, NachteilReader::new, d));
		map.put(ContentType.PREDIGT, d -> fillWriter(PredigtWriter::new, PredigtReader::new, d));
		map.put(ContentType.SEGEN, d -> fillWriter(SegenWriter::new, SegenReader::new, d));
		map.put(ContentType.VISION, d -> fillWriter(VisionWriter::new, VisionReader::new, d));
		map.put(ContentType.VORTEIL, d -> fillWriter(VorteilWriter::new, VorteilReader::new, d));
		map.put(ContentType.ZAUBER, d -> fillWriter(ZauberWriter::new, ZauberReader::new, d));
		map.put(ContentType.ZAUBERERWEITERUNG, d -> fillWriter(ZaubererweiterungWriter::new, ZaubererweiterungReader::new, d));
		map.put(ContentType.ZAUBERTRICK, d -> fillWriter(ZaubertrickWriter::new, ZaubertrickReader::new, d));
		map.put(ContentType.ZEREMONIALGEGENSTAND, d -> fillWriter(ZeremonialgegenstandWriter::new, ZeremonialgegenstandReader::new, d));
		map.put(ContentType.ZEREMONIE, d -> fillWriter(ZeremonieWriter::new, ZeremonieReader::new, d));
	}

	/**
	 * Creates a DSA writer for the given page content.
	 *
	 * @param content
	 *            The content to create a writer for.
	 * @return The created DSA writer.
	 * @throws FactoryException
	 *             If the data writer could not be created because of data
	 *             problems.
	 */
	public static final IDataWriter createDataWriter(final PageContent content) throws FactoryException {
		if (content instanceof final DataContent dc) {
			return createDataContent(dc);
		}
		if (content instanceof final ParagraphContent pc) {
			return createParagraphContent(pc);
		}
		if (content instanceof final ImageContent ic) {
			return createImageContent(ic);
		}
		throw new FactoryException("Unknown page content encountered: " + content);
	}

	private static final IDataWriter createDataContent(final DataContent content) {
		final Function<List<String>, IDataWriter> creator = map.get(content.getContentType());
		if (creator == null) {
			throw new IllegalArgumentException("Unknown content type: " + content.getContentType());
		}
		return creator.apply(Collections.singletonList(content.getContent()));
	}

	private static final IDataWriter createParagraphContent(final ParagraphContent content) {
		return new ParagraphWriter(content.getTitle(), content.getParagraphs().stream().map(ParagraphData::new).toList());
	}

	private static final IDataWriter createImageContent(final ImageContent content) {
		return new ImageWriter(new ImageReader().readData(content.getImagePath()));
	}

	private static final <T extends IDataWriter, U extends IDataReader<String, V>, V> T fillWriter(final Function<Collection<V>, T> writer, final Supplier<U> reader, final List<String> data) {
		final List<V> readData = new ArrayList<>();
		final U suppliedReader = reader.get();
		for (final String date : data) {
			readData.add(suppliedReader.readData(date));
		}
		return writer.apply(readData);
	}

}
