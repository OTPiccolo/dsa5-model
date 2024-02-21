package de.otpiccolo.dsa5.cli.pdf;

/**
 * An exception that is thrown when the factory could not create the requested
 * object.
 */
public class FactoryException extends Exception {

	private static final long serialVersionUID = 3643079729990439923L;

	/**
	 * Constructor.
	 *
	 * @param message
	 *            The message of the exception.
	 */
	public FactoryException(final String message) {
		super(message);
	}

	/**
	 * Constructor.
	 *
	 * @param message
	 *            The message of the exception.
	 * @param cause
	 *            The underlying cause.
	 */
	public FactoryException(final String message, final Throwable cause) {
		super(message, cause);
	}

}
