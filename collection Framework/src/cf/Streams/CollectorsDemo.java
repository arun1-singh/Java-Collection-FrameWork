package cf.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        // Collectors is a utility class
        // provides a set of methods to create common collectors

        // 1. Collecting to a List
        List<String> names = Arrays.asList("Alice","Bob","Charlie");
        List<String> res = names.stream().filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(res);

        // 2. Collecting to a Set
        List<Integer> nums = Arrays.asList(1,2,2,3,4,4,5);
        Set<Integer> set = nums.stream().collect(Collectors.toSet());
        System.out.println(set);

        // Collecting to a Specific Collection
        ArrayDeque<String> collect = names.stream().collect(Collectors.toCollection(() -> new ArrayDeque<>()));

       // 4. Joining Strings
        // Concatenates stream elements into a single String
        String collect1 = names.stream().map(String::toUpperCase).collect(Collectors.joining(" , "));
        System.out.println(collect1);

      // 5. Summarizing Data
      // Generates statistical summary (count, sum, min, average, max)

      List<Integer> numbers = Arrays.asList(2,3,5,7,11);
        IntSummaryStatistics collect2 = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count: " + collect2.getCount());
        System.out.println("Sum: " + collect2.getSum());
        System.out.println("Min: " + collect2.getMin());
        System.out.println("Max: " + collect2.getMax());
        System.out.println("Average: " + collect2.getAverage());

        // 6. Calculating Averages
        Double collect3 = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average: "+collect3);

        // 7. Counting Elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count: "+ count);

        // 8. Grouping Elements
        List<String> words = Arrays.asList("hello","world","java","streams","collecting");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream()
                .collect(Collectors.groupingBy(String::length,Collectors.joining(", "))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())));
        TreeMap<Integer, Long> collect4 = words.stream().collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(collect4);

        // 9.Partitions elements into two groups (true and false) based on a predicate
        System.out.println(words.stream().collect(Collectors.partitioningBy(x->x.length()>5)));

        // 10. Mapping and Collecting
        // Applies a mapping function before collecting
        System.out.println(words.stream().collect(Collectors.mapping(x->x.toUpperCase(),Collectors.toList())));

        // Example 1: Collecting Names by length
        List<String> l1 = Arrays.asList("Anna","Bob","Alexander","Brian","Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

        // Example 2: Counting Word Occurrences
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

      // Example 3: Partitioning Even and Odd Numbers
        List<Integer> l2 = Arrays.asList(1,2,3,4,5,6);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));

        // Example 4: Summing Values in a Map
        Map<String,Integer> items = new HashMap<>();
        items.put("Apple",10);
        items.put("Banana",20);
        items.put("Orange",15);
        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summarizingInt(x -> x)));

        // Example 5: Creating a Map from Stream Elements
        List<String> fruits = Arrays.asList("Apple","Banana","Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x->x.toUpperCase(),x -> x.length())));

        // Example 6:
        List<String> words2 = Arrays.asList("apple","banana","apple","orange","banana","apple");
        System.out.println(words2.stream().collect(Collectors.toMap(k -> k,v -> 1,(x,y)->x + y)));
    }
}
