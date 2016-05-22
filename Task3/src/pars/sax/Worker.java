package pars.sax;

import libr.Library;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.io.IOException;
import java.util.List;

public class Worker {
	public static void main(String[] args) throws SAXException, IOException,
			jdk.internal.org.xml.sax.SAXException {
		XMLReader reader = XMLReaderFactory.createXMLReader();
		Sax handler = new Sax();
		reader.setContentHandler(handler);
		reader.parse(new InputSource("res/XML_1.xml"));
		List<Library> libraries = handler.getLibraries();
		System.out.println("Count of libraries: " + libraries.size());
	}
}