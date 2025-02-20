/**
 */
package de.otpiccolo.dsa5.model.pdf.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import de.otpiccolo.dsa5.model.pdf.Pdf;
import de.otpiccolo.dsa5.model.pdf.PdfFactory;
import de.otpiccolo.dsa5.model.pdf.PdfPackage;
import de.otpiccolo.dsa5.model.pdf.content.ContentPackage;
import de.otpiccolo.dsa5.model.pdf.content.impl.ContentPackageImpl;
import de.otpiccolo.dsa5.model.pdf.page.PagePackage;
import de.otpiccolo.dsa5.model.pdf.page.impl.PagePackageImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class PdfPackageImpl extends EPackageImpl implements PdfPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private EClass pdfEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.otpiccolo.dsa5.model.pdf.PdfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PdfPackageImpl() {
		super(eNS_URI, PdfFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 *
	 * <p>
	 * This method is used to initialize {@link PdfPackage#eINSTANCE} when that
	 * field is accessed. Clients should not invoke it directly. Instead, they
	 * should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PdfPackage init() {
		if (isInited) {
			return (PdfPackage) EPackage.Registry.INSTANCE.getEPackage(PdfPackage.eNS_URI);
		}

		// Obtain or create and register package
		final Object registeredPdfPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		final PdfPackageImpl thePdfPackage = registeredPdfPackage instanceof PdfPackageImpl ? (PdfPackageImpl) registeredPdfPackage : new PdfPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ContentPackage.eNS_URI);
		final ContentPackageImpl theContentPackage = (ContentPackageImpl) (registeredPackage instanceof ContentPackageImpl ? registeredPackage : ContentPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PagePackage.eNS_URI);
		final PagePackageImpl thePagePackage = (PagePackageImpl) (registeredPackage instanceof PagePackageImpl ? registeredPackage : PagePackage.eINSTANCE);

		// Create package meta-data objects
		thePdfPackage.createPackageContents();
		theContentPackage.createPackageContents();
		thePagePackage.createPackageContents();

		// Initialize created meta-data
		thePdfPackage.initializePackageContents();
		theContentPackage.initializePackageContents();
		thePagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePdfPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PdfPackage.eNS_URI, thePdfPackage);
		return thePdfPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EClass getPdf() {
		return pdfEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getPdf_Version() {
		return (EAttribute) pdfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EReference getPdf_Pages() {
		return (EReference) pdfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getPdf_PdfSource() {
		return (EAttribute) pdfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EAttribute getPdf_PdfDestination() {
		return (EAttribute) pdfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PdfFactory getPdfFactory() {
		return (PdfFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) {
			return;
		}
		isCreated = true;

		// Create classes and their features
		pdfEClass = createEClass(PDF);
		createEAttribute(pdfEClass, PDF__VERSION);
		createEReference(pdfEClass, PDF__PAGES);
		createEAttribute(pdfEClass, PDF__PDF_SOURCE);
		createEAttribute(pdfEClass, PDF__PDF_DESTINATION);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) {
			return;
		}
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		final PagePackage thePagePackage = (PagePackage) EPackage.Registry.INSTANCE.getEPackage(PagePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(pdfEClass, Pdf.class, "Pdf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPdf_Version(), ecorePackage.getEString(), "version", "1.0", 0, 1, Pdf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPdf_Pages(), thePagePackage.getPage(), null, "pages", null, 0, -1, Pdf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdf_PdfSource(), ecorePackage.getEString(), "pdfSource", null, 0, 1, Pdf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPdf_PdfDestination(), ecorePackage.getEString(), "pdfDestination", null, 0, 1, Pdf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // PdfPackageImpl
