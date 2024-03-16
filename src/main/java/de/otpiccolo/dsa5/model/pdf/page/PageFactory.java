/**
 */
package de.otpiccolo.dsa5.model.pdf.page;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.otpiccolo.dsa5.model.pdf.page.PagePackage
 * @generated
 */
public interface PageFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PageFactory eINSTANCE = de.otpiccolo.dsa5.model.pdf.page.impl.PageFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Default Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Page</em>'.
	 * @generated
	 */
	DefaultPage createDefaultPage();

	/**
	 * Returns a new object of class '<em>Pdf Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pdf Page</em>'.
	 * @generated
	 */
	PdfPage createPdfPage();

	/**
	 * Returns a new object of class '<em>Predefined Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predefined Page</em>'.
	 * @generated
	 */
	PredefinedPage createPredefinedPage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PagePackage getPagePackage();

} //PageFactory
