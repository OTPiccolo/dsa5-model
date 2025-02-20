package de.otpiccolo.dsa5.model.pdf.page;

import org.eclipse.emf.common.util.EList;

import de.otpiccolo.dsa5.model.pdf.content.PageContent;

/**
 * @model abstract="false" interface="false"
 */
public interface DefaultPage extends Page {

	/**
	 * @model
	 */
	String getTitle();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.DefaultPage#getTitle
	 * <em>Title</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * @model containment="true"
	 */
	EList<PageContent> getContents();

}
