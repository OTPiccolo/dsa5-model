package de.otpiccolo.dsa5.model.pdf.content;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model abstract="false" interface="false"
 */
public interface TableRow extends EObject {

	/**
	 * @model opposite="rows"
	 */
	TableContent getTable();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.content.TableRow#getTable
	 * <em>Table</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Table</em>' container reference.
	 * @see #getTable()
	 * @generated
	 */
	void setTable(TableContent value);

	/**
	 * @model containment="true"
	 */
	EList<TableCell> getCells();

}
