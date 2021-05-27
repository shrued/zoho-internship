import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.IntStream;

public class Sixth {
    public static void main(String[] args) {
        int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        IntStream stream = Arrays.stream(arr).flatMapToInt(Arrays::stream);

        stream.forEachOrdered(n -> System.out.print(n + " "));
     }
}
