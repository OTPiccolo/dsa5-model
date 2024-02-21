package de.otpiccolo.dsa5.cli;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.otpiccolo.dsa5.cli.pdf.FactoryException;
import de.otpiccolo.dsa5.cli.pdf.PdfBridge;
import de.otpiccolo.dsa5.model.pdf.Pdf;
import de.otpiccolo.dsa5.model.pdf.PdfPackage;
import de.otpiccolo.dsa5.pdf.PdfWriter;

/**
 * CLI to write PDF from a character file.
 */
public class DsaPdfCli {

	/**
	 * Main method.
	 *
	 * @param args
	 *            First argument is mandatory for the file of model that
	 *            contains data. Second argument is optional for the destination
	 *            of the PDF file, overwriting the destination specified in the
	 *            data file. Third argument is optional for the source of the
	 *            PDF file, overwriting the source specified in the data file.
	 */
	public static void main(final String[] args) {
		if (isHelp(args)) {
			printHelp();
			System.exit(0);
		}

		Pdf pdf;
		try {
			System.out.println("Lese Charakter-Daten von: " + args[0]);
			pdf = readPdf(args[0]);
		} catch (final IOException e) {
			e.printStackTrace();
			System.exit(1);
			return;
		}

		if (args.length > 1) {
			System.out.println("Ziel-Datei zusätzlich spezifiziert: " + args[1]);
			pdf.setPdfDestination(args[1]);
		}
		if (args.length > 2) {
			System.out.println("Urspungs-Datei zusätzlich spezifiziert: " + args[2]);
			pdf.setPdfSource(args[2]);
		}

		final DsaPdfCli cli = new DsaPdfCli(pdf);
		try {
			System.out.println("Beginne mit der Generierung des PDFs.");
			cli.writePdf();
		} catch (final Exception e) {
			e.printStackTrace();
			System.exit(1);
			return;
		}

		System.out.println("Generierung des PDFs erfolgreich beendet.");
		try {
			System.out.println("Öffne PDF zur Ansicht.");
			Desktop.getDesktop().open(new File(pdf.getPdfDestination()));
		} catch (final IOException e) {
			e.printStackTrace();
			System.exit(2);
			return;
		}
	}

	private static final Pdf readPdf(final String file) throws IOException {
		final ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(PdfPackage.eNS_URI, PdfPackage.eINSTANCE);

		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
		final Resource resource = resourceSet.createResource(URI.createFileURI(file));
		resource.load(null);

		return (Pdf) resource.getContents().get(0);
	}

	private static final boolean isHelp(final String[] args) {
		final String[] helpStrings = new String[] { "/?", "-?", "--help" };
		Arrays.sort(helpStrings);
		if (args == null || args.length == 0) {
			return true;
		}
		for (final String arg : args) {
			if (Arrays.binarySearch(helpStrings, arg) >= 0) {
				return true;
			}
		}
		return false;
	}

	private static final void printHelp() {
		System.out.println("Liest Informationen zu einem DSA Charakter und wandelt diese in ein PDF um.");
		System.out.println();
		System.out.println("Parameter: Charakter-Datei [PDF-Ziel] [PDF-Quelle]");
		System.out.println();
		System.out.println("  Charakter-Datei \t Datei zu den Informationen des DSA Charakters. Angabe erforderlich.");
		System.out.println("  PDF-Ziel \t\t Datei in dies das PDF geschrieben werden soll. Angabe optional, ansonsten wird Ziel aus der Charakter-Datei genommen.");
		System.out.println("  PDF-Quelle \t\t Datei die an das generierte PDF vorangestellt wird. Angabe optional, ansonsten wird Quelle aus der Charakter-Datei genommen, falls vorhanden.");
	}

	private final Pdf pdf;

	private DsaPdfCli(final Pdf pdf) {
		this.pdf = pdf;
	}

	/**
	 * Writes the PDF.
	 *
	 * @throws IOException
	 *             If an exception happens on reading the source PDF, or writing
	 *             the generated PDF.
	 * @throws FactoryException
	 *             If an exception happens creating the content of the PDF.
	 */
	public void writePdf() throws IOException, FactoryException {
		final PdfWriter writer = PdfBridge.createWriter(pdf);
		writer.writeDocument();
	}

}
