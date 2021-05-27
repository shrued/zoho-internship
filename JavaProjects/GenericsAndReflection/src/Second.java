class Operations<T extends Number> {
    T a, b;

    static public abstract class GenericClass<E extends Number> {
        public abstract E add(E x, E y);
        public abstract E sub(E x, E y);
        public abstract E mul(E x, E y);
        public abstract E div(E x, E y);
    }

    static public class MyInteger extends GenericClass<Integer> {
        public Integer add(Integer x, Integer y) {
            return x + y;
        }

        public Integer sub(Integer x, Integer y) {
            return x + y;
        }

        public Integer mul(Integer x, Integer y) {
            return x + y;
        }

        public Integer div(Integer x, Integer y) {
            return x + y;
        }
    }

//    public T add(T a, T b) {
//        return a + b;
//    }

//    public double add(T a, T b) {
//        return a.doubleValue() + b.doubleValue();
//    }
//
//    public double subtract(T a, T b) {
//        return a.doubleValue() - b.doubleValue();
//    }
//
//    public double multiply(T a, T b) {
//        return a.doubleValue() * b.doubleValue();
//    }
//
//    public double divide(T a, T b) {
//        return a.doubleValue() / b.doubleValue();
//    }
}

class Second {
    public static void main (String[] args) {
//        Operations <Integer> intObj = new Operations<Integer>();
//        System.out.println(intObj.add(3, 1));
//        Operations <Double> doubleObj = new Operations<Double>();
//        System.out.println(doubleObj.multiply(1.69, 3.18));
        Operations.MyInteger my = new Operations.MyInteger();
        Integer i = 1, j = 2, k;
        k = my.add(i, j);
        System.out.println(k);
    }
}
