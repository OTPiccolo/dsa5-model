package de.otpiccolo.dsa5.model.pdf.content;

import org.eclipse.emf.common.util.EList;

/**
 * @model abstract="false" interface="false"
 */
public interface ParagraphContent extends PageContent {

	/**
	 * @model
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.otpiccolo.dsa5.model.pdf.content.ParagraphContent#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * @model
	 */
	EList<String> getParagraphs();

}
