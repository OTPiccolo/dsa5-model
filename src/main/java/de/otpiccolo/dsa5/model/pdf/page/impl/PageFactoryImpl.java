/**
 */
package de.otpiccolo.dsa5.model.pdf.page.impl;

import java.io.File;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import de.otpiccolo.dsa5.model.pdf.page.DefaultPage;
import de.otpiccolo.dsa5.model.pdf.page.PageFactory;
import de.otpiccolo.dsa5.model.pdf.page.PagePackage;
import de.otpiccolo.dsa5.model.pdf.page.PdfPage;
import de.otpiccolo.dsa5.model.pdf.page.PredefinedPage;
import de.otpiccolo.dsa5.model.pdf.page.PredefinedType;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 *
 * @generated
 */
public class PageFactoryImpl extends EFactoryImpl implements PageFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	public static PageFactory init() {
		try {
			final PageFactory thePageFactory = (PageFactory) EPackage.Registry.INSTANCE.getEFactory(PagePackage.eNS_URI);
			if (thePageFactory != null) {
				return thePageFactory;
			}
		} catch (final Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	public PageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EObject create(final EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PagePackage.DEFAULT_PAGE:
			return createDefaultPage();
		case PagePackage.PDF_PAGE:
			return createPdfPage();
		case PagePackage.PREDEFINED_PAGE:
			return createPredefinedPage();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object createFromString(final EDataType eDataType, final String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PagePackage.PREDEFINED_TYPE:
			return createPredefinedTypeFromString(eDataType, initialValue);
		case PagePackage.COLLECTION:
			return createCollectionFromString(eDataType, initialValue);
		case PagePackage.FILE:
			return createFileFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String convertToString(final EDataType eDataType, final Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PagePackage.PREDEFINED_TYPE:
			return convertPredefinedTypeToString(eDataType, instanceValue);
		case PagePackage.COLLECTION:
			return convertCollectionToString(eDataType, instanceValue);
		case PagePackage.FILE:
			return convertFileToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public DefaultPage createDefaultPage() {
		final DefaultPageImpl defaultPage = new DefaultPageImpl();
		return defaultPage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PdfPage createPdfPage() {
		final PdfPageImpl pdfPage = new PdfPageImpl();
		return pdfPage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PredefinedPage createPredefinedPage() {
		final PredefinedPageImpl predefinedPage = new PredefinedPageImpl();
		return predefinedPage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public PredefinedType createPredefinedTypeFromString(final EDataType eDataType, final String initialValue) {
		final PredefinedType result = PredefinedType.get(initialValue);
		if (result == null) {
			throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertPredefinedTypeToString(final EDataType eDataType, final Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public Collection<?> createCollectionFromString(final EDataType eDataType, final String initialValue) {
		return (Collection<?>) super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertCollectionToString(final EDataType eDataType, final Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public File createFileFromString(final EDataType eDataType, final String initialValue) {
		return (File) super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public String convertFileToString(final EDataType eDataType, final Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PagePackage getPagePackage() {
		return (PagePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PagePackage getPackage() {
		return PagePackage.eINSTANCE;
	}

} // PageFactoryImpl
