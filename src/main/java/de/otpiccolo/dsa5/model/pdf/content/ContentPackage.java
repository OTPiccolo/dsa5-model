/**
 */
package de.otpiccolo.dsa5.model.pdf.content;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.otpiccolo.dsa5.model.pdf.content.ContentFactory
 * @model kind="package"
 * @generated
 */
public interface ContentPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "content";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///de/otpiccolo/dsa5/model/pdf/content.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "de.otpiccolo.dsa5.model.pdf.content";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContentPackage eINSTANCE = de.otpiccolo.dsa5.model.pdf.content.impl.ContentPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.otpiccolo.dsa5.model.pdf.content.PageContent <em>Page Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.otpiccolo.dsa5.model.pdf.content.PageContent
	 * @see de.otpiccolo.dsa5.model.pdf.content.impl.ContentPackageImpl#getPageContent()
	 * @generated
	 */
	int PAGE_CONTENT = 1;

	/**
	 * The number of structural features of the '<em>Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Page Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.otpiccolo.dsa5.model.pdf.content.impl.DataContentImpl <em>Data Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.otpiccolo.dsa5.model.pdf.content.impl.DataContentImpl
	 * @see de.otpiccolo.dsa5.model.pdf.content.impl.ContentPackageImpl#getDataContent()
	 * @generated
	 */
	int DATA_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTENT__CONTENT = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTENT__CONTENT_TYPE = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Data Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTENT_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Data Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONTENT_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.otpiccolo.dsa5.model.pdf.content.impl.ParagraphContentImpl <em>Paragraph Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.otpiccolo.dsa5.model.pdf.content.impl.ParagraphContentImpl
	 * @see de.otpiccolo.dsa5.model.pdf.content.impl.ContentPackageImpl#getParagraphContent()
	 * @generated
	 */
	int PARAGRAPH_CONTENT = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_CONTENT__TITLE = PAGE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Paragraphs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_CONTENT__PARAGRAPHS = PAGE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Paragraph Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_CONTENT_FEATURE_COUNT = PAGE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Paragraph Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAGRAPH_CONTENT_OPERATION_COUNT = PAGE_CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.otpiccolo.dsa5.model.pdf.content.ContentType <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.otpiccolo.dsa5.model.pdf.content.ContentType
	 * @see de.otpiccolo.dsa5.model.pdf.content.impl.ContentPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 3;


	/**
	 * Returns the meta object for class '{@link de.otpiccolo.dsa5.model.pdf.content.DataContent <em>Data Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Content</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.content.DataContent
	 * @generated
	 */
	EClass getDataContent();

	/**
	 * Returns the meta object for the attribute '{@link de.otpiccolo.dsa5.model.pdf.content.DataContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.content.DataContent#getContent()
	 * @see #getDataContent()
	 * @generated
	 */
	EAttribute getDataContent_Content();

	/**
	 * Returns the meta object for the attribute '{@link de.otpiccolo.dsa5.model.pdf.content.DataContent#getContentType <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content Type</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.content.DataContent#getContentType()
	 * @see #getDataContent()
	 * @generated
	 */
	EAttribute getDataContent_ContentType();

	/**
	 * Returns the meta object for class '{@link de.otpiccolo.dsa5.model.pdf.content.PageContent <em>Page Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page Content</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.content.PageContent
	 * @generated
	 */
	EClass getPageContent();

	/**
	 * Returns the meta object for class '{@link de.otpiccolo.dsa5.model.pdf.content.ParagraphContent <em>Paragraph Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paragraph Content</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.content.ParagraphContent
	 * @generated
	 */
	EClass getParagraphContent();

	/**
	 * Returns the meta object for the attribute '{@link de.otpiccolo.dsa5.model.pdf.content.ParagraphContent#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.content.ParagraphContent#getTitle()
	 * @see #getParagraphContent()
	 * @generated
	 */
	EAttribute getParagraphContent_Title();

	/**
	 * Returns the meta object for the attribute list '{@link de.otpiccolo.dsa5.model.pdf.content.ParagraphContent#getParagraphs <em>Paragraphs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Paragraphs</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.content.ParagraphContent#getParagraphs()
	 * @see #getParagraphContent()
	 * @generated
	 */
	EAttribute getParagraphContent_Paragraphs();

	/**
	 * Returns the meta object for enum '{@link de.otpiccolo.dsa5.model.pdf.content.ContentType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see de.otpiccolo.dsa5.model.pdf.content.ContentType
	 * @generated
	 */
	EEnum getContentType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContentFactory getContentFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.otpiccolo.dsa5.model.pdf.content.impl.DataContentImpl <em>Data Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.otpiccolo.dsa5.model.pdf.content.impl.DataContentImpl
		 * @see de.otpiccolo.dsa5.model.pdf.content.impl.ContentPackageImpl#getDataContent()
		 * @generated
		 */
		EClass DATA_CONTENT = eINSTANCE.getDataContent();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONTENT__CONTENT = eINSTANCE.getDataContent_Content();

		/**
		 * The meta object literal for the '<em><b>Content Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_CONTENT__CONTENT_TYPE = eINSTANCE.getDataContent_ContentType();

		/**
		 * The meta object literal for the '{@link de.otpiccolo.dsa5.model.pdf.content.PageContent <em>Page Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.otpiccolo.dsa5.model.pdf.content.PageContent
		 * @see de.otpiccolo.dsa5.model.pdf.content.impl.ContentPackageImpl#getPageContent()
		 * @generated
		 */
		EClass PAGE_CONTENT = eINSTANCE.getPageContent();

		/**
		 * The meta object literal for the '{@link de.otpiccolo.dsa5.model.pdf.content.impl.ParagraphContentImpl <em>Paragraph Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.otpiccolo.dsa5.model.pdf.content.impl.ParagraphContentImpl
		 * @see de.otpiccolo.dsa5.model.pdf.content.impl.ContentPackageImpl#getParagraphContent()
		 * @generated
		 */
		EClass PARAGRAPH_CONTENT = eINSTANCE.getParagraphContent();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_CONTENT__TITLE = eINSTANCE.getParagraphContent_Title();

		/**
		 * The meta object literal for the '<em><b>Paragraphs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAGRAPH_CONTENT__PARAGRAPHS = eINSTANCE.getParagraphContent_Paragraphs();

		/**
		 * The meta object literal for the '{@link de.otpiccolo.dsa5.model.pdf.content.ContentType <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.otpiccolo.dsa5.model.pdf.content.ContentType
		 * @see de.otpiccolo.dsa5.model.pdf.content.impl.ContentPackageImpl#getContentType()
		 * @generated
		 */
		EEnum CONTENT_TYPE = eINSTANCE.getContentType();

	}

} //ContentPackage
