package cf.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // feature introduced in java 8
        // process Collections of data in a functional and declaration manner(lambda expression using Streams)
        // Simplify Data Processing
        // Embrace Functional Programming
        // Improve Readability and Maintainability
        // Enable Easy Parallelism

        // What is Stream ?
        // a sequence of elements supporting functional and declarative programming

    // How to use Streams?
    // Source, intermediate operations & Terminal operation

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//        int count = 0;
//        for (int i : numbers) {
//            if (i % 2 == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);
        System.out.println(numbers.stream().filter(x -> x % 2 ==0).count());

        //  Creating Streams
        // 1. From Collections
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        // 2. From Arrays
        String[] array = {"a","b","c"};
        Stream<String> stream1 = Arrays.stream(array);
        // 3. Using Stream.of
        Stream<String> a = Stream.of("a", "b");
        // 4. Infinite Stream
        Stream<Integer> generate = Stream.generate(() -> 1);
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collect);


    }
}
