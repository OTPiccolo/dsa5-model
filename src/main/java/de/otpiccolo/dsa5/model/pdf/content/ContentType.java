package de.otpiccolo.dsa5.model.pdf.content;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * @model unique="false"
 */
public enum ContentType implements Enumerator {
	/**
	 * @model name="AllgemeineSonderfertigkeit" literal="Allgemeine
	 *        Sonderfertigkeit"
	 */
	ALLGEMEINE_SONDERFERTIGKEIT(0, "AllgemeineSonderfertigkeit", "AllgemeineSonderfertigkeit"),
	/**
	 * @model name="BannSchutzKreis" literal="Bann-/Schutzkreis"
	 */
	BANN_SCHUTZ_KREIS(1, "BannSchutzKreis", "Bann-/Schutzkreis"),
	/**
	 * @model name="Elfenlied" literal="Elfenlied"
	 */
	ELFENLIED(2, "Elfenlied", "Elfenlied"),
	/**
	 * @model name="Elixier" literal="Elixier"
	 */
	ELIXIER(3, "Elixier", "Elixier"),
	/**
	 * @model name="ErweiterterLiturgiestil" literal="Erweiterter Liturgiestil"
	 */
	ERWEITERTER_LITURGIESTIL(4, "ErweiterterLiturgiestil", "Erweiterter Liturgiestil"),
	/**
	 * @model name="ErweiterterTalentstil" literal="Erweiterter Talentstil"
	 */
	ERWEITERTER_TALENTSTIL(5, "ErweiterterTalentstil", "Erweiterter Talentstil"),
	/**
	 * @model name="Gewandzauber" literal="Gewandzauber"
	 */
	GEWANDZAUBER(6, "Gewandzauber", "Gewandzauber"),
	/**
	 * @model name="Hexenfluch" literal="Hexenfluch"
	 */
	HEXENFLUCH(7, "Hexenfluch", "Hexenfluch"),
	/**
	 * @model name="Kampfsonderfertigkeit" literal="Kampf-Sonderfertigkeit"
	 */
	KAMPFSONDERFERTIGKEIT(8, "Kampfsonderfertigkeit", "Kampf-Sonderfertigkeit"),
	/**
	 * @model name="Kampfstilsonderfertigkeit"
	 *        literal="Kampfstil-Sonderfertigkeit"
	 */
	KAMPFSTILSONDERFERTIGKEIT(9, "Kampfstilsonderfertigkeit", "Kampfstil-Sonderfertigkeit"),
	/**
	 * @model name="KarmaleSonderfertigkeit" literal="Karmale Sonderfertigkeit"
	 */
	KARMALE_SONDERFERTIGKEIT(10, "KarmaleSonderfertigkeit", "Karmale Sonderfertigkeit"),
	/**
	 * @model name="KarmaleTradition" literal="Karmale Tradition"
	 */
	KARMALE_TRADITION(11, "KarmaleTradition", "Karmale Tradition"),
	/**
	 * @model name="Liturgie" literal="Liturgie"
	 */
	LITURGIE(12, "Liturgie", "Liturgie"),
	/**
	 * @model name="Liturgiestil" literal="Liturgiestil
	 */
	LITURGIESTIL(13, "Liturgiestil", "Liturgiestil"),
	/**
	 * @model name="MagischeSonderfertigkeit" literal="Magische
	 *        Sonderfertigkeit"
	 */
	MAGISCHE_SONDERFERTIGKEIT(14, "MagischeSonderfertigkeit", "MagischeSonderfertigkeit"),
	/**
	 * @model name="Nachteil" literal="Nachteil"
	 */
	NACHTEIL(15, "Nachteil", "Nachteil"),
	/**
	 * @model name="Predigt" literal="Predigt"
	 */
	PREDIGT(16, "Predigt", "Predigt"),
	/**
	 * @model name="Ritual" literal="Ritual"
	 */
	RITUAL(17, "Ritual", "Ritual"),
	/**
	 * @model name="SchicksalspunktSonderfertigkeit"
	 *        literal="Schicksalspunkt-Sonderfertigkeit"
	 */
	SCHICKSALSPUNKT_SONDERFERTIGKEIT(18, "SchicksalspunktSonderfertigkeit", "Schicksalspunkt-Sonderfertigkeit"),
	/**
	 * @model name="Segen" literal="Segen"
	 */
	SEGEN(19, "Segen", "Segen"),
	/**
	 * @model name="TalentstilSonderfertigkeit"
	 *        literal="Talentstil-Sonderfertigkeit"
	 */
	TALENTSTIL_SONDERFERTIGKEIT(20, "TalentstilSonderfertigkeit", "Talentstil-Sonderfertigkeit"),
	/**
	 * @model name="Vision" literal="Vision"
	 */
	VISION(21, "Vision", "Vision"),
	/**
	 * @model name="Vorteil" literal="Vorteil"
	 */
	VORTEIL(22, "Vorteil", "Vorteil"),
	/**
	 * @model name="Zauber" literal="Zauber"
	 */
	ZAUBER(23, "Zauber", "Zauber"),
	/**
	 * @model name="Zaubererweiterung" literal="Zaubererweiterung"
	 */
	ZAUBERERWEITERUNG(24, "Zaubererweiterung", "Zaubererweiterung"),
	/**
	 * @model name="Zauberstil" literal="Zauberstil"
	 */
	ZAUBERSTIL(25, "Zauberstil", "Zauberstil"),
	/**
	 * @model name="Zaubertanz" literal="Zaubertanz"
	 */
	ZAUBERTANZ(26, "Zaubertanz", "Zaubertanz"),
	/**
	 * @model name="ZauberTradition" literal="Zauber-Tradition"
	 */
	ZAUBER_TRADITION(27, "ZauberTradition", "Zauber-Tradition"),
	/**
	 * @model name="Zaubertrick" literal="Zaubertrick"
	 */
	ZAUBERTRICK(28, "Zaubertrick", "Zaubertrick"),
	/**
	 * @model name="Zeremonialgegenstand" literal="Zeremonialer Gegenstand"
	 */
	ZEREMONIALGEGENSTAND(29, "Zeremonialgegenstand", "Zeremonialer Gegenstand"),
	/**
	 * @model name="Zeremonie" literal="Zeremonie"
	 */
	ZEREMONIE(30, "Zeremonie", "Zeremonie");

