abstract class Shape {
    abstract void printShape();
}

class Rect extends Shape {
    public void printShape() {
        System.out.println("Rectangle");
    }
}

class Sq extends Shape {
    public void printShape() {
        System.out.println("Square");
    }
}
public class five {
    public static void main(String[] args) {
        Rect r = new Rect();
        Sq s = new Sq();
        r.printShape();
        s.printShape();
    }
}
