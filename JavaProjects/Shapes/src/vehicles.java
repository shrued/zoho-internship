interface Methods {
    void engineType();
    void price();
}

class Car implements Methods {
    public void engineType() {
        System.out.println("A");
    }
    public void price() {
        System.out.println("340000");
    }
}

class Scooter implements Methods {
    public void engineType() {
        System.out.println("C");
    }
    public void price() {
        System.out.println("49000");
    }
}

public class vehicles {
    public static void main(String[] args) {
        Car car =new Car();
        car.engineType();
        car.price();

        Scooter scooter = new Scooter();
        scooter.engineType();
        scooter.price();
    }
}
