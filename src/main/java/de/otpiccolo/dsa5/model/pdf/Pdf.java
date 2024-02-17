package de.otpiccolo.dsa5.model.pdf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * @model abstract="false" interface="false"
 */
public interface Pdf extends EObject {

	/**
	 * @model default="1.0"
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link de.otpiccolo.dsa5.model.pdf.Pdf#getVersion
	 * <em>Version</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * @model containment="true"
	 */
	EList<Page> getPages();

	/**
	 * Gets the file name of the source PDF.
	 *
	 * @return The file name.
	 * @model
	 */
	String getPdfSource();

	/**
	 * Sets the value of the '{@link de.otpiccolo.dsa5.model.pdf.Pdf#getPdfSource <em>Pdf Source</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pdf Source</em>' attribute.
	 * @see #getPdfSource()
	 * @generated
	 */
	void setPdfSource(String value);

	/**
	 * Gets the file name of the destination PDF.
	 *
	 * @return The file name.
	 * @model extendedMetaData
	 */
	String getPdfDestination();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.Pdf#getPdfDestination <em>Pdf
	 * Destination</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 *
	 * @param value
	 *            the new value of the '<em>Pdf Destination</em>' attribute.
	 * @see #getPdfDestination()
	 * @generated
	 */
	void setPdfDestination(String value);

}
