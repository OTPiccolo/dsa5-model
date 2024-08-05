/**
 */
package de.otpiccolo.dsa5.model.pdf.content.impl;

import de.otpiccolo.dsa5.model.pdf.PdfPackage;

import de.otpiccolo.dsa5.model.pdf.content.ContentFactory;
import de.otpiccolo.dsa5.model.pdf.content.ContentPackage;
import de.otpiccolo.dsa5.model.pdf.content.ContentType;
import de.otpiccolo.dsa5.model.pdf.content.DataContent;
import de.otpiccolo.dsa5.model.pdf.content.ImageContent;
import de.otpiccolo.dsa5.model.pdf.content.PageContent;
import de.otpiccolo.dsa5.model.pdf.content.ParagraphContent;

import de.otpiccolo.dsa5.model.pdf.content.TableCell;
import de.otpiccolo.dsa5.model.pdf.content.TableContent;
import de.otpiccolo.dsa5.model.pdf.content.TableRow;
import de.otpiccolo.dsa5.model.pdf.impl.PdfPackageImpl;

import de.otpiccolo.dsa5.model.pdf.page.PagePackage;
import de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
	private EClass imageContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableRowEClass = null;

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PagePackage.eNS_URI);
		PagePackageImpl thePagePackage = (PagePackageImpl)(registeredPackage instanceof PagePackageImpl ? registeredPackage : PagePackage.eINSTANCE);

		// Create package meta-data objects
		theContentPackage.createPackageContents();
		thePdfPackage.createPackageContents();
		thePagePackage.createPackageContents();

		// Initialize created meta-data
		theContentPackage.initializePackageContents();
		thePdfPackage.initializePackageContents();
		thePagePackage.initializePackageContents();

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
	public EClass getImageContent() {
		return imageContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImageContent_ImagePath() {
		return (EAttribute)imageContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableCell() {
		return tableCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableCell_Row() {
		return (EReference)tableCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableCell_Content() {
		return (EReference)tableCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableContent() {
		return tableContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableContent_Rows() {
		return (EReference)tableContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableContent_ColumnCount() {
		return (EAttribute)tableContentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTableContent_ColumnWeights() {
		return (EAttribute)tableContentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTableRow() {
		return tableRowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableRow_Table() {
		return (EReference)tableRowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTableRow_Cells() {
		return (EReference)tableRowEClass.getEStructuralFeatures().get(1);
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

		imageContentEClass = createEClass(IMAGE_CONTENT);
		createEAttribute(imageContentEClass, IMAGE_CONTENT__IMAGE_PATH);

		tableCellEClass = createEClass(TABLE_CELL);
		createEReference(tableCellEClass, TABLE_CELL__ROW);
		createEReference(tableCellEClass, TABLE_CELL__CONTENT);

		tableContentEClass = createEClass(TABLE_CONTENT);
		createEReference(tableContentEClass, TABLE_CONTENT__ROWS);
		createEAttribute(tableContentEClass, TABLE_CONTENT__COLUMN_COUNT);
		createEAttribute(tableContentEClass, TABLE_CONTENT__COLUMN_WEIGHTS);

		tableRowEClass = createEClass(TABLE_ROW);
		createEReference(tableRowEClass, TABLE_ROW__TABLE);
		createEReference(tableRowEClass, TABLE_ROW__CELLS);

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
		imageContentEClass.getESuperTypes().add(this.getPageContent());
		tableContentEClass.getESuperTypes().add(this.getPageContent());

		// Initialize classes, features, and operations; add parameters
		initEClass(dataContentEClass, DataContent.class, "DataContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataContent_Content(), ecorePackage.getEString(), "content", null, 0, 1, DataContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataContent_ContentType(), this.getContentType(), "contentType", null, 0, 1, DataContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pageContentEClass, PageContent.class, "PageContent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(paragraphContentEClass, ParagraphContent.class, "ParagraphContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParagraphContent_Title(), ecorePackage.getEString(), "title", null, 0, 1, ParagraphContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphContent_Paragraphs(), ecorePackage.getEString(), "paragraphs", null, 0, -1, ParagraphContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageContentEClass, ImageContent.class, "ImageContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImageContent_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, ImageContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableCellEClass, TableCell.class, "TableCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableCell_Row(), this.getTableRow(), this.getTableRow_Cells(), "row", null, 0, 1, TableCell.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableCell_Content(), this.getPageContent(), null, "content", null, 0, 1, TableCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableContentEClass, TableContent.class, "TableContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableContent_Rows(), this.getTableRow(), this.getTableRow_Table(), "rows", null, 0, -1, TableContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableContent_ColumnCount(), ecorePackage.getEInt(), "columnCount", null, 0, 1, TableContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableContent_ColumnWeights(), ecorePackage.getEString(), "columnWeights", null, 0, 1, TableContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableRowEClass, TableRow.class, "TableRow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableRow_Table(), this.getTableContent(), this.getTableContent_Rows(), "table", null, 0, 1, TableRow.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableRow_Cells(), this.getTableCell(), this.getTableCell_Row(), "cells", null, 0, -1, TableRow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contentTypeEEnum, ContentType.class, "ContentType");
		addEEnumLiteral(contentTypeEEnum, ContentType.ALLGEMEINE_SONDERFERTIGKEIT);
		addEEnumLiteral(contentTypeEEnum, ContentType.ELFENLIED);
		addEEnumLiteral(contentTypeEEnum, ContentType.ELIXIER);
		addEEnumLiteral(contentTypeEEnum, ContentType.ERWEITERTER_LITURGIESTIL);
		addEEnumLiteral(contentTypeEEnum, ContentType.HEXENFLUCH);
		addEEnumLiteral(contentTypeEEnum, ContentType.KARMALE_SONDERFERTIGKEIT);
		addEEnumLiteral(contentTypeEEnum, ContentType.KARMALE_TRADITION);
		addEEnumLiteral(contentTypeEEnum, ContentType.KAMPFSONDERFERTIGKEIT);
		addEEnumLiteral(contentTypeEEnum, ContentType.KAMPFSTILSONDERFERTIGKEIT);
		addEEnumLiteral(contentTypeEEnum, ContentType.LITURGIE);
		addEEnumLiteral(contentTypeEEnum, ContentType.LITURGIESTIL);
		addEEnumLiteral(contentTypeEEnum, ContentType.NACHTEIL);
		addEEnumLiteral(contentTypeEEnum, ContentType.PREDIGT);
		addEEnumLiteral(contentTypeEEnum, ContentType.SEGEN);
		addEEnumLiteral(contentTypeEEnum, ContentType.VISION);
		addEEnumLiteral(contentTypeEEnum, ContentType.VORTEIL);
		addEEnumLiteral(contentTypeEEnum, ContentType.ZAUBER);
		addEEnumLiteral(contentTypeEEnum, ContentType.ZAUBERERWEITERUNG);
		addEEnumLiteral(contentTypeEEnum, ContentType.ZAUBERTRICK);
		addEEnumLiteral(contentTypeEEnum, ContentType.ZEREMONIALGEGENSTAND);
		addEEnumLiteral(contentTypeEEnum, ContentType.ZEREMONIE);

		// Create resource
		createResource(eNS_URI);
	}

} //ContentPackageImpl
