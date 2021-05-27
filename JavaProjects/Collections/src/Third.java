import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Third {
    private static int indexOf(Set<Character> set, Character element) {
        List<Character> list = new ArrayList<Character>(set);
        return list.indexOf(element);
    }

    public static void main(String[] args) {
        Set<Character> s1 = new HashSet<>(Arrays.asList('a','b','c','d','e'));
        Set<Character> s2 = new HashSet<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j'));

        List<Character> evenSet = new ArrayList<>();
        List<Character> oddSet = new ArrayList<>();

        s2.stream()
                .collect(Collectors.groupingBy(n -> indexOf(s2, n) % 2 == 0 ? evenSet.add(n) : oddSet.add(n)));

        Stream<Character> combinedStream = Stream.of(evenSet, oddSet)
                .flatMap(Collection::stream);
        Collection<Character> finalList =
                combinedStream.collect(Collectors.toList());

        System.out.println(finalList);
        finalList.removeAll(s1);
        System.out.println(finalList);

//        s2.stream()
//                .map(n -> indexOf(s2, n) % 2 == 0 ? Stream.concat(evenSet, Stream.of(n)).collect(Collectors.toList()) : Stream.concat(oddSet, Stream.of(n)).collect(Collectors.toList()));
//        List<Character> finalSet = Stream
//                    .concat(evenSet, oddSet)
//                    .collect(Collectors.toList());
//        System.out.println(finalSet);
//        System.out.println(evenSet.toString());
//        System.out.println(oddSet.toString());
//        evenSet.forEach(s -> System.out.println(s));

//        List<Character> evens = s2.stream()
//                .filter(i -> indexOf(s2, i) % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(evens);
//
//        List<Character> odds = s2.stream()
//                .filter(i -> indexOf(s2, i) % 2 != 0)
//                .collect(Collectors.toList());
//        System.out.println(odds);
//
//        Stream<Character> combinedStream = Stream.of(evens, odds)
//                .flatMap(Collection::stream);
//        Collection<Character> finalList =
//                combinedStream.collect(Collectors.toList());
//        System.out.println(finalList);
//        finalList.removeAll(s1);
//        System.out.println(finalList);

//        for (Character s : s2) {
//            if (indexOf(s2, s) % 2 == 0) {
//                evenSet.add(s);
//            } else {
//                oddSet.add(s);
//            }
//        }
//        evenSet.addAll(oddSet);
//        System.out.println(evenSet);
//
//        evenSet.removeAll(s1);
//        System.out.println(evenSet);
    }
}
