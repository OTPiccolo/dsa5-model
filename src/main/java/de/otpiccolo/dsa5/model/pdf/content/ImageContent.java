package de.otpiccolo.dsa5.model.pdf.content;

import java.io.File;

/**
 * Content to display an image.
 *
 * @model abstract="false" interface="false"
 */
public interface ImageContent extends PageContent {

	/**
	 * Gets the file of the image to use.
	 *
	 * @return The file of the image to use.
	 * @model
	 */
	File getImageFile();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.content.ImageContent#getImageFile
	 * <em>Image File</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Image File</em>' attribute.
	 * @see #getImageFile()
	 * @generated
	 */
	void setImageFile(File value);

}
