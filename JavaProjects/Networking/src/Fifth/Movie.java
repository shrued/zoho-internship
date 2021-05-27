package Fifth;

public class Movie {
    private String title;
    private String director;
    private int released;

    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    public int getReleased() {
        return released;
    }
    
    public void setReleased(int released) {
        this.released = released;
    }

    public String toString() {
        return "Movie [title=" + title + ", director=" + director
                + ", released=" + released + "]";
    }

}
