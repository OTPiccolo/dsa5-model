/**
 */
package de.otpiccolo.dsa5.model.pdf.page;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.otpiccolo.dsa5.model.pdf.page.PageFactory
 * @model kind="package"
 * @generated
 */
public interface PagePackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNAME = "page";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_URI = "http:///de/otpiccolo/dsa5/model/pdf/page.ecore";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	String eNS_PREFIX = "de.otpiccolo.dsa5.model.pdf.page";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	PagePackage eINSTANCE = de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl.init();

	/**
	 * The meta object id for the '{@link de.otpiccolo.dsa5.model.pdf.page.Page
	 * <em>Page</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see de.otpiccolo.dsa5.model.pdf.page.Page
	 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 1;

	/**
	 * The number of structural features of the '<em>Page</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Page</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.impl.DefaultPageImpl <em>Default
	 * Page</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see de.otpiccolo.dsa5.model.pdf.page.impl.DefaultPageImpl
	 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getDefaultPage()
	 * @generated
	 */
	int DEFAULT_PAGE = 0;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PAGE__CONTENTS = PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PAGE__TITLE = PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Default Page</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Default Page</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int DEFAULT_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.impl.PdfPageImpl <em>Pdf
	 * Page</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PdfPageImpl
	 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getPdfPage()
	 * @generated
	 */
	int PDF_PAGE = 2;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PDF_PAGE__FILE = PAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Page Numbers</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PDF_PAGE__PAGE_NUMBERS = PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pdf Page</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PDF_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Pdf Page</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PDF_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.impl.PredefinedPageImpl
	 * <em>Predefined Page</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PredefinedPageImpl
	 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getPredefinedPage()
	 * @generated
	 */
	int PREDEFINED_PAGE = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_PAGE__ID = PAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Predefined Page</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_PAGE_FEATURE_COUNT = PAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Predefined Page</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 * @ordered
	 */
	int PREDEFINED_PAGE_OPERATION_COUNT = PAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PredefinedType <em>Predefined
	 * Type</em>}' enum. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see de.otpiccolo.dsa5.model.pdf.page.PredefinedType
	 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getPredefinedType()
	 * @generated
	 */
	int PREDEFINED_TYPE = 4;

	/**
	 * The meta object id for the '<em>Collection</em>' data type. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see java.util.Collection
	 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 5;

	/**
	 * The meta object id for the '<em>File</em>' data type. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 *
	 * @see java.io.File
	 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getFile()
	 * @generated
	 */
	int FILE = 6;

	/**
	 * Returns the meta object for class
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.DefaultPage <em>Default
	 * Page</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Default Page</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.page.DefaultPage
	 * @generated
	 */
	EClass getDefaultPage();

	/**
	 * Returns the meta object for the containment reference list
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.DefaultPage#getContents
	 * <em>Contents</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the containment reference list
	 *         '<em>Contents</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.page.DefaultPage#getContents()
	 * @see #getDefaultPage()
	 * @generated
	 */
	EReference getDefaultPage_Contents();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.DefaultPage#getTitle
	 * <em>Title</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.page.DefaultPage#getTitle()
	 * @see #getDefaultPage()
	 * @generated
	 */
	EAttribute getDefaultPage_Title();

	/**
	 * Returns the meta object for class
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.Page <em>Page</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Page</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.page.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for class
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PdfPage <em>Pdf Page</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Pdf Page</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.page.PdfPage
	 * @generated
	 */
	EClass getPdfPage();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PdfPage#getFile <em>File</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.page.PdfPage#getFile()
	 * @see #getPdfPage()
	 * @generated
	 */
	EAttribute getPdfPage_File();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PdfPage#getPageNumbers <em>Page
	 * Numbers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Page Numbers</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.page.PdfPage#getPageNumbers()
	 * @see #getPdfPage()
	 * @generated
	 */
	EAttribute getPdfPage_PageNumbers();

	/**
	 * Returns the meta object for class
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PredefinedPage <em>Predefined
	 * Page</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for class '<em>Predefined Page</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.page.PredefinedPage
	 * @generated
	 */
	EClass getPredefinedPage();

	/**
	 * Returns the meta object for the attribute
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PredefinedPage#getId
	 * <em>Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.page.PredefinedPage#getId()
	 * @see #getPredefinedPage()
	 * @generated
	 */
	EAttribute getPredefinedPage_Id();

	/**
	 * Returns the meta object for enum
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PredefinedType <em>Predefined
	 * Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for enum '<em>Predefined Type</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.page.PredefinedType
	 * @generated
	 */
	EEnum getPredefinedType();

	/**
	 * Returns the meta object for data type '{@link java.util.Collection
	 * <em>Collection</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
	EDataType getCollection();

	/**
	 * Returns the meta object for data type '{@link java.io.File
	 * <em>File</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the meta object for data type '<em>File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File"
	 * @generated
	 */
	EDataType getFile();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PageFactory getPageFactory();

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
		 * '{@link de.otpiccolo.dsa5.model.pdf.page.impl.DefaultPageImpl
		 * <em>Default Page</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @see de.otpiccolo.dsa5.model.pdf.page.impl.DefaultPageImpl
		 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getDefaultPage()
		 * @generated
		 */
		EClass DEFAULT_PAGE = eINSTANCE.getDefaultPage();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @generated
		 */
		EReference DEFAULT_PAGE__CONTENTS = eINSTANCE.getDefaultPage_Contents();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute DEFAULT_PAGE__TITLE = eINSTANCE.getDefaultPage_Title();

		/**
		 * The meta object literal for the
		 * '{@link de.otpiccolo.dsa5.model.pdf.page.Page <em>Page</em>}' class.
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see de.otpiccolo.dsa5.model.pdf.page.Page
		 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the
		 * '{@link de.otpiccolo.dsa5.model.pdf.page.impl.PdfPageImpl <em>Pdf
		 * Page</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PdfPageImpl
		 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getPdfPage()
		 * @generated
		 */
		EClass PDF_PAGE = eINSTANCE.getPdfPage();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PDF_PAGE__FILE = eINSTANCE.getPdfPage_File();

		/**
		 * The meta object literal for the '<em><b>Page Numbers</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PDF_PAGE__PAGE_NUMBERS = eINSTANCE.getPdfPage_PageNumbers();

		/**
		 * The meta object literal for the
		 * '{@link de.otpiccolo.dsa5.model.pdf.page.impl.PredefinedPageImpl
		 * <em>Predefined Page</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PredefinedPageImpl
		 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getPredefinedPage()
		 * @generated
		 */
		EClass PREDEFINED_PAGE = eINSTANCE.getPredefinedPage();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @generated
		 */
		EAttribute PREDEFINED_PAGE__ID = eINSTANCE.getPredefinedPage_Id();

		/**
		 * The meta object literal for the
		 * '{@link de.otpiccolo.dsa5.model.pdf.page.PredefinedType
		 * <em>Predefined Type</em>}' enum. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 *
		 * @see de.otpiccolo.dsa5.model.pdf.page.PredefinedType
		 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getPredefinedType()
		 * @generated
		 */
		EEnum PREDEFINED_TYPE = eINSTANCE.getPredefinedType();

		/**
		 * The meta object literal for the '<em>Collection</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see java.util.Collection
		 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getCollection()
		 * @generated
		 */
		EDataType COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '<em>File</em>' data type. <!--
		 * begin-user-doc --> <!-- end-user-doc -->
		 *
		 * @see java.io.File
		 * @see de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

	}

} // PagePackage
