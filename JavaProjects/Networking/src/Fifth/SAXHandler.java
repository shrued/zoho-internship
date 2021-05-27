package Fifth;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class SAXHandler extends DefaultHandler{

    Movies movies = new Movies();
    List movieList = new ArrayList();
    Movie movie = null;
    String content = null;

    public void startElement(String namespaceURI, String localName, String qname, Attributes attributes) {
        if(qname.equals("movies")) {
            String moviesName = attributes.getValue("id");
            movies.setId(moviesName);
        } else if(qname.equals("movie")) {
            movie = new Movie();
        }
    }

    public void endElement(String namespaceURI, String localName, String qname) {
        switch(qname) {
            case "movie":
                movieList.add(movie);
                break;
            case "title":
                movie.setTitle(content);
                break;
            case "director":
                movie.setDirector(content);
                break;
            case "released":
                movie.setReleased(Integer.parseInt(content));
                break;
            case "movies":
                movies.setMovies(movieList);
                break;
        }
    }

    public void characters(char []ch, int start, int length) {
        content = new String(ch, start, length);
    }

    public Movies getMovies() {
        return movies;
    }
}
