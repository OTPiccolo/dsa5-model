package de.otpiccolo.dsa5.model.pdf.page;

/**
 * @model abstract="false" interface="false"
 */
public interface PredefinedPage extends Page {

	/**
	 * @model unsettable="true"
	 */
	PredefinedType getId();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PredefinedPage#getId
	 * <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Id</em>' attribute.
	 * @see de.otpiccolo.dsa5.model.pdf.page.PredefinedType
	 * @see #isSetId()
	 * @see #unsetId()
	 * @see #getId()
	 * @generated
	 */
	void setId(PredefinedType value);

	/**
	 * Unsets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PredefinedPage#getId
	 * <em>Id</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #isSetId()
	 * @see #getId()
	 * @see #setId(PredefinedType)
	 * @generated
	 */
	void unsetId();

	/**
	 * Returns whether the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PredefinedPage#getId
	 * <em>Id</em>}' attribute is set. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #unsetId()
	 * @see #getId()
	 * @see #setId(PredefinedType)
	 * @generated
	 */
	boolean isSetId();

}
