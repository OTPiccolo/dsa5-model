package de.otpiccolo.dsa5.model.pdf.page;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * @model unique="false"
 */
public enum PredefinedType implements Enumerator {

	/**
	 * @model name="Boron"
	 */
	BORON(0, "Boron", "Boron"),
	/**
	 * @model name="Efferd"
	 */
	EFFERD(1, "Efferd", "Efferd"),
	/**
	 * @model name="EntrueckungTrance"
	 */
	ENTRUECKUNG_TRANCE(2, "EntrueckungTrance", "EntrueckungTrance"),
	/**
	 * @model name="FernkampfMod"
	 */
	FERNKAMPF_MOD(3, "FernkampfMod", "FernkampfMod"),
	/**
	 * @model name="Firun"
	 */
	FIRUN(4, "Firun", "Firun"),
	/**
	 * @model name="Hesinde"
	 */
	HESINDE(5, "Hesinde", "Hesinde"),
	/**
	 * @model name="Ingerimm"
	 */
	INGERIMM(6, "Ingerimm", "Ingerimm"),
	/**
	 * @model name="Peraine"
	 */
	PERAINE(7, "Peraine", "Peraine"),
	/**
	 * @model name="Phex"
	 */
	PHEX(8, "Phex", "Phex"),
	/**
	 * @model name="Praios"
	 */
	PRAIOS(9, "Praios", "Praios"),
	/**
	 * @model name="Rahja"
	 */
	RAHJA(10, "Rahja", "Rahja"),
	/**
	 * @model name="Rondra"
	 */
	RONDRA(11, "Rondra", "Rondra"),
	/**
	 * @model name="Schicksalspunkte"
	 */
	SCHICKSALSPUNKTE(12, "Schicksalspunkte", "Schicksalspunkte"),
	/**
	 * @model name="Segen"
	 */
	SEGEN(13, "Segen", "Segen"),
	/**
	 * @model name="Travia"
	 */
	TRAVIA(14, "Travia", "Travia"),
	/**
	 * @model name="Tsa"
	 */
	TSA(15, "Tsa", "Tsa"),
	/**
	 * @model name="ZauberMod"
	 */
	ZAUBER_MOD(16, "ZauberMod", "ZauberMod");

