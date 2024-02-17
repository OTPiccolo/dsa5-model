/**
 */
package de.otpiccolo.dsa5.model.pdf.content.impl;

import de.otpiccolo.dsa5.model.pdf.PdfPackage;

import de.otpiccolo.dsa5.model.pdf.content.ContentFactory;
import de.otpiccolo.dsa5.model.pdf.content.ContentPackage;
import de.otpiccolo.dsa5.model.pdf.content.ContentType;
import de.otpiccolo.dsa5.model.pdf.content.DataContent;
import de.otpiccolo.dsa5.model.pdf.content.PageContent;
import de.otpiccolo.dsa5.model.pdf.content.ParagraphContent;

import de.otpiccolo.dsa5.model.pdf.impl.PdfPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContentPackageImpl extends EPackageImpl implements ContentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pageContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contentTypeEEnum = null;

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
	 * @see de.otpiccolo.dsa5.model.pdf.content.ContentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContentPackageImpl() {
		super(eNS_URI, ContentFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContentPackage init() {
		if (isInited) return (ContentPackage)EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContentPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContentPackageImpl theContentPackage = registeredContentPackage instanceof ContentPackageImpl ? (ContentPackageImpl)registeredContentPackage : new ContentPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PdfPackage.eNS_URI);
		PdfPackageImpl thePdfPackage = (PdfPackageImpl)(registeredPackage instanceof PdfPackageImpl ? registeredPackage : PdfPackage.eINSTANCE);

		// Create package meta-data objects
		theContentPackage.createPackageContents();
		thePdfPackage.createPackageContents();

		// Initialize created meta-data
		theContentPackage.initializePackageContents();
		thePdfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContentPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContentPackage.eNS_URI, theContentPackage);
		return theContentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataContent() {
		return dataContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataContent_Content() {
		return (EAttribute)dataContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataContent_ContentType() {
		return (EAttribute)dataContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPageContent() {
		return pageContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParagraphContent() {
		return paragraphContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParagraphContent_Title() {
		return (EAttribute)paragraphContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParagraphContent_Paragraphs() {
		return (EAttribute)paragraphContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContentType() {
		return contentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentFactory getContentFactory() {
		return (ContentFactory)getEFactoryInstance();
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
		dataContentEClass = createEClass(DATA_CONTENT);
		createEAttribute(dataContentEClass, DATA_CONTENT__CONTENT);
		createEAttribute(dataContentEClass, DATA_CONTENT__CONTENT_TYPE);

		pageContentEClass = createEClass(PAGE_CONTENT);

		paragraphContentEClass = createEClass(PARAGRAPH_CONTENT);
		createEAttribute(paragraphContentEClass, PARAGRAPH_CONTENT__TITLE);
		createEAttribute(paragraphContentEClass, PARAGRAPH_CONTENT__PARAGRAPHS);

		// Create enums
		contentTypeEEnum = createEEnum(CONTENT_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		dataContentEClass.getESuperTypes().add(this.getPageContent());
		paragraphContentEClass.getESuperTypes().add(this.getPageContent());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataContentEClass, DataContent.class, "DataContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataContent_Content(), ecorePackage.getEString(), "content", null, 0, 1, DataContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataContent_ContentType(), this.getContentType(), "contentType", null, 0, 1, DataContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageContentEClass, PageContent.class, "PageContent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paragraphContentEClass, ParagraphContent.class, "ParagraphContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParagraphContent_Title(), ecorePackage.getEString(), "title", null, 0, 1, ParagraphContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphContent_Paragraphs(), ecorePackage.getEString(), "paragraphs", null, 0, -1, ParagraphContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contentTypeEEnum, ContentType.class, "ContentType");
		addEEnumLiteral(contentTypeEEnum, ContentType.VORTEIL);
		addEEnumLiteral(contentTypeEEnum, ContentType.NACHTEIL);
		addEEnumLiteral(contentTypeEEnum, ContentType.KAMPFSONDERFERTIGKEIT);
		addEEnumLiteral(contentTypeEEnum, ContentType.ZAUBER);
		addEEnumLiteral(contentTypeEEnum, ContentType.HEXENFLUCH);
		addEEnumLiteral(contentTypeEEnum, ContentType.PREDIGT);
		addEEnumLiteral(contentTypeEEnum, ContentType.LITURGIE);
		addEEnumLiteral(contentTypeEEnum, ContentType.ZEREMONIE);
		addEEnumLiteral(contentTypeEEnum, ContentType.VISION);

		// Create resource
		createResource(eNS_URI);
	}

} //ContentPackageImpl
