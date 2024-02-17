/**
 */
package de.otpiccolo.dsa5.model.pdf.content.impl;

import de.otpiccolo.dsa5.model.pdf.content.ContentPackage;
import de.otpiccolo.dsa5.model.pdf.content.ParagraphContent;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Paragraph Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.otpiccolo.dsa5.model.pdf.content.impl.ParagraphContentImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link de.otpiccolo.dsa5.model.pdf.content.impl.ParagraphContentImpl#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParagraphContentImpl extends MinimalEObjectImpl.Container implements ParagraphContent {
	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParagraphs() <em>Paragraphs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paragraphs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParagraphContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.PARAGRAPH_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.PARAGRAPH_CONTENT__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getParagraphs() {
		if (paragraphs == null) {
			paragraphs = new EDataTypeUniqueEList<String>(String.class, this, ContentPackage.PARAGRAPH_CONTENT__PARAGRAPHS);
		}
		return paragraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContentPackage.PARAGRAPH_CONTENT__TITLE:
				return getTitle();
			case ContentPackage.PARAGRAPH_CONTENT__PARAGRAPHS:
				return getParagraphs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ContentPackage.PARAGRAPH_CONTENT__TITLE:
				setTitle((String)newValue);
				return;
			case ContentPackage.PARAGRAPH_CONTENT__PARAGRAPHS:
				getParagraphs().clear();
				getParagraphs().addAll((Collection<? extends String>)newValue);
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
			case ContentPackage.PARAGRAPH_CONTENT__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case ContentPackage.PARAGRAPH_CONTENT__PARAGRAPHS:
				getParagraphs().clear();
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
			case ContentPackage.PARAGRAPH_CONTENT__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case ContentPackage.PARAGRAPH_CONTENT__PARAGRAPHS:
				return paragraphs != null && !paragraphs.isEmpty();
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
		result.append(" (title: ");
		result.append(title);
		result.append(", paragraphs: ");
		result.append(paragraphs);
		result.append(')');
		return result.toString();
	}

} //ParagraphContentImpl