	/**
	 * The '<em><b>Boron</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #BORON
	 * @model name="Boron"
	 * @generated
	 * @ordered
	 */
	public static final int BORON_VALUE = 0;
	/**
	 * The '<em><b>Efferd</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #EFFERD
	 * @model name="Efferd"
	 * @generated
	 * @ordered
	 */
	public static final int EFFERD_VALUE = 1;
	/**
	 * The '<em><b>Entrueckung Trance</b></em>' literal value. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #ENTRUECKUNG_TRANCE
	 * @model name="EntrueckungTrance"
	 * @generated
	 * @ordered
	 */
	public static final int ENTRUECKUNG_TRANCE_VALUE = 2;
	/**
	 * The '<em><b>Fernkampf Mod</b></em>' literal value. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #FERNKAMPF_MOD
	 * @model name="FernkampfMod"
	 * @generated
	 * @ordered
	 */
	public static final int FERNKAMPF_MOD_VALUE = 3;
	/**
	 * The '<em><b>Firun</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #FIRUN
	 * @model name="Firun"
	 * @generated
	 * @ordered
	 */
	public static final int FIRUN_VALUE = 4;
	/**
	 * The '<em><b>Hesinde</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #HESINDE
	 * @model name="Hesinde"
	 * @generated
	 * @ordered
	 */
	public static final int HESINDE_VALUE = 5;
	/**
	 * The '<em><b>Ingerimm</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #INGERIMM
	 * @model name="Ingerimm"
	 * @generated
	 * @ordered
	 */
	public static final int INGERIMM_VALUE = 6;
	/**
	 * The '<em><b>Peraine</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #PERAINE
	 * @model name="Peraine"
	 * @generated
	 * @ordered
	 */
	public static final int PERAINE_VALUE = 7;
	/**
	 * The '<em><b>Phex</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #PHEX
	 * @model name="Phex"
	 * @generated
	 * @ordered
	 */
	public static final int PHEX_VALUE = 8;
	/**
	 * The '<em><b>Praios</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #PRAIOS
	 * @model name="Praios"
	 * @generated
	 * @ordered
	 */
	public static final int PRAIOS_VALUE = 9;
	/**
	 * The '<em><b>Rahja</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #RAHJA
	 * @model name="Rahja"
	 * @generated
	 * @ordered
	 */
	public static final int RAHJA_VALUE = 10;
	/**
	 * The '<em><b>Rondra</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #RONDRA
	 * @model name="Rondra"
	 * @generated
	 * @ordered
	 */
	public static final int RONDRA_VALUE = 11;
	/**
	 * The '<em><b>Schicksalspunkte</b></em>' literal value. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see #SCHICKSALSPUNKTE
	 * @model name="Schicksalspunkte"
	 * @generated
	 * @ordered
	 */
	public static final int SCHICKSALSPUNKTE_VALUE = 12;
	/**
	 * The '<em><b>Segen</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #SEGEN
	 * @model name="Segen"
	 * @generated
	 * @ordered
	 */
	public static final int SEGEN_VALUE = 13;
	/**
	 * The '<em><b>Travia</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #TRAVIA
	 * @model name="Travia"
	 * @generated
	 * @ordered
	 */
	public static final int TRAVIA_VALUE = 14;
	/**
	 * The '<em><b>Tsa</b></em>' literal value. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #TSA
	 * @model name="Tsa"
	 * @generated
	 * @ordered
	 */
	public static final int TSA_VALUE = 15;
	/**
	 * The '<em><b>Zauber Mod</b></em>' literal value. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @see #ZAUBER_MOD
	 * @model name="ZauberMod"
	 * @generated
	 * @ordered
	 */
	public static final int ZAUBER_MOD_VALUE = 16;
	/**
	 * An array of all the '<em><b>Predefined Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final PredefinedType[] VALUES_ARRAY = new PredefinedType[] { BORON, EFFERD, ENTRUECKUNG_TRANCE, FERNKAMPF_MOD, FIRUN, HESINDE, INGERIMM, PERAINE, PHEX, PRAIOS, RAHJA, RONDRA, SCHICKSALSPUNKTE, SEGEN, TRAVIA, TSA, ZAUBER_MOD, };
	/**
	 * A public read-only list of all the '<em><b>Predefined Type</b></em>'
	 * enumerators. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public static final List<PredefinedType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Predefined Type</b></em>' literal with the specified
	 * literal value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param literal
	 *            the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PredefinedType get(final String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			final PredefinedType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predefined Type</b></em>' literal with the specified
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param name
	 *            the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PredefinedType getByName(final String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			final PredefinedType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predefined Type</b></em>' literal with the specified
	 * integer value. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PredefinedType get(final int value) {
		switch (value) {
		case BORON_VALUE:
			return BORON;
		case EFFERD_VALUE:
			return EFFERD;
		case ENTRUECKUNG_TRANCE_VALUE:
			return ENTRUECKUNG_TRANCE;
		case FERNKAMPF_MOD_VALUE:
			return FERNKAMPF_MOD;
		case FIRUN_VALUE:
			return FIRUN;
		case HESINDE_VALUE:
			return HESINDE;
		case INGERIMM_VALUE:
			return INGERIMM;
		case PERAINE_VALUE:
			return PERAINE;
		case PHEX_VALUE:
			return PHEX;
		case PRAIOS_VALUE:
			return PRAIOS;
		case RAHJA_VALUE:
			return RAHJA;
		case RONDRA_VALUE:
			return RONDRA;
		case SCHICKSALSPUNKTE_VALUE:
			return SCHICKSALSPUNKTE;
		case SEGEN_VALUE:
			return SEGEN;
		case TRAVIA_VALUE:
			return TRAVIA;
		case TSA_VALUE:
			return TSA;
		case ZAUBER_MOD_VALUE:
			return ZAUBER_MOD;
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
	private PredefinedType(final int value, final String name, final String literal) {
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
