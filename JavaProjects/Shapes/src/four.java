interface Rectangle {
    default public void area() {
        System.out.println(4*4);
    }
    default public void perimeter() {
        System.out.println(2*(4+4));
    }
}

interface Square {
    default public void area() {
        System.out.println(2*2);
    }
    default public void perimeter() {
        System.out.println(4*2);
    }
}

class Shapes implements Rectangle, Square {
    public void area() {
        Rectangle.super.area();
        Square.super.area();
    }
    public void perimeter() {
        Rectangle.super.perimeter();
        Square.super.perimeter();
    }
}

public class four {
    public static void main(String[] args) {
        Shapes sh = new Shapes();
        sh.area();
        sh.perimeter();
    }
}
