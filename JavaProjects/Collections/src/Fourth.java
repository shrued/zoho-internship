import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fourth {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum = list.stream()
                .filter(i -> i%2 == 0)
                .map(i -> i*2)
                .reduce(0,(ans,i)-> ans+i);

        System.out.println(sum);
    }
}
