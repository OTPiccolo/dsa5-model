/**
 */
package de.otpiccolo.dsa5.model.pdf.content.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.otpiccolo.dsa5.model.pdf.content.ContentPackage;
import de.otpiccolo.dsa5.model.pdf.content.TableContent;
import de.otpiccolo.dsa5.model.pdf.content.TableRow;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Table
 * Content</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link de.otpiccolo.dsa5.model.pdf.content.impl.TableContentImpl#getRows
 * <em>Rows</em>}</li>
 * <li>{@link de.otpiccolo.dsa5.model.pdf.content.impl.TableContentImpl#getColumnCount
 * <em>Column Count</em>}</li>
 * <li>{@link de.otpiccolo.dsa5.model.pdf.content.impl.TableContentImpl#getColumnWeights
 * <em>Column Weights</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TableContentImpl extends MinimalEObjectImpl.Container implements TableContent {
	/**
	 * The cached value of the '{@link #getRows() <em>Rows</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getRows()
	 * @generated
	 * @ordered
	 */
	protected EList<TableRow> rows;

	/**
	 * The default value of the '{@link #getColumnCount() <em>Column
	 * Count</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getColumnCount()
	 * @generated
	 * @ordered
	 */
	protected static final int COLUMN_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getColumnCount() <em>Column Count</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getColumnCount()
	 * @generated
	 * @ordered
	 */
	protected int columnCount = COLUMN_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getColumnWeights() <em>Column
	 * Weights</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getColumnWeights()
	 * @generated
	 * @ordered
	 */
	protected static final String COLUMN_WEIGHTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColumnWeights() <em>Column
	 * Weights</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @see #getColumnWeights()
	 * @generated
	 * @ordered
	 */
	protected String columnWeights = COLUMN_WEIGHTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TableContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContentPackage.Literals.TABLE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public EList<TableRow> getRows() {
		if (rows == null) {
			rows = new EObjectContainmentWithInverseEList<TableRow>(TableRow.class, this, ContentPackage.TABLE_CONTENT__ROWS, ContentPackage.TABLE_ROW__TABLE);
		}
		return rows;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public int getColumnCount() {
		return columnCount;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setColumnCount(final int newColumnCount) {
		final int oldColumnCount = columnCount;
		columnCount = newColumnCount;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.TABLE_CONTENT__COLUMN_COUNT, oldColumnCount, columnCount));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public String getColumnWeights() {
		return columnWeights;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setColumnWeights(final String newColumnWeights) {
		final String oldColumnWeights = columnWeights;
		columnWeights = newColumnWeights;
		if (eNotificationRequired()) {
			eNotify(new ENotificationImpl(this, Notification.SET, ContentPackage.TABLE_CONTENT__COLUMN_WEIGHTS, oldColumnWeights, columnWeights));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, final NotificationChain msgs) {
		switch (featureID) {
		case ContentPackage.TABLE_CONTENT__ROWS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRows()).basicAdd(otherEnd, msgs);
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
		case ContentPackage.TABLE_CONTENT__ROWS:
			return ((InternalEList<?>) getRows()).basicRemove(otherEnd, msgs);
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
		case ContentPackage.TABLE_CONTENT__ROWS:
			return getRows();
		case ContentPackage.TABLE_CONTENT__COLUMN_COUNT:
			return getColumnCount();
		case ContentPackage.TABLE_CONTENT__COLUMN_WEIGHTS:
			return getColumnWeights();
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
		case ContentPackage.TABLE_CONTENT__ROWS:
			getRows().clear();
			getRows().addAll((Collection<? extends TableRow>) newValue);
			return;
		case ContentPackage.TABLE_CONTENT__COLUMN_COUNT:
			setColumnCount((Integer) newValue);
			return;
		case ContentPackage.TABLE_CONTENT__COLUMN_WEIGHTS:
			setColumnWeights((String) newValue);
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
		case ContentPackage.TABLE_CONTENT__ROWS:
			getRows().clear();
			return;
		case ContentPackage.TABLE_CONTENT__COLUMN_COUNT:
			setColumnCount(COLUMN_COUNT_EDEFAULT);
			return;
		case ContentPackage.TABLE_CONTENT__COLUMN_WEIGHTS:
			setColumnWeights(COLUMN_WEIGHTS_EDEFAULT);
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
		case ContentPackage.TABLE_CONTENT__ROWS:
			return rows != null && !rows.isEmpty();
		case ContentPackage.TABLE_CONTENT__COLUMN_COUNT:
			return columnCount != COLUMN_COUNT_EDEFAULT;
		case ContentPackage.TABLE_CONTENT__COLUMN_WEIGHTS:
			return COLUMN_WEIGHTS_EDEFAULT == null ? columnWeights != null : !COLUMN_WEIGHTS_EDEFAULT.equals(columnWeights);
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
		result.append(" (columnCount: ");
		result.append(columnCount);
		result.append(", columnWeights: ");
		result.append(columnWeights);
		result.append(')');
		return result.toString();
	}

} // TableContentImpl
