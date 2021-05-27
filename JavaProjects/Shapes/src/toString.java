class Shape1 {
    String name;
    Integer length;
    Integer breadth;

    Shape1(String n, Integer l, Integer b) {
        this.name = n;
        this.length = l;
        this.breadth = b;
    }

    public String toString() {
        return "\nArea of " + this.name + " is " + this.length*this.breadth;
    }
}
public class toString {
    public static void main(String[] args) {
        Shape1 rect = new Shape1("Rectangle", 3, 6);

        //General toString() usage
        //Integer num = 12;
        //System.out.println(num.toString());
        //or
        //System.out.println(Integer.toString(12));

        //Overriding toString()
        System.out.println(rect.toString());
    }
}
