/**
 */
package de.otpiccolo.dsa5.model.pdf.page.impl;

import de.otpiccolo.dsa5.model.pdf.PdfPackage;

import de.otpiccolo.dsa5.model.pdf.content.ContentPackage;

import de.otpiccolo.dsa5.model.pdf.content.impl.ContentPackageImpl;

import de.otpiccolo.dsa5.model.pdf.impl.PdfPackageImpl;

import de.otpiccolo.dsa5.model.pdf.page.DefaultPage;
import de.otpiccolo.dsa5.model.pdf.page.Page;
import de.otpiccolo.dsa5.model.pdf.page.PageFactory;
import de.otpiccolo.dsa5.model.pdf.page.PagePackage;
import de.otpiccolo.dsa5.model.pdf.page.PdfPage;

import de.otpiccolo.dsa5.model.pdf.page.PredefinedPage;
import de.otpiccolo.dsa5.model.pdf.page.PredefinedType;
import java.util.Collection;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PagePackageImpl extends EPackageImpl implements PagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pdfPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predefinedPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum predefinedTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType collectionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.otpiccolo.dsa5.model.pdf.page.PagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PagePackageImpl() {
		super(eNS_URI, PageFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PagePackage init() {
		if (isInited) return (PagePackage)EPackage.Registry.INSTANCE.getEPackage(PagePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PagePackageImpl thePagePackage = registeredPagePackage instanceof PagePackageImpl ? (PagePackageImpl)registeredPagePackage : new PagePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PdfPackage.eNS_URI);
		PdfPackageImpl thePdfPackage = (PdfPackageImpl)(registeredPackage instanceof PdfPackageImpl ? registeredPackage : PdfPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		ContentPackageImpl theContentPackage = (ContentPackageImpl)(registeredPackage instanceof ContentPackageImpl ? registeredPackage : ContentPackage.eINSTANCE);

		// Create package meta-data objects
		thePagePackage.createPackageContents();
		thePdfPackage.createPackageContents();
		theContentPackage.createPackageContents();

		// Initialize created meta-data
		thePagePackage.initializePackageContents();
		thePdfPackage.initializePackageContents();
		theContentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePagePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PagePackage.eNS_URI, thePagePackage);
		return thePagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultPage() {
		return defaultPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaultPage_Contents() {
		return (EReference)defaultPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDefaultPage_Title() {
		return (EAttribute)defaultPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPage() {
		return pageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPdfPage() {
		return pdfPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPdfPage_File() {
		return (EAttribute)pdfPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPdfPage_PageNumbers() {
		return (EAttribute)pdfPageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPredefinedPage() {
		return predefinedPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPredefinedPage_Id() {
		return (EAttribute)predefinedPageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPredefinedType() {
		return predefinedTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCollection() {
		return collectionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PageFactory getPageFactory() {
		return (PageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		defaultPageEClass = createEClass(DEFAULT_PAGE);
		createEReference(defaultPageEClass, DEFAULT_PAGE__CONTENTS);
		createEAttribute(defaultPageEClass, DEFAULT_PAGE__TITLE);

		pageEClass = createEClass(PAGE);

		pdfPageEClass = createEClass(PDF_PAGE);
		createEAttribute(pdfPageEClass, PDF_PAGE__FILE);
		createEAttribute(pdfPageEClass, PDF_PAGE__PAGE_NUMBERS);

		predefinedPageEClass = createEClass(PREDEFINED_PAGE);
		createEAttribute(predefinedPageEClass, PREDEFINED_PAGE__ID);

		// Create enums
		predefinedTypeEEnum = createEEnum(PREDEFINED_TYPE);

		// Create data types
		collectionEDataType = createEDataType(COLLECTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ContentPackage theContentPackage = (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(collectionEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		defaultPageEClass.getESuperTypes().add(this.getPage());
		pdfPageEClass.getESuperTypes().add(this.getPage());
		predefinedPageEClass.getESuperTypes().add(this.getPage());

		// Initialize classes, features, and operations; add parameters
		initEClass(defaultPageEClass, DefaultPage.class, "DefaultPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefaultPage_Contents(), theContentPackage.getPageContent(), null, "contents", null, 0, -1, DefaultPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDefaultPage_Title(), ecorePackage.getEString(), "title", null, 0, 1, DefaultPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageEClass, Page.class, "Page", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pdfPageEClass, PdfPage.class, "PdfPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPdfPage_File(), ecorePackage.getEString(), "file", null, 0, 1, PdfPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdfPage_PageNumbers(), ecorePackage.getEString(), "pageNumbers", null, 0, 1, PdfPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predefinedPageEClass, PredefinedPage.class, "PredefinedPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredefinedPage_Id(), this.getPredefinedType(), "id", null, 0, 1, PredefinedPage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(predefinedTypeEEnum, PredefinedType.class, "PredefinedType");
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.BORON);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.EFFERD);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.FIRUN);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.HESINDE);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.INGERIMM);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.PERAINE);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.PHEX);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.PRAIOS);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.RAHJA);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.RONDRA);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.SCHICKSALSPUNKTE);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.SEGEN);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.TRAVIA);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.TSA);
		addEEnumLiteral(predefinedTypeEEnum, PredefinedType.ZAUBER_MOD);

		// Initialize data types
		initEDataType(collectionEDataType, Collection.class, "Collection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //PagePackageImpl
