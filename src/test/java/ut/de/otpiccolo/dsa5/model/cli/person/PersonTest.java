package ut.de.otpiccolo.dsa5.model.cli.person;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLResource.XMLInfo;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLInfoImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import de.otpiccolo.dsa5.model.cli.person.Thyra;
import de.otpiccolo.dsa5.model.pdf.Pdf;
import de.otpiccolo.dsa5.model.pdf.PdfPackage;
import de.otpiccolo.dsa5.model.pdf.content.ContentPackage;

@SuppressWarnings("javadoc")
public class PersonTest {

	@Test
	@Disabled
	public void writeThyra() throws Exception {
		final String saveFile = "C:\\Users\\OT Piccolo\\Desktop\\temp\\Thyra.xml";
		final String source = "C:\\Users\\OT Piccolo\\Desktop\\Thyra.pdf";
		final String destination = "C:\\Users\\OT Piccolo\\Desktop\\Thyra mit Infos.pdf";

		final Thyra thyra = new Thyra();
		final Pdf pdf = thyra.getPdf();
		pdf.setPdfSource(source);
		pdf.setPdfDestination(destination);

		savePdf(pdf, saveFile);

		Desktop.getDesktop().open(new File(saveFile));
	}

	private void savePdf(final Pdf pdf, final String destination) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xml", new XMIResourceFactoryImpl());
		final ResourceSet resourceSet = new ResourceSetImpl();
		final Resource resource = resourceSet.createResource(URI.createFileURI(destination));
		resource.getContents().add(pdf);

		final Map<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8");

		final XMLMapImpl map = new XMLMapImpl();
		final XMLInfoImpl infoElement = new XMLInfoImpl();
		infoElement.setXMLRepresentation(XMLInfo.ELEMENT);
		map.add(PdfPackage.eINSTANCE.getPdf_PdfSource(), infoElement);
		map.add(PdfPackage.eINSTANCE.getPdf_PdfDestination(), infoElement);
		map.add(PdfPackage.eINSTANCE.getPage_Title(), infoElement);
		map.add(ContentPackage.eINSTANCE.getParagraphContent_Title(), infoElement);
		saveOptions.put(XMLResource.OPTION_XML_MAP, map);
		saveOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);

		try {
			resource.save(saveOptions);
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

}
