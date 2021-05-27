//import Ninth.District;
//import org.w3c.dom.Document;
//import org.w3c.dom.Element;
//import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
//import org.xml.sax.SAXException;
//
//import javax.xml.parsers.DocumentBuilder;
//import javax.xml.parsers.DocumentBuilderFactory;
//import javax.xml.parsers.ParserConfigurationException;
//import java.io.File;
//import java.io.IOException;
//import java.util.*;
//
//public class Tenth {
//    public static Element group(NodeList nodeList, int j, String type) {
//        Node node2 = nodeList.item(j);
//        Element e2 = (Element) node2;
////        group(nodeList, j, type);
//        return e2;
//    }
//
//    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
//        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//        DocumentBuilder builder = factory.newDocumentBuilder();
//        Document document = builder.parse(new File("Cars.xml"));
//        document.getDocumentElement().normalize();
//
//        HashMap<List<String>, String> map = new HashMap<>();
//        String company, value;
//
//        Element E;
//
//        NodeList nodeList = document.getElementsByTagName("supercars");
//        if (nodeList != null && nodeList.getLength() > 0) {
//            for (int j = 0; j < nodeList.getLength(); j++) {
//                E = group(nodeList, j, "company");
//                company = E.getAttribute("company");
//            }
//
//            ArrayList<String> carnames = new ArrayList<>();
//            NodeList nodeList2 = E.getElementsByTagName("carname");
//            if (nodeList2 != null && nodeList2.getLength() > 0) {
//                for (int k = 0; k < nodeList2.getLength(); k++) {
//                    E = group(nodeList2, k, "name");
//                    carnames.add(E.getAttribute("name"));
//                }
//                map.put(carnames, "company");
//            }
//        }
//        System.out.println(map.entrySet().toString());
//    }
//}
