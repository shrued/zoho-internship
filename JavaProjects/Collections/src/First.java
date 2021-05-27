import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) {
        ArrayList<Character> l1 = new ArrayList<>(Arrays.asList('a','b','c','d','e'));
        ArrayList<Character> l2 = new ArrayList<>(Arrays.asList('a','b','c','d','e','f','g','h','i','j'));
        ArrayList<Character> new3 = new ArrayList<>(l1);

        if(l1.size() > l2.size()) {
            //difference
            ArrayList<Character> new1 = new ArrayList<>(l1);
            for (Character A : l2) {
                if (l1.contains(A))
                    new1.remove(A);
            }
            System.out.println(new1);

            //add w/o duplicates
            for (Character x : l2){
                if (!l1.contains(x))
                    l1.add(x);
            }
            ArrayList<Character> new2 = new ArrayList<>(l1);
            System.out.println(new2);
        } else {
            //difference
            ArrayList<Character> new1 = new ArrayList<>(l2);
            for (Character A : l1) {
                if (l2.contains(A))
                    new1.remove(A);
            }
            System.out.println(new1);

            //add w/o duplicates
//            for (Character x : l1){
//                if (!l2.contains(x))
//                    l2.add(x);
//            }
//            ArrayList<Character> new2 = new ArrayList<>(l2);
//            System.out.println(new2);
            List<Character> noDuplicates = l2.stream()
                    .filter(d -> !l1.contains(d))
                    .collect(Collectors.toList());
            for (Character x : noDuplicates) {
                System.out.println(x);
            }

            List<Character> newList = new ArrayList<>(noDuplicates);
        }

        //add at z index 2 of l1
        new3.add(2,'z');
        System.out.println(new3);
    }
}
