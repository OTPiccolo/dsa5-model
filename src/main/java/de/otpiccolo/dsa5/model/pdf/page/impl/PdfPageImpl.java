/**
 */
package de.otpiccolo.dsa5.model.pdf.page.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.otpiccolo.dsa5.model.pdf.page.PagePackage;
import de.otpiccolo.dsa5.model.pdf.page.PdfPage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Pdf
 * Page</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.otpiccolo.dsa5.model.pdf.page.impl.PdfPageImpl#getFile
 * <em>File</em>}</li>
 * <li>{@link de.otpiccolo.dsa5.model.pdf.page.impl.PdfPageImpl#getPageNumbers
 * <em>Page Numbers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PdfPageImpl extends MinimalEObjectImpl.Container implements PdfPage {
	/**
	 * The default value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFile() <em>File</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getFile()
	 * @generated
	 * @ordered
	 */
	protected String file = FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageNumbers() <em>Page
	 * Numbers</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPageNumbers()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_NUMBERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageNumbers() <em>Page Numbers</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPageNumbers()
	 * @generated
	 * @ordered
	 */
	protected String pageNumbers = PAGE_NUMBERS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected PdfPageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PagePackage.Literals.PDF_PAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getFile() {
		return file;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setFile(final String newFile) {
		final String oldFile = file;
		file = newFile;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PagePackage.PDF_PAGE__FILE, oldFile, file));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getPageNumbers() {
		return pageNumbers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setPageNumbers(final String newPageNumbers) {
		final String oldPageNumbers = pageNumbers;
		pageNumbers = newPageNumbers;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PagePackage.PDF_PAGE__PAGE_NUMBERS, oldPageNumbers, pageNumbers));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case PagePackage.PDF_PAGE__FILE:
			return getFile();
		case PagePackage.PDF_PAGE__PAGE_NUMBERS:
			return getPageNumbers();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case PagePackage.PDF_PAGE__FILE:
			setFile((String) newValue);
			return;
		case PagePackage.PDF_PAGE__PAGE_NUMBERS:
			setPageNumbers((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eUnset(final int featureID) {
		switch (featureID) {
		case PagePackage.PDF_PAGE__FILE:
			setFile(FILE_EDEFAULT);
			return;
		case PagePackage.PDF_PAGE__PAGE_NUMBERS:
			setPageNumbers(PAGE_NUMBERS_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean eIsSet(final int featureID) {
		switch (featureID) {
		case PagePackage.PDF_PAGE__FILE:
			return FILE_EDEFAULT == null ? file != null : !FILE_EDEFAULT.equals(file);
		case PagePackage.PDF_PAGE__PAGE_NUMBERS:
			return PAGE_NUMBERS_EDEFAULT == null ? pageNumbers != null : !PAGE_NUMBERS_EDEFAULT.equals(pageNumbers);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return super.toString();
		}

		final StringBuilder result = new StringBuilder(super.toString());
		result.append(" (file: ");
		result.append(file);
		result.append(", pageNumbers: ");
		result.append(pageNumbers);
		result.append(')');
		return result.toString();
	}

} // PdfPageImpl
