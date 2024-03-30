/**
 */
package de.otpiccolo.dsa5.model.pdf.content.impl;

import de.otpiccolo.dsa5.model.pdf.content.ContentPackage;
import de.otpiccolo.dsa5.model.pdf.content.ImageContent;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Image Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.otpiccolo.dsa5.model.pdf.content.impl.ImageContentImpl#getImagePath <em>Image Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImageContentImpl extends MinimalEObjectImpl.Container implements ImageContent {
	/**
	 * The default value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagePath() <em>Image Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagePath()
	 * @generated
	 * @ordered
	 */
	protected String imagePath = IMAGE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImageContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.IMAGE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImagePath(String newImagePath) {
		String oldImagePath = imagePath;
		imagePath = newImagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.IMAGE_CONTENT__IMAGE_PATH, oldImagePath, imagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.IMAGE_CONTENT__IMAGE_PATH:
				return getImagePath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentPackage.IMAGE_CONTENT__IMAGE_PATH:
				setImagePath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ContentPackage.IMAGE_CONTENT__IMAGE_PATH:
				setImagePath(IMAGE_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ContentPackage.IMAGE_CONTENT__IMAGE_PATH:
				return IMAGE_PATH_EDEFAULT == null ? imagePath != null : !IMAGE_PATH_EDEFAULT.equals(imagePath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (imagePath: ");
		result.append(imagePath);
		result.append(')');
		return result.toString();
	}

} //ImageContentImpl
