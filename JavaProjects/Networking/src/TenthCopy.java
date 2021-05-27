import Ninth.District;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class TenthCopy {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("Cars.xml"));
        document.getDocumentElement().normalize();

        HashMap<List<String>, String> map = new HashMap<>();
        String company;

        NodeList nodeList = document.getElementsByTagName("supercars");
        if (nodeList != null && nodeList.getLength() > 0) {
            for (int j = 0; j < nodeList.getLength(); j++) {
                Node node2 = nodeList.item(j);
                if (node2.getNodeType() == Node.ELEMENT_NODE) {
                    Element e2 = (Element) node2;
                    company = e2.getAttribute("company");

                    ArrayList<String> carnames = new ArrayList<>();
                    NodeList nodeList2 = e2.getElementsByTagName("carname");
                    if (nodeList2 != null && nodeList2.getLength() > 0) {
                        for (int k = 0; k < nodeList2.getLength(); k++) {
                            Node node3 = nodeList2.item(k);
                            if (node3.getNodeType() == Node.ELEMENT_NODE) {
                                Element e3 = (Element) node3;
                                carnames.add(e3.getAttribute("name"));
                            }
                        }
                        map.put(carnames, company);
                    }
                }
            }
        }
        System.out.println(map.entrySet().toString());
    }
}
