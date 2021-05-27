package Ninth;

import org.w3c.dom.*;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class DummyNew {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("Tourism.xml"));
        document.getDocumentElement().normalize();

//      Map<country, Map<state, List<District>>>
        Map<String, Map<List<District>, String>> map = new HashMap<>();

        String country, state;

        NodeList nList = document.getElementsByTagName("country");
        if (nList != null && nList.getLength() > 0) {
            for (int i = 0; i < nList.getLength(); i++) {
                Node node = nList.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element e = (Element) node;
                    country = e.getAttribute("name");

                    Map<List<District>, String> subMap = new HashMap<>();
                    NodeList nodeList = e.getElementsByTagName("state");
                    if (nodeList != null && nodeList.getLength() > 0) {
                        for (int j = 0; j < nList.getLength(); j++) {
                            Node node2 = nodeList.item(j);
                            if (node2.getNodeType() == Node.ELEMENT_NODE) {
                                Element e2 = (Element) node2;
                                state = e2.getAttribute("name");

                                NodeList nodeList2 = e2.getElementsByTagName("dist");
                                District dist1;
                                if (nodeList2 != null && nodeList2.getLength() > 0) {
                                    for (int k = 0; k < nodeList2.getLength(); k++) {
                                        Node node3 = nodeList2.item(k);
                                        ArrayList<District> deets = new ArrayList<>();
                                        if (node3.getNodeType() == Node.ELEMENT_NODE) {
                                            Element e3 = (Element) node3;
                                            dist1 = new District(e3.getAttribute("name"), e3.getAttribute("pincode"), e3.getAttribute("capital"), Arrays.asList(e3.getAttribute("tourism")));
                                            deets.add(dist1);
                                            subMap.put(deets, state);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    map.put(country, subMap);
                }
            }
        }

        System.out.println(map.entrySet().toString());
        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry);
            //System.out.println(entry.getKey() + "=[" + entry.getValue() + "]");
        }

//        Map<Map<List<District>, state>, country>
//        Map<Map<List<District>, String>, String> map = new HashMap<>();

//        <Map<List<District>, String>, String>
//        Map<List<District>, String> + String
//        List<District> + String + String

        Set<String> allStates = new HashSet<>();

        for (Map.Entry<String, Map<List<District>, String>> mapping : map.entrySet()) {
            String countries = mapping.getKey();
            for(Map.Entry<List<District>, String> innerMapping : mapping.getValue().entrySet()) {
                String states = innerMapping.getValue();
//        1.List the states of India
                if(countries.equals("India")) {
                    allStates.add(states);
                }

                for(District districts : innerMapping.getKey()) {

//        2. What is  the capital of tamilnadu
                    if(states.equals("Tamil Nadu")) {
                        if(districts.getCapital().equals("true")) {
                            System.out.println(districts.getName());
                        }
                    }

//        3. List down the tourist places of Madurai.
                    if(districts.getName().equals("Madurai")) {
                        System.out.println(districts.getTourism());
                    }
                }
            }
        }
        System.out.println(allStates);
    }
}