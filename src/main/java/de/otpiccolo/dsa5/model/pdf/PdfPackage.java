/**
 */
package de.otpiccolo.dsa5.model.pdf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each operation of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 *
 * @see de.otpiccolo.dsa5.model.pdf.PdfFactory
 * @model kind="package"
 * @generated
 */
public interface PdfPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "pdf";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http:///de/otpiccolo/dsa5/model/pdf.ecore";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "de.otpiccolo.dsa5.model.pdf";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	PdfPackage eINSTANCE = de.otpiccolo.dsa5.model.pdf.impl.PdfPackageImpl.init();

	/**
	 * The meta object id for the
	 * '{@link de.otpiccolo.dsa5.model.pdf.impl.PdfImpl <em>Pdf</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see de.otpiccolo.dsa5.model.pdf.impl.PdfImpl
	 * @see de.otpiccolo.dsa5.model.pdf.impl.PdfPackageImpl#getPdf()
	 * @generated
	 */
	int PDF = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PDF__VERSION = 0;

	/**
	 * The feature id for the '<em><b>Pages</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PDF__PAGES = 1;

	/**
	 * The feature id for the '<em><b>Pdf Source</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PDF__PDF_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Pdf Destination</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PDF__PDF_DESTINATION = 3;

	/**
	 * The number of structural features of the '<em>Pdf</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PDF_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pdf</em>' class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PDF_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.otpiccolo.dsa5.model.pdf.Pdf
	 * <em>Pdf</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Pdf</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.Pdf
	 * @generated
	 */
	EClass getPdf();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.otpiccolo.dsa5.model.pdf.Pdf#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.Pdf#getVersion()
	 * @see #getPdf()
	 * @generated
	 */
	EAttribute getPdf_Version();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.otpiccolo.dsa5.model.pdf.Pdf#getPages <em>Pages</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list
	 *         '<em>Pages</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.Pdf#getPages()
	 * @see #getPdf()
	 * @generated
	 */
	EReference getPdf_Pages();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.otpiccolo.dsa5.model.pdf.Pdf#getPdfSource <em>Pdf
	 * Source</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Pdf Source</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.Pdf#getPdfSource()
	 * @see #getPdf()
	 * @generated
	 */
	EAttribute getPdf_PdfSource();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.otpiccolo.dsa5.model.pdf.Pdf#getPdfDestination <em>Pdf
	 * Destination</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Pdf Destination</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.Pdf#getPdfDestination()
	 * @see #getPdf()
	 * @generated
	 */
	EAttribute getPdf_PdfDestination();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PdfFactory getPdfFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each operation of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the
		 * '{@link de.otpiccolo.dsa5.model.pdf.impl.PdfImpl <em>Pdf</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see de.otpiccolo.dsa5.model.pdf.impl.PdfImpl
		 * @see de.otpiccolo.dsa5.model.pdf.impl.PdfPackageImpl#getPdf()
		 * @generated
		 */
		EClass PDF = eINSTANCE.getPdf();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PDF__VERSION = eINSTANCE.getPdf_Version();

		/**
		 * The meta object literal for the '<em><b>Pages</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EReference PDF__PAGES = eINSTANCE.getPdf_Pages();

		/**
		 * The meta object literal for the '<em><b>Pdf Source</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PDF__PDF_SOURCE = eINSTANCE.getPdf_PdfSource();

		/**
		 * The meta object literal for the '<em><b>Pdf Destination</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PDF__PDF_DESTINATION = eINSTANCE.getPdf_PdfDestination();

	}

} // PdfPackage
