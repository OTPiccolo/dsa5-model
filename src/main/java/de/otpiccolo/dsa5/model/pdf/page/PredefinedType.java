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
	 * @model name="Schicksalspunkte"
	 */
	SCHICKSALSPUNKTE(0, "Schicksalspunkte", "Schicksalspunkte"),
	/**
	 * @model name="Segen"
	 */
	SEGEN(1, "Segen", "Segen"),
	/**
	 * @model name="Travia"
	 */
	TRAVIA(2, "Travia", "Travia"),
	/**
	 * @model name="ZauberMod"
	 */
	ZAUBER_MOD(3, "ZauberMod", "ZauberMod");

	/**
	 * The '<em><b>Schicksalspunkte</b></em>' literal value.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #SCHICKSALSPUNKTE
	 * @model name="Schicksalspunkte"
	 * @generated
	 * @ordered
	 */
	public static final int SCHICKSALSPUNKTE_VALUE = 0;
	/**
	 * The '<em><b>Segen</b></em>' literal value.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #SEGEN
	 * @model name="Segen"
	 * @generated
	 * @ordered
	 */
	public static final int SEGEN_VALUE = 1;
	/**
	 * The '<em><b>Travia</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVIA
	 * @model name="Travia"
	 * @generated
	 * @ordered
	 */
	public static final int TRAVIA_VALUE = 2;
	/**
	 * The '<em><b>Zauber Mod</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZAUBER_MOD
	 * @model name="ZauberMod"
	 * @generated
	 * @ordered
	 */
	public static final int ZAUBER_MOD_VALUE = 3;
	/**
	 * An array of all the '<em><b>Predefined Type</b></em>' enumerators. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static final PredefinedType[] VALUES_ARRAY = new PredefinedType[] {
			SCHICKSALSPUNKTE,
			SEGEN,
			TRAVIA,
			ZAUBER_MOD,
		};
	/**
	 * A public read-only list of all the '<em><b>Predefined Type</b></em>' enumerators.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PredefinedType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Predefined Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PredefinedType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PredefinedType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predefined Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PredefinedType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PredefinedType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Predefined Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PredefinedType get(int value) {
		switch (value) {
			case SCHICKSALSPUNKTE_VALUE: return SCHICKSALSPUNKTE;
			case SEGEN_VALUE: return SEGEN;
			case TRAVIA_VALUE: return TRAVIA;
			case ZAUBER_MOD_VALUE: return ZAUBER_MOD;
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
	private PredefinedType(int value, String name, String literal) {
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
