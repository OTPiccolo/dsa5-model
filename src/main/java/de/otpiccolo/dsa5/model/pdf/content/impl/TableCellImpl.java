/**
 */
package de.otpiccolo.dsa5.model.pdf.content.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.otpiccolo.dsa5.model.pdf.content.ContentPackage;
import de.otpiccolo.dsa5.model.pdf.content.PageContent;
import de.otpiccolo.dsa5.model.pdf.content.TableCell;
import de.otpiccolo.dsa5.model.pdf.content.TableRow;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Table
 * Cell</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.otpiccolo.dsa5.model.pdf.content.impl.TableCellImpl#getRow
 * <em>Row</em>}</li>
 * <li>{@link de.otpiccolo.dsa5.model.pdf.content.impl.TableCellImpl#getContent
 * <em>Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableCellImpl extends MinimalEObjectImpl.Container implements TableCell {
	/**
	 * The cached value of the '{@link #getContent() <em>Content</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getContent()
	 * @generated
	 * @ordered
	 */
	protected PageContent content;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TableCellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.TABLE_CELL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public TableRow getRow() {
		if (eContainerFeatureID() != ContentPackage.TABLE_CELL__ROW) {
			return null;
		}
		return (TableRow) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetRow(final TableRow newRow, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newRow, ContentPackage.TABLE_CELL__ROW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setRow(final TableRow newRow) {
		if (newRow != eInternalContainer() || (eContainerFeatureID() != ContentPackage.TABLE_CELL__ROW && newRow != null)) {
			if (EcoreUtil.isAncestor(this, newRow)) {
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			}
			NotificationChain msgs = null;
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			if (newRow != null) {
				msgs = ((InternalEObject) newRow).eInverseAdd(this, ContentPackage.TABLE_ROW__CELLS, TableRow.class, msgs);
			}
			msgs = basicSetRow(newRow, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.TABLE_CELL__ROW, newRow, newRow));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public PageContent getContent() {
		return content;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public NotificationChain basicSetContent(final PageContent newContent, NotificationChain msgs) {
		final PageContent oldContent = content;
		content = newContent;
		if (eNotificationRequired()) {
			final ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ContentPackage.TABLE_CELL__CONTENT, oldContent, newContent);
			if (msgs == null) {
				msgs = notification;
			} else {
				msgs.add(notification);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setContent(final PageContent newContent) {
		if (newContent != content) {
			NotificationChain msgs = null;
			if (content != null) {
				msgs = ((InternalEObject) content).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ContentPackage.TABLE_CELL__CONTENT, null, msgs);
			}
			if (newContent != null) {
				msgs = ((InternalEObject) newContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ContentPackage.TABLE_CELL__CONTENT, null, msgs);
			}
			msgs = basicSetContent(newContent, msgs);
			if (msgs != null) {
				msgs.dispatch();
			}
		} else if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.TABLE_CELL__CONTENT, newContent, newContent));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ContentPackage.TABLE_CELL__ROW:
			if (eInternalContainer() != null) {
				msgs = eBasicRemoveFromContainer(msgs);
			}
			return basicSetRow((TableRow) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
		switch (featureID) {
		case ContentPackage.TABLE_CELL__ROW:
			return basicSetRow(null, msgs);
		case ContentPackage.TABLE_CELL__CONTENT:
			return basicSetContent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case ContentPackage.TABLE_CELL__ROW:
			return eInternalContainer().eInverseRemove(this, ContentPackage.TABLE_ROW__CELLS, TableRow.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
		switch (featureID) {
		case ContentPackage.TABLE_CELL__ROW:
			return getRow();
		case ContentPackage.TABLE_CELL__CONTENT:
			return getContent();
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
		case ContentPackage.TABLE_CELL__ROW:
			setRow((TableRow) newValue);
			return;
		case ContentPackage.TABLE_CELL__CONTENT:
			setContent((PageContent) newValue);
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
		case ContentPackage.TABLE_CELL__ROW:
			setRow((TableRow) null);
			return;
		case ContentPackage.TABLE_CELL__CONTENT:
			setContent((PageContent) null);
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
		case ContentPackage.TABLE_CELL__ROW:
			return getRow() != null;
		case ContentPackage.TABLE_CELL__CONTENT:
			return content != null;
		}
		return super.eIsSet(featureID);
	}

} // TableCellImpl
