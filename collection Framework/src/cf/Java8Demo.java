package cf;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Java8Demo {
    public static void main(String[] args) {
        // streams(method reference,constructor reference,functional interface)
        // java 8 --> minimal code, functional programming,Streams, lambda expressions, date and time api
        //lamda expression
        // lambda expression is an anonymous function( no name ,no return type , no access modifier)

        Thread t1 = new Thread(() -> {
            System.out.println("hello");
        });


        MathOperation sumOperation = ( a,  b) -> a + b;
        MathOperation subtractOperation = ( a,  b) -> a - b;
        int operate = sumOperation.operate(1, 2);
        System.out.println(operate);

        //Predicate --> Functional Interface(boolean-valued function)
        Predicate<Integer> isEven = x -> x % 2 == 0;
            System.out.println(isEven.test(40));
            Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
            Predicate<String> isWordEndingWithB = x -> x.toLowerCase().endsWith("n");
            Predicate<String> and = isWordStartingWithA.and(isWordEndingWithB);
        System.out.println(and.test("Arun"));

        Function<Integer,Integer> doubleIt = x -> x * 2;
        Function<Integer,Integer> tripleIt = x -> x * 3;
        System.out.println(doubleIt.andThen(tripleIt).apply(30));
        System.out.println(tripleIt.andThen(doubleIt).apply(30));//same
        System.out.println(doubleIt.compose(tripleIt).apply(30));//same
        System.out.println(doubleIt.apply(100));

        Function<Integer,Integer> identity = Function.identity();
        Integer res2 = identity.apply(5);
        System.out.println(res2);

        //Consumer
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(5);
        List<Integer> list = Arrays.asList(1, 2, 3);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);

        // Supplier
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());


        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer,Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;
        if(predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        // BiPredicate , BiConsumer , BiFunction
        BiPredicate<Integer,Integer> isSumEven = (x,y) -> (x +y) % 2 == 0;
        System.out.println(isSumEven.test(5,5));
        BiConsumer<Integer,String> biConsumer = (x,y) -> {
            System.out.println(x);
            System.out.println(y);
        };
        BiFunction<String,String,Integer> biFunction = (x,y) -> (x+y).length();
        System.out.println(biFunction.apply("a","bc"));


        //UnaryOperator(function), BinaryOperator(Bifunction)
        UnaryOperator<Integer> a = x -> 2 * x; //FUNCTION
        BinaryOperator<Integer> b = (x,y) -> x + y; //BIFUNCTION

        //Method References --> use method without invoking & in place of lambda expression

        List<String> students = Arrays.asList("Ram","Shyam","Arun");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println);

        //Constructor Reference
        List<String> names = Arrays.asList("A","B","C");
        List<MobilePhone> collect = names.stream().map(MobilePhone::new).collect(Collectors.toList());


    }
}

class MobilePhone{
    String name;

    public MobilePhone(String name) {
        this.name = name;
    }
}

// class SumOperation implements MathOperation{
//
//    @Override
//    public int operate(int a, int b) {
//        return a+b;
//    }
//}
 interface MathOperation{
    int operate(int a, int b);
   }


