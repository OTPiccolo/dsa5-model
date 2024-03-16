package de.otpiccolo.dsa5.model.pdf.page;

/**
 * @model abstract="false" interface="false"
 */
public interface PredefinedPage extends Page {

	/**
	 * @model
	 */
	PredefinedType getId();

	/**
	 * Sets the value of the '{@link de.otpiccolo.dsa5.model.pdf.page.PredefinedPage#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see de.otpiccolo.dsa5.model.pdf.page.PredefinedType
	 * @see #getId()
	 * @generated
	 */
	void setId(PredefinedType value);

}
