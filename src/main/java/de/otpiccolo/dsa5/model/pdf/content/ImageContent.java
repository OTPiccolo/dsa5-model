package de.otpiccolo.dsa5.model.pdf.content;

/**
 * Content to display an image.
 *
 * @model abstract="false" interface="false"
 */
public interface ImageContent extends PageContent {

	/**
	 * Gets the path to the image to use.
	 *
	 * @return The path to the image to use. Can either be a file path, or a
	 *         URL.
	 * @model
	 */
	String getImagePath();

	/**
	 * Sets the value of the
	 * '{@link de.otpiccolo.dsa5.model.pdf.content.ImageContent#getImagePath
	 * <em>Image Path</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 *
	 * @param value
	 *            the new value of the '<em>Image Path</em>' attribute.
	 * @see #getImagePath()
	 * @generated
	 */
	void setImagePath(String value);

}
