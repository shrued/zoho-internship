package Ninth;

import java.util.List;

public class District {
    private String name;
    private String pincode;
    private String capital;
    private List<String> tourism;

    public District(String name, String pincode, String capital, List<String> tourism) {
        this.name = name;
        this.pincode = pincode;
        this.capital = capital;
        this.tourism = tourism;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPincode() {
        return this.pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getTourism() {
        return this.tourism;
    }

    public void setTourism(List<String> tourism) {
        this.tourism = tourism;
    }

    public String toString() {
        return " District: " + name + " Pincode: " + pincode + " Capital: " + capital + " Tourism: " + tourism;
    }

}
