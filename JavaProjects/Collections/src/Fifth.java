import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Fifth {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 10)
                .filter(i -> i%2 != 0 && i*i < 20)
                .mapToObj(i -> i*2)
                .reduce(0,(ans,i)-> ans+i);
        System.out.println(sum);
//        Integer k = 1, n = 10;
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = k; i<=n; i++) {
//            list.add(i);
//        }
//
//        int sum = list.stream()
//                .filter(i -> i%2 != 0 && i*i < 20)
//                .map(i -> i*2)
//                .reduce(0,(ans,i)-> ans+i);
//
//        System.out.println(sum);
    }
}
