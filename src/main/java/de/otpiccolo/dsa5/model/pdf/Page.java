package de.otpiccolo.dsa5.model.pdf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import de.otpiccolo.dsa5.model.pdf.content.PageContent;

/**
 * @model abstract="false" interface="false"
 */
public interface Page extends EObject {

	/**
	 * @model default="Default"
	 */
	String getPageType();

	/**
	 * Sets the value of the '{@link de.otpiccolo.dsa5.model.pdf.Page#getPageType <em>Page Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Type</em>' attribute.
	 * @see #getPageType()
	 * @generated
	 */
	void setPageType(String value);

	/**
	 * @model
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link de.otpiccolo.dsa5.model.pdf.Page#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * @model containment="true"
	 */
	EList<PageContent> getContents();

}
