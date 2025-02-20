/**
 */
package de.otpiccolo.dsa5.model.pdf.content;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 *
 * @see de.otpiccolo.dsa5.model.pdf.content.ContentPackage
 * @generated
 */
public interface ContentFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	ContentFactory eINSTANCE = de.otpiccolo.dsa5.model.pdf.content.impl.ContentFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Data Content</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Data Content</em>'.
	 * @generated
	 */
	DataContent createDataContent();

	/**
	 * Returns a new object of class '<em>Paragraph Content</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Paragraph Content</em>'.
	 * @generated
	 */
	ParagraphContent createParagraphContent();

	/**
	 * Returns a new object of class '<em>Image Content</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Image Content</em>'.
	 * @generated
	 */
	ImageContent createImageContent();

	/**
	 * Returns a new object of class '<em>Table Cell</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Table Cell</em>'.
	 * @generated
	 */
	TableCell createTableCell();

	/**
	 * Returns a new object of class '<em>Table Content</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Table Content</em>'.
	 * @generated
	 */
	TableContent createTableContent();

	/**
	 * Returns a new object of class '<em>Table Row</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @return a new object of class '<em>Table Row</em>'.
	 * @generated
	 */
	TableRow createTableRow();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @return the package supported by this factory.
	 * @generated
	 */
	ContentPackage getContentPackage();

} // ContentFactory
