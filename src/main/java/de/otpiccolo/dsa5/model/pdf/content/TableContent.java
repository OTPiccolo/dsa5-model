package de.otpiccolo.dsa5.model.pdf.content;

import org.eclipse.emf.common.util.EList;

/**
 * Content to display a table.
 *
 * @model abstract="false" interface="false"
 */
public interface TableContent extends PageContent {

	/**
	 * @model containment="true"
	 */
	EList<TableRow> getRows();

	/**
	 * @model
	 */
	int getColumnCount();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.content.TableContent#getColumnCount
	 * <em>Column Count</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Column Count</em>' attribute.
	 * @see #getColumnCount()
	 * @generated
	 */
	void setColumnCount(int value);

	/**
	 * @model optional="true"
	 */
	String getColumnWeights();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.content.TableContent#getColumnWeights
	 * <em>Column Weights</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Column Weights</em>' attribute.
	 * @see #getColumnWeights()
	 * @generated
	 */
	void setColumnWeights(String value);

}
