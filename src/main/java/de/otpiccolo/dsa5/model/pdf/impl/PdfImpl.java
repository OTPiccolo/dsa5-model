/**
 */
package de.otpiccolo.dsa5.model.pdf.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.otpiccolo.dsa5.model.pdf.Pdf;
import de.otpiccolo.dsa5.model.pdf.PdfPackage;
import de.otpiccolo.dsa5.model.pdf.page.Page;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Pdf</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.otpiccolo.dsa5.model.pdf.impl.PdfImpl#getVersion
 * <em>Version</em>}</li>
 * <li>{@link de.otpiccolo.dsa5.model.pdf.impl.PdfImpl#getPages
 * <em>Pages</em>}</li>
 * <li>{@link de.otpiccolo.dsa5.model.pdf.impl.PdfImpl#getPdfSource <em>Pdf
 * Source</em>}</li>
 * <li>{@link de.otpiccolo.dsa5.model.pdf.impl.PdfImpl#getPdfDestination <em>Pdf
 * Destination</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PdfImpl extends MinimalEObjectImpl.Container implements Pdf {
	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPages() <em>Pages</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPages()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> pages;

	/**
	 * The default value of the '{@link #getPdfSource() <em>Pdf Source</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPdfSource()
	 * @generated
	 * @ordered
	 */
	protected static final String PDF_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPdfSource() <em>Pdf Source</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getPdfSource()
	 * @generated
	 * @ordered
	 */
	protected String pdfSource = PDF_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPdfDestination() <em>Pdf
	 * Destination</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #getPdfDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String PDF_DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPdfDestination() <em>Pdf
	 * Destination</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @see #getPdfDestination()
	 * @generated
	 * @ordered
	 */
	protected String pdfDestination = PDF_DESTINATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected PdfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PdfPackage.Literals.PDF;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setVersion(final String newVersion) {
		final String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PdfPackage.PDF__VERSION, oldVersion, version));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<Page> getPages() {
		if (pages == null) {
			pages = new EObjectContainmentEList<Page>(Page.class, this, PdfPackage.PDF__PAGES);
		}
		return pages;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getPdfSource() {
		return pdfSource;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setPdfSource(final String newPdfSource) {
		final String oldPdfSource = pdfSource;
		pdfSource = newPdfSource;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PdfPackage.PDF__PDF_SOURCE, oldPdfSource, pdfSource));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getPdfDestination() {
		return pdfDestination;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setPdfDestination(final String newPdfDestination) {
		final String oldPdfDestination = pdfDestination;
		pdfDestination = newPdfDestination;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, PdfPackage.PDF__PDF_DESTINATION, oldPdfDestination, pdfDestination));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
		switch (featureID) {
		case PdfPackage.PDF__PAGES:
			return ((InternalEList<?>) getPages()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case PdfPackage.PDF__VERSION:
			return getVersion();
		case PdfPackage.PDF__PAGES:
			return getPages();
		case PdfPackage.PDF__PDF_SOURCE:
			return getPdfSource();
		case PdfPackage.PDF__PDF_DESTINATION:
			return getPdfDestination();
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
		case PdfPackage.PDF__VERSION:
			setVersion((String) newValue);
			return;
		case PdfPackage.PDF__PAGES:
			getPages().clear();
			getPages().addAll((Collection<? extends Page>) newValue);
			return;
		case PdfPackage.PDF__PDF_SOURCE:
			setPdfSource((String) newValue);
			return;
		case PdfPackage.PDF__PDF_DESTINATION:
			setPdfDestination((String) newValue);
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
		case PdfPackage.PDF__VERSION:
			setVersion(VERSION_EDEFAULT);
			return;
		case PdfPackage.PDF__PAGES:
			getPages().clear();
			return;
		case PdfPackage.PDF__PDF_SOURCE:
			setPdfSource(PDF_SOURCE_EDEFAULT);
			return;
		case PdfPackage.PDF__PDF_DESTINATION:
			setPdfDestination(PDF_DESTINATION_EDEFAULT);
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
		case PdfPackage.PDF__VERSION:
			return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
		case PdfPackage.PDF__PAGES:
			return pages != null && !pages.isEmpty();
		case PdfPackage.PDF__PDF_SOURCE:
			return PDF_SOURCE_EDEFAULT == null ? pdfSource != null : !PDF_SOURCE_EDEFAULT.equals(pdfSource);
		case PdfPackage.PDF__PDF_DESTINATION:
			return PDF_DESTINATION_EDEFAULT == null ? pdfDestination != null : !PDF_DESTINATION_EDEFAULT.equals(pdfDestination);
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
		result.append(" (version: ");
		result.append(version);
		result.append(", pdfSource: ");
		result.append(pdfSource);
		result.append(", pdfDestination: ");
		result.append(pdfDestination);
		result.append(')');
		return result.toString();
	}

} // PdfImpl
