package Fifth;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class SAXTester {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory parserFactor = SAXParserFactory.newInstance();
        SAXParser parser = parserFactor.newSAXParser();
        SAXHandler handler = new SAXHandler();
        Path path = Paths.get("Movies.xml");

        parser.parse(path.toFile(),handler);

        Movies allMovies = handler.getMovies();

        List movies = allMovies.getMovies();
        for(Object movie : movies){
            System.out.println(movie);
        }
    }
}