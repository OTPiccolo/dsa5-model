/**
 */
package de.otpiccolo.dsa5.model.pdf.content.impl;

import java.io.File;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import de.otpiccolo.dsa5.model.pdf.content.ContentPackage;
import de.otpiccolo.dsa5.model.pdf.content.ImageContent;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Image
 * Content</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.otpiccolo.dsa5.model.pdf.content.impl.ImageContentImpl#getImageFile
 * <em>Image File</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageContentImpl extends MinimalEObjectImpl.Container implements ImageContent {
	/**
	 * The default value of the '{@link #getImageFile() <em>Image File</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getImageFile()
	 * @generated
	 * @ordered
	 */
	protected static final File IMAGE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageFile() <em>Image File</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getImageFile()
	 * @generated
	 * @ordered
	 */
	protected File imageFile = IMAGE_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ImageContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.IMAGE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public File getImageFile() {
		return imageFile;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setImageFile(final File newImageFile) {
		final File oldImageFile = imageFile;
		imageFile = newImageFile;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.IMAGE_CONTENT__IMAGE_FILE, oldImageFile, imageFile));
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
		case ContentPackage.IMAGE_CONTENT__IMAGE_FILE:
			return getImageFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void eSet(final int featureID, final Object newValue) {
		switch (featureID) {
		case ContentPackage.IMAGE_CONTENT__IMAGE_FILE:
			setImageFile((File) newValue);
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
		case ContentPackage.IMAGE_CONTENT__IMAGE_FILE:
			setImageFile(IMAGE_FILE_EDEFAULT);
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
		case ContentPackage.IMAGE_CONTENT__IMAGE_FILE:
			return IMAGE_FILE_EDEFAULT == null ? imageFile != null : !IMAGE_FILE_EDEFAULT.equals(imageFile);
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
		result.append(" (imageFile: ");
		result.append(imageFile);
		result.append(')');
		return result.toString();
	}

} // ImageContentImpl
