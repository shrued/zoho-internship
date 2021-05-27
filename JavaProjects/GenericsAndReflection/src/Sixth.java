import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Colors {
    private String name;
    private int id;

    public Colors(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    private int getId() { return id; }

    public void setId(int age) { this.id = age; }

//    public String toString() {
//        return "Color:" + name + ", id:" + id;
//    }
}

class Sixth {
    public static void main(String[] args) {
        try {
            Colors e = new Colors("Black", 18);

            Field privateField = Colors.class.getDeclaredField("name");
            privateField.setAccessible(true);

            String name = (String)privateField.get(e);
            System.out.println("Color:" + name);
//            System.out.println("Id:" + name);

            Method privateMethod = Colors.class.getDeclaredMethod("getId");
            privateMethod.setAccessible(true);

            int id = (int)privateMethod.invoke(e);
            System.out.println("Color Id: " + id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
