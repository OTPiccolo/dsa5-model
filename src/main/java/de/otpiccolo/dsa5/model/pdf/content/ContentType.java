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
	 * @model name="Hexenfluch"
	 */
	HEXENFLUCH(0, "Hexenfluch", "Hexenfluch"),
	/**
	 * @model name="KarmaleTradition"
	 */
	KARMALE_TRADITION(1, "KarmaleTradition", "KarmaleTradition"),
	/**
	 * @model name="Kampfsonderfertigkeit"
	 */
	KAMPFSONDERFERTIGKEIT(2, "Kampfsonderfertigkeit", "Kampfsonderfertigkeit"),
	/**
	 * @model name="Liturgie"
	 */
	LITURGIE(3, "Liturgie", "Liturgie"),

	/**
	 * @model name="Nachteil"
	 */
	NACHTEIL(4, "Nachteil", "Nachteil"),
	/**
	 * @model name="Predigt"
	 */
	PREDIGT(5, "Predigt", "Predigt"),

	/**
	 * @model name="Segen"
	 */
	SEGEN(6, "Segen", "Segen"),
	/**
	 * @model name="Vision"
	 */
	VISION(7, "Vision", "Vision"),
	/**
	 * @model name="Vorteil"
	 */
	VORTEIL(8, "Vorteil", "Vorteil"),
	/**
	 * @model name="Zauber"
	 */
	ZAUBER(9, "Zauber", "Zauber"),
	/**
	 * @model name="Zaubererweiterung"
	 */
	ZAUBERERWEITERUNG(10, "Zaubererweiterung", "Zaubererweiterung"),
	/**
	 * @model name="Zeremonie"
	 */
	ZEREMONIE(11, "Zeremonie", "Zeremonie");

	/**
	 * The '<em><b>Hexenfluch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEXENFLUCH
	 * @model name="Hexenfluch"
	 * @generated
	 * @ordered
	 */
	public static final int HEXENFLUCH_VALUE = 0;
	/**
	 * The '<em><b>Karmale Tradition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KARMALE_TRADITION
	 * @model name="KarmaleTradition"
	 * @generated
	 * @ordered
	 */
	public static final int KARMALE_TRADITION_VALUE = 1;
	/**
	 * The '<em><b>Kampfsonderfertigkeit</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #KAMPFSONDERFERTIGKEIT
	 * @model name="Kampfsonderfertigkeit"
	 * @generated
	 * @ordered
	 */
	public static final int KAMPFSONDERFERTIGKEIT_VALUE = 2;
	/**
	 * The '<em><b>Liturgie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LITURGIE
	 * @model name="Liturgie"
	 * @generated
	 * @ordered
	 */
	public static final int LITURGIE_VALUE = 3;
	/**
	 * The '<em><b>Nachteil</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NACHTEIL
	 * @model name="Nachteil"
	 * @generated
	 * @ordered
	 */
	public static final int NACHTEIL_VALUE = 4;
	/**
	 * The '<em><b>Predigt</b></em>' literal value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #PREDIGT
	 * @model name="Predigt"
	 * @generated
	 * @ordered
	 */
	public static final int PREDIGT_VALUE = 5;
	/**
	 * The '<em><b>Segen</b></em>' literal value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #SEGEN
	 * @model name="Segen"
	 * @generated
	 * @ordered
	 */
	public static final int SEGEN_VALUE = 6;
	/**
	 * The '<em><b>Vision</b></em>' literal value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #VISION
	 * @model name="Vision"
	 * @generated
	 * @ordered
	 */
	public static final int VISION_VALUE = 7;
	/**
	 * The '<em><b>Vorteil</b></em>' literal value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #VORTEIL
	 * @model name="Vorteil"
	 * @generated
	 * @ordered
	 */
	public static final int VORTEIL_VALUE = 8;
	/**
	 * The '<em><b>Zauber</b></em>' literal value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #ZAUBER
	 * @model name="Zauber"
	 * @generated
	 * @ordered
	 */
	public static final int ZAUBER_VALUE = 9;
	/**
	 * The '<em><b>Zaubererweiterung</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #ZAUBERERWEITERUNG
	 * @model name="Zaubererweiterung"
	 * @generated
	 * @ordered
	 */
	public static final int ZAUBERERWEITERUNG_VALUE = 10;
	/**
	 * The '<em><b>Zeremonie</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZEREMONIE
	 * @model name="Zeremonie"
	 * @generated
	 * @ordered
	 */
	public static final int ZEREMONIE_VALUE = 11;
	/**
	 * An array of all the '<em><b>Content Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final ContentType[] VALUES_ARRAY = new ContentType[] {
			HEXENFLUCH,
			KARMALE_TRADITION,
			KAMPFSONDERFERTIGKEIT,
			LITURGIE,
			NACHTEIL,
			PREDIGT,
			SEGEN,
			VISION,
			VORTEIL,
			ZAUBER,
			ZAUBERERWEITERUNG,
			ZEREMONIE,
		};
	/**
	 * A public read-only list of all the '<em><b>Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentType result = VALUES_ARRAY[i];
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
	public static ContentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContentType get(int value) {
		switch (value) {
			case HEXENFLUCH_VALUE: return HEXENFLUCH;
			case KARMALE_TRADITION_VALUE: return KARMALE_TRADITION;
			case KAMPFSONDERFERTIGKEIT_VALUE: return KAMPFSONDERFERTIGKEIT;
			case LITURGIE_VALUE: return LITURGIE;
			case NACHTEIL_VALUE: return NACHTEIL;
			case PREDIGT_VALUE: return PREDIGT;
			case SEGEN_VALUE: return SEGEN;
			case VISION_VALUE: return VISION;
			case VORTEIL_VALUE: return VORTEIL;
			case ZAUBER_VALUE: return ZAUBER;
			case ZAUBERERWEITERUNG_VALUE: return ZAUBERERWEITERUNG;
			case ZEREMONIE_VALUE: return ZEREMONIE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @generated
	 */
	private ContentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
}
