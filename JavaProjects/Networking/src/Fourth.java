import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Fourth {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new File("Employees.xml"));

        document.getDocumentElement().normalize();

//        Element root = document.getDocumentElement();
//        System.out.println(root.getNodeName());

        NodeList nList = document.getElementsByTagName("employee");

//        HashMap<String, List<String>> map = new HashMap<>();
        HashMap<String, String> map = new HashMap<>();

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node node = nList.item(temp);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
//                if(!map.containsKey(element.getElementsByTagName("location").item(0).getTextContent())) {
//                    List<String> allValues = new ArrayList<>();
//                    allValues.add(element.getElementsByTagName("firstName").item(0).getTextContent());
//                    map.put(element.getElementsByTagName("location").item(0).getTextContent(), allValues);
//                } else {
//                    map.get(element.getElementsByTagName("location").item(0).getTextContent()).add(element.getElementsByTagName("firstName").item(0).getTextContent());
//                }
                map.put(element.getElementsByTagName("firstName").item(0).getTextContent(), element.getElementsByTagName("location").item(0).getTextContent());
                System.out.println("Employee id : "    + element.getAttribute("id"));
                System.out.println("First Name : "  + element.getElementsByTagName("firstName").item(0).getTextContent());
                System.out.println("Last Name : "   + element.getElementsByTagName("lastName").item(0).getTextContent());
                System.out.println("Location : "    + element.getElementsByTagName("location").item(0).getTextContent());
                System.out.println("");
            }
        }

//        System.out.println(map.entrySet());

        map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream()
                .forEach(System.out::println);
    }
}
