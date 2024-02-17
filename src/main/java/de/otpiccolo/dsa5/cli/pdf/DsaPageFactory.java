package de.otpiccolo.dsa5.cli.pdf;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import de.otpiccolo.dsa5.pdf.page.DefaultPage;
import de.otpiccolo.dsa5.pdf.page.IPage;

/**
 * Factory to generate DSA page.
 */
public class DsaPageFactory {

	private static final Map<String, Supplier<IPage>> map;

	static {
		map = new HashMap<>();
		map.put("Default", DefaultPage::new);
	}

	/**
	 * Creates a DSA page for the given page type.
	 *
	 * @param pageType
	 *            The page type.
	 * @return The created DSA page.
	 */
	public static final DefaultPage createPage(final String pageType) {
		final Supplier<IPage> supplier = map.get(pageType);
		if (supplier == null) {
			throw new IllegalArgumentException("Unknown page type: " + pageType);
		}
		return (DefaultPage) supplier.get();

	}

}
