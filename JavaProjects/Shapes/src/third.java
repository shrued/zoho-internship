public class third {
    public int sum(int x, int y) {
        return (x + y);
    }

    public int sum(int x, int y, int z) {
        return (x + y + z);
    }

    public double sum(double x, float y) {
        return (x + y);
    }

    public double sum(double x, double y) {
        return (x + y);
    }

    public static void main(String[] args) {
        third s = new third();
        System.out.println(s.sum(10, 20));
        System.out.println(s.sum(10, 20, 30));
        System.out.println(s.sum(11.5, 5));
        System.out.println(s.sum(10.5, 20.5));
    }
}
