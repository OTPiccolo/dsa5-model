package de.otpiccolo.dsa5.model.pdf.content;

/**
 * @model abstract="false" interface="false"
 */
public interface DataContent extends PageContent {

	/**
	 * @model unsettable="true"
	 */
	ContentType getContentType();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.content.DataContent#getContentType
	 * <em>Content Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Content Type</em>' attribute.
	 * @see de.otpiccolo.dsa5.model.pdf.content.ContentType
	 * @see #isSetContentType()
	 * @see #unsetContentType()
	 * @see #getContentType()
	 * @generated
	 */
	void setContentType(ContentType value);

	/**
	 * Unsets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.content.DataContent#getContentType
	 * <em>Content Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see #isSetContentType()
	 * @see #getContentType()
	 * @see #setContentType(ContentType)
	 * @generated
	 */
	void unsetContentType();

	/**
	 * Returns whether the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.content.DataContent#getContentType
	 * <em>Content Type</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @return whether the value of the '<em>Content Type</em>' attribute is
	 *         set.
	 * @see #unsetContentType()
	 * @see #getContentType()
	 * @see #setContentType(ContentType)
	 * @generated
	 */
	boolean isSetContentType();

	/**
	 * @model
	 */
	String getContent();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.content.DataContent#getContent
	 * <em>Content</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

}
