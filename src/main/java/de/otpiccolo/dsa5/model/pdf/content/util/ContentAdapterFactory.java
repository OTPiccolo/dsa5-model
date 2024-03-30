/**
 */
package de.otpiccolo.dsa5.model.pdf.content.util;

import de.otpiccolo.dsa5.model.pdf.content.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.otpiccolo.dsa5.model.pdf.content.ContentPackage
 * @generated
 */
public class ContentAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ContentPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ContentPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentSwitch<Adapter> modelSwitch =
		new ContentSwitch<Adapter>() {
			@Override
			public Adapter caseDataContent(DataContent object) {
				return createDataContentAdapter();
			}
			@Override
			public Adapter casePageContent(PageContent object) {
				return createPageContentAdapter();
			}
			@Override
			public Adapter caseParagraphContent(ParagraphContent object) {
				return createParagraphContentAdapter();
			}
			@Override
			public Adapter caseImageContent(ImageContent object) {
				return createImageContentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.otpiccolo.dsa5.model.pdf.content.DataContent <em>Data Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.otpiccolo.dsa5.model.pdf.content.DataContent
	 * @generated
	 */
	public Adapter createDataContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.otpiccolo.dsa5.model.pdf.content.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.otpiccolo.dsa5.model.pdf.content.PageContent
	 * @generated
	 */
	public Adapter createPageContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.otpiccolo.dsa5.model.pdf.content.ParagraphContent <em>Paragraph Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.otpiccolo.dsa5.model.pdf.content.ParagraphContent
	 * @generated
	 */
	public Adapter createParagraphContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.otpiccolo.dsa5.model.pdf.content.ImageContent <em>Image Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.otpiccolo.dsa5.model.pdf.content.ImageContent
	 * @generated
	 */
	public Adapter createImageContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ContentAdapterFactory
