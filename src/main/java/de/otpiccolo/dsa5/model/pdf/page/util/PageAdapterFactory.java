/**
 */
package de.otpiccolo.dsa5.model.pdf.page.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import de.otpiccolo.dsa5.model.pdf.page.DefaultPage;
import de.otpiccolo.dsa5.model.pdf.page.Page;
import de.otpiccolo.dsa5.model.pdf.page.PagePackage;
import de.otpiccolo.dsa5.model.pdf.page.PdfPage;
import de.otpiccolo.dsa5.model.pdf.page.PredefinedPage;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 *
 * @see de.otpiccolo.dsa5.model.pdf.page.PagePackage
 * @generated
 */
public class PageAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected static PagePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @generated
	 */
	public PageAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PagePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 *
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(final Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected PageSwitch<Adapter> modelSwitch = new PageSwitch<Adapter>() {
		@Override
		public Adapter caseDefaultPage(final DefaultPage object) {
			return createDefaultPageAdapter();
		}

		@Override
		public Adapter casePage(final Page object) {
			return createPageAdapter();
		}

		@Override
		public Adapter casePdfPage(final PdfPage object) {
			return createPdfPageAdapter();
		}

		@Override
		public Adapter casePredefinedPage(final PredefinedPage object) {
			return createPredefinedPageAdapter();
		}

		@Override
		public Adapter defaultCase(final EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(final Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.DefaultPage <em>Default
	 * Page</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see de.otpiccolo.dsa5.model.pdf.page.DefaultPage
	 * @generated
	 */
	public Adapter createDefaultPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.Page <em>Page</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see de.otpiccolo.dsa5.model.pdf.page.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PdfPage <em>Pdf Page</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see de.otpiccolo.dsa5.model.pdf.page.PdfPage
	 * @generated
	 */
	public Adapter createPdfPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PredefinedPage <em>Predefined
	 * Page</em>}'. <!-- begin-user-doc --> This default implementation returns
	 * null so that we can easily ignore cases; it's useful to ignore a case
	 * when inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @see de.otpiccolo.dsa5.model.pdf.page.PredefinedPage
	 * @generated
	 */
	public Adapter createPredefinedPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 *
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // PageAdapterFactory
