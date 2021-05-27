class Shape2 {
    String name;
    Integer area;

    Shape2(String n, Integer a) {
        this.name = n;
        this.area = a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Shape2)) {
            return false;
        }
        // typecasting rect to Shape to compare
        Shape2 rect = (Shape2) obj;
        return name.equals(rect.name) && area.equals(rect.area);
    }
}

public class equals {
    public static void main(String[] args) {
        //General equals() usage
        //Integer x = 6;
        //Integer y = 5;
        //System.out.println(x.equals(y));

        //Overriding equals()
        Shape2 s1 = new Shape2("Rectangle", 15);
        Shape2 s2 = new Shape2("Rectangle", 15);
        if (s1.equals(s2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
