class Calculate {
    public double area(float l, float b) {
        return l*b;
    }

    public double area(float s) {
        return s*s;
    }

    public double area(double r) {
        return 3.14*r*r;
    }

    public double area(double b, double h) {
        return 0.5*b*h;
    }

    public double perimeter(float l, float b) {
        return 2*(l+b);
    }

    public double perimeter(float s) {
        return 4*s;
    }

    public double perimeter(double r) {
        return 2*3.14*r;
    }

    public double perimeter(double a, double b, double c) {
        return a+b+c;
    }
}

public class first {
    public static void main(String[] args) {
        Calculate calc = new Calculate();
        System.out.println("Area of Rectangle = " + calc.area(3,5));
        System.out.println("Area of Square = " + calc.area(4));
        System.out.println("Area of Circle = " + calc.area(4.5));
        System.out.println("Area of Triangle = " + calc.area(2.6,5));

        System.out.println("Perimeter of Rectangle = " + calc.perimeter(3,5));
        System.out.println("Perimeter of Square = " + calc.perimeter(4));
        System.out.println("Perimeter of Circle = " + calc.perimeter(4.5));
        System.out.println("Perimeter of Triangle = " + calc.perimeter(3,5,6));
    }
}
