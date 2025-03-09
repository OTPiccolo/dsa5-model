package de.otpiccolo.dsa5.model.pdf.page;

import java.io.File;

/**
 * @model abstract="false" interface="false"
 */
public interface PdfPage extends Page {

	/**
	 * @model
	 */
	File getFile();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PdfPage#getFile <em>File</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>File</em>' attribute.
	 * @see #getFile()
	 * @generated
	 */
	void setFile(File value);

	/**
	 * @model
	 */
	String getPageNumbers();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.page.PdfPage#getPageNumbers <em>Page
	 * Numbers</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Page Numbers</em>' attribute.
	 * @see #getPageNumbers()
	 * @generated
	 */
	void setPageNumbers(String value);

}