	/**
	 * The '<em><b>Allgemeine Sonderfertigkeit</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #ALLGEMEINE_SONDERFERTIGKEIT
	 * @model name="AllgemeineSonderfertigkeit"
	 * @generated
	 * @ordered
	 */
	public static final int ALLGEMEINE_SONDERFERTIGKEIT_VALUE = 0;
	/**
	 * The '<em><b>Bann Schutz Kreis</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #BANN_SCHUTZ_KREIS
	 * @model name="BannSchutzKreis"
	 * @generated
	 * @ordered
	 */
	public static final int BANN_SCHUTZ_KREIS_VALUE = 1;
	/**
	 * The '<em><b>Elfenlied</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #ELFENLIED
	 * @model name="Elfenlied"
	 * @generated
	 * @ordered
	 */
	public static final int ELFENLIED_VALUE = 2;
	/**
	 * The '<em><b>Elixier</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #ELIXIER
	 * @model name="Elixier"
	 * @generated
	 * @ordered
	 */
	public static final int ELIXIER_VALUE = 3;
	/**
	 * The '<em><b>Erweiterter Liturgiestil</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #ERWEITERTER_LITURGIESTIL
	 * @model name="ErweiterterLiturgiestil"
	 * @generated
	 * @ordered
	 */
	public static final int ERWEITERTER_LITURGIESTIL_VALUE = 4;
	/**
	 * The '<em><b>Erweiterter Talentstil</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #ERWEITERTER_TALENTSTIL
	 * @model name="ErweiterterTalentstil"
	 * @generated
	 * @ordered
	 */
	public static final int ERWEITERTER_TALENTSTIL_VALUE = 5;
	/**
	 * The '<em><b>Gewandzauber</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #GEWANDZAUBER
	 * @model name="Gewandzauber"
	 * @generated
	 * @ordered
	 */
	public static final int GEWANDZAUBER_VALUE = 6;
	/**
	 * The '<em><b>Hexenfluch</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #HEXENFLUCH
	 * @model name="Hexenfluch"
	 * @generated
	 * @ordered
	 */
	public static final int HEXENFLUCH_VALUE = 7;
	/**
	 * The '<em><b>Kampfsonderfertigkeit</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #KAMPFSONDERFERTIGKEIT
	 * @model name="Kampfsonderfertigkeit"
	 * @generated
	 * @ordered
	 */
	public static final int KAMPFSONDERFERTIGKEIT_VALUE = 8;
	/**
	 * The '<em><b>Kampfstilsonderfertigkeit</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #KAMPFSTILSONDERFERTIGKEIT
	 * @model name="Kampfstilsonderfertigkeit"
	 * @generated
	 * @ordered
	 */
	public static final int KAMPFSTILSONDERFERTIGKEIT_VALUE = 9;
	/**
	 * The '<em><b>Karmale Sonderfertigkeit</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #KARMALE_SONDERFERTIGKEIT
	 * @model name="KarmaleSonderfertigkeit"
	 * @generated
	 * @ordered
	 */
	public static final int KARMALE_SONDERFERTIGKEIT_VALUE = 10;
	/**
	 * The '<em><b>Karmale Tradition</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #KARMALE_TRADITION
	 * @model name="KarmaleTradition"
	 * @generated
	 * @ordered
	 */
	public static final int KARMALE_TRADITION_VALUE = 11;
	/**
	 * The '<em><b>Liturgie</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #LITURGIE
	 * @model name="Liturgie"
	 * @generated
	 * @ordered
	 */
	public static final int LITURGIE_VALUE = 12;
	/**
	 * The '<em><b>Liturgiestil</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #LITURGIESTIL
	 * @model name="Liturgiestil"
	 * @generated
	 * @ordered
	 */
	public static final int LITURGIESTIL_VALUE = 13;
	/**
	 * The '<em><b>Magische Sonderfertigkeit</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #MAGISCHE_SONDERFERTIGKEIT
	 * @model name="MagischeSonderfertigkeit"
	 * @generated
	 * @ordered
	 */
	public static final int MAGISCHE_SONDERFERTIGKEIT_VALUE = 14;
	/**
	 * The '<em><b>Nachteil</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #NACHTEIL
	 * @model name="Nachteil"
	 * @generated
	 * @ordered
	 */
	public static final int NACHTEIL_VALUE = 15;
	/**
	 * The '<em><b>Predigt</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #PREDIGT
	 * @model name="Predigt"
	 * @generated
	 * @ordered
	 */
	public static final int PREDIGT_VALUE = 16;
	/**
	 * The '<em><b>Ritual</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #RITUAL
	 * @model name="Ritual"
	 * @generated
	 * @ordered
	 */
	public static final int RITUAL_VALUE = 17;
	/**
	 * The '<em><b>Schicksalspunkt Sonderfertigkeit</b></em>' literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #SCHICKSALSPUNKT_SONDERFERTIGKEIT
	 * @model name="SchicksalspunktSonderfertigkeit"
	 *        literal="Schicksalspunkt-Sonderfertigkeit"
	 * @generated
	 * @ordered
	 */
	public static final int SCHICKSALSPUNKT_SONDERFERTIGKEIT_VALUE = 18;
	/**
	 * The '<em><b>Segen</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #SEGEN
	 * @model name="Segen"
	 * @generated
	 * @ordered
	 */
	public static final int SEGEN_VALUE = 19;
	/**
	 * The '<em><b>Talentstil Sonderfertigkeit</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #TALENTSTIL_SONDERFERTIGKEIT
	 * @model name="TalentstilSonderfertigkeit"
	 * @generated
	 * @ordered
	 */
	public static final int TALENTSTIL_SONDERFERTIGKEIT_VALUE = 20;
	/**
	 * The '<em><b>Vision</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #VISION
	 * @model name="Vision"
	 * @generated
	 * @ordered
	 */
	public static final int VISION_VALUE = 21;
	/**
	 * The '<em><b>Vorteil</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #VORTEIL
	 * @model name="Vorteil"
	 * @generated
	 * @ordered
	 */
	public static final int VORTEIL_VALUE = 22;
	/**
	 * The '<em><b>Zauber</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #ZAUBER
	 * @model name="Zauber"
	 * @generated
	 * @ordered
	 */
	public static final int ZAUBER_VALUE = 23;
	/**
	 * The '<em><b>Zaubererweiterung</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #ZAUBERERWEITERUNG
	 * @model name="Zaubererweiterung"
	 * @generated
	 * @ordered
	 */
	public static final int ZAUBERERWEITERUNG_VALUE = 24;
	/**
	 * The '<em><b>Zauberstil</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #ZAUBERSTIL
	 * @model name="Zauberstil"
	 * @generated
	 * @ordered
	 */
	public static final int ZAUBERSTIL_VALUE = 25;
	/**
	 * The '<em><b>Zaubertanz</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #ZAUBERTANZ
	 * @model name="Zaubertanz"
	 * @generated
	 * @ordered
	 */
	public static final int ZAUBERTANZ_VALUE = 26;
	/**
	 * The '<em><b>Zauber Tradition</b></em>' literal value. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #ZAUBER_TRADITION
	 * @model name="ZauberTradition" literal="Zauber-Tradition"
	 * @generated
	 * @ordered
	 */
	public static final int ZAUBER_TRADITION_VALUE = 27;
	/**
	 * The '<em><b>Zaubertrick</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #ZAUBERTRICK
	 * @model name="Zaubertrick"
	 * @generated
	 * @ordered
	 */
	public static final int ZAUBERTRICK_VALUE = 28;
	/**
	 * The '<em><b>Zeremonialgegenstand</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #ZEREMONIALGEGENSTAND
	 * @model name="Zeremonialgegenstand"
	 * @generated
	 * @ordered
	 */
	public static final int ZEREMONIALGEGENSTAND_VALUE = 29;
	/**
	 * The '<em><b>Zeremonie</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #ZEREMONIE
	 * @model name="Zeremonie"
	 * @generated
	 * @ordered
	 */
	public static final int ZEREMONIE_VALUE = 30;
	/**
	 * An array of all the '<em><b>Content Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final ContentType[] VALUES_ARRAY = new ContentType[] { ALLGEMEINE_SONDERFERTIGKEIT, BANN_SCHUTZ_KREIS, ELFENLIED, ELIXIER, ERWEITERTER_LITURGIESTIL, ERWEITERTER_TALENTSTIL, GEWANDZAUBER, HEXENFLUCH, KAMPFSONDERFERTIGKEIT, KAMPFSTILSONDERFERTIGKEIT, KARMALE_SONDERFERTIGKEIT, KARMALE_TRADITION, LITURGIE, LITURGIESTIL, MAGISCHE_SONDERFERTIGKEIT, NACHTEIL, PREDIGT, RITUAL, SCHICKSALSPUNKT_SONDERFERTIGKEIT, SEGEN, TALENTSTIL_SONDERFERTIGKEIT, VISION, VORTEIL, ZAUBER, ZAUBERERWEITERUNG, ZAUBERSTIL, ZAUBERTANZ, ZAUBER_TRADITION, ZAUBERTRICK, ZEREMONIALGEGENSTAND, ZEREMONIE, };
	/**
	 * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<ContentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified literal
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType get(final String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			final ContentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param name
	 *            the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType getByName(final String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			final ContentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified integer
	 * value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType get(final int value) {
		switch (value) {
		case ALLGEMEINE_SONDERFERTIGKEIT_VALUE:
			return ALLGEMEINE_SONDERFERTIGKEIT;
		case BANN_SCHUTZ_KREIS_VALUE:
			return BANN_SCHUTZ_KREIS;
		case ELFENLIED_VALUE:
			return ELFENLIED;
		case ELIXIER_VALUE:
			return ELIXIER;
		case ERWEITERTER_LITURGIESTIL_VALUE:
			return ERWEITERTER_LITURGIESTIL;
		case ERWEITERTER_TALENTSTIL_VALUE:
			return ERWEITERTER_TALENTSTIL;
		case GEWANDZAUBER_VALUE:
			return GEWANDZAUBER;
		case HEXENFLUCH_VALUE:
			return HEXENFLUCH;
		case KAMPFSONDERFERTIGKEIT_VALUE:
			return KAMPFSONDERFERTIGKEIT;
		case KAMPFSTILSONDERFERTIGKEIT_VALUE:
			return KAMPFSTILSONDERFERTIGKEIT;
		case KARMALE_SONDERFERTIGKEIT_VALUE:
			return KARMALE_SONDERFERTIGKEIT;
		case KARMALE_TRADITION_VALUE:
			return KARMALE_TRADITION;
		case LITURGIE_VALUE:
			return LITURGIE;
		case LITURGIESTIL_VALUE:
			return LITURGIESTIL;
		case MAGISCHE_SONDERFERTIGKEIT_VALUE:
			return MAGISCHE_SONDERFERTIGKEIT;
		case NACHTEIL_VALUE:
			return NACHTEIL;
		case PREDIGT_VALUE:
			return PREDIGT;
		case RITUAL_VALUE:
			return RITUAL;
		case SCHICKSALSPUNKT_SONDERFERTIGKEIT_VALUE:
			return SCHICKSALSPUNKT_SONDERFERTIGKEIT;
		case SEGEN_VALUE:
			return SEGEN;
		case TALENTSTIL_SONDERFERTIGKEIT_VALUE:
			return TALENTSTIL_SONDERFERTIGKEIT;
		case VISION_VALUE:
			return VISION;
		case VORTEIL_VALUE:
			return VORTEIL;
		case ZAUBER_VALUE:
			return ZAUBER;
		case ZAUBERERWEITERUNG_VALUE:
			return ZAUBERERWEITERUNG;
		case ZAUBERSTIL_VALUE:
			return ZAUBERSTIL;
		case ZAUBERTANZ_VALUE:
			return ZAUBERTANZ;
		case ZAUBER_TRADITION_VALUE:
			return ZAUBER_TRADITION;
		case ZAUBERTRICK_VALUE:
			return ZAUBERTRICK;
		case ZEREMONIALGEGENSTAND_VALUE:
			return ZEREMONIALGEGENSTAND;
		case ZEREMONIE_VALUE:
			return ZEREMONIE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private final int value;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private final String name;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	private ContentType(final int value, final String name, final String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string
	 * representation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
