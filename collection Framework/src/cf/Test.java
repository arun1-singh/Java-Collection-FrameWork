package cf;

import java.util.Arrays;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addLast(4);
        linkedList.addFirst(0);
        linkedList.getFirst();
        linkedList.getFirst();
        System.out.println(linkedList);
        linkedList.removeIf(x -> x%2 ==0);
        System.out.println(linkedList);


        LinkedList<String> animals = new LinkedList<>(Arrays.asList("CAT","DOG","ELEPHANT"));
        LinkedList<String> animalsToRemove = new LinkedList<>(Arrays.asList("DOG","LION"));
        animals.removeAll(animalsToRemove);
        System.out.println(animals);
    }
}
