package com.example.Library;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void showBooks( List<Bob> bob )
    {
        System.out.println( "Book List: " );
        for( Bob book : bob )
        {
            System.out.println( "\t" + book );
        }
    }

    public static void showStock(List<String> mary )
    {
        for( String book : mary )
        {
            System.out.println( "\t" + book );
        }
    }

    public static void bobTitles( List<Bob> bob, List<String> titles1 )
    {
        for( Bob book : bob )
        {
            titles1.add(book.getTitle());
        }
    }

    public static void maryTitles( List<Mary> mary, List<String> titles2 )
    {
        for( Mary book : mary )
        {
            titles2.add(book.getTitle());
        }
    }

    public static void main( String[] args ) {
        List<Bob> bob = new ArrayList<>();
        bob.add(new Bob(1, "Stalker", "Lars Kepler"));
        bob.add(new Bob(2, "Harry Potter", "J.K. Rowling"));
        bob.add(new Bob(3, "The Silent Patient", "Alex Michaelides"));
        bob.add(new Bob(4, "Hunter", "Lars Kepler"));
        bob.add(new Bob(5, "The Hypnotist", "Lars Kepler"));
        bob.add(new Bob(6, "The Maidens", "Alex Michaelides"));


//        showBooks(bob);

        List<Mary> mary = new ArrayList<>();
        mary.add(new Mary(1, "Stalker", "Lars Kepler", "Yes"));
        mary.add(new Mary(2, "The Silent Patient", "Alex Michaelides", "Yes"));
        mary.add(new Mary(3, "Dark Places", "Gillian Flynn", "Yes"));
        mary.add(new Mary(4, "What Remains", "Tim Weaver", "No"));
        mary.add(new Mary(5, "Divergent", "Veronica Roth", "No"));
        mary.add(new Mary(6, "The Handmaid's Tale", "Margaret Atwood", "Yes"));
        mary.add(new Mary(7, "Harry Potter", "J.K. Rowling", "Yes"));
        mary.add(new Mary(8, "The Butterfly Garden", "Dot Hutchinson", "Yes"));

        List<String> titles1 = new ArrayList<>();
        bobTitles(bob, titles1);

        List<String> titles2 = new ArrayList<>();
        maryTitles(mary, titles2);

        AtomicReference<Integer> count = new AtomicReference<>(mary.size());

        //Existing books
        for (String x : titles1){
            if (titles2.contains(x)) {
                System.out.println(titles1);
                count.set(count.get() - titles1.size());
                break;
            }
        }

        //out of stock
        List<String> outofstock =  mary.stream()
                .filter(m ->m.getStock() == "No")
                .map(s ->s.getTitle())
                .collect(Collectors.toList());
        outofstock.forEach(b -> count.getAndSet(count.get() - 1));

        showStock(outofstock);

        //books that bob can buy
        System.out.println(count);

        //alphabetical order
        Collections.sort(mary, new Comparator() {
            @Override
            public int compare(Object a, Object b) {
                return ((Mary)a).getTitle()
                        .compareTo(((Mary)b).getTitle());
            }
        });
        for (Mary m : mary) {
            System.out.println(m.getTitle() + " by " + m.getAuthor());
        }

        //same author
        System.out.println("Space");
        HashMap<String, String> map = new HashMap<>();
        for (Bob b: bob) {
            map.put(b.getTitle(), b.getAuthor());
        }
//        Map<String, List<String>> values = new HashMap<>();
//        for (Bob b : bob) {
//            if (!values.containsKey(b.getAuthor())) {
//                List<String> allValues = new ArrayList<>();
//                allValues.add(b.getTitle());
//                values.put(b.getAuthor(), allValues);
//            } else {
//                values.get(b.getAuthor()).add(b.getTitle());
//            }
//        }
//        System.out.println(values.entrySet());


        map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream()
                .filter(e -> e.getValue().size() > 1)
                .forEach(System.out::println);

//        Set<Bob> bobSet = new HashSet<Bob>(bob);
//        Set<String> authors = new HashSet<String>();
//        for (Bob b : bobSet) {
//            authors.add(b.getAuthor());
//        }
//        for (String a : authors) {
//            System.out.println(a + ":");
//            for (Bob b : bobSet) {
//                if(b.getAuthor().contains(a)) {
//                    System.out.println(b.getTitle());
//                }
//            }
//        }
    }
}
