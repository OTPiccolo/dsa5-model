package de.otpiccolo.dsa5.model.pdf.content;

import org.eclipse.emf.ecore.EObject;

/**
 * @model abstract="false" interface="false"
 */
public interface TableCell extends EObject {

	/**
	 * @model opposite="cells"
	 */
	TableRow getRow();

	/**
	 * Sets the value of the '{@link de.otpiccolo.dsa5.model.pdf.content.TableCell#getRow <em>Row</em>}' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Row</em>' container reference.
	 * @see #getRow()
	 * @generated
	 */
	void setRow(TableRow value);

	/**
	 * @model containment="true"
	 */
	PageContent getContent();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.content.TableCell#getContent
	 * <em>Content</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Content</em>' reference.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(PageContent value);

}
