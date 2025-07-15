package cf;

import java.util.ArrayList;
import java.util.List;

public class comparableDemo {
    public static void main(String[] args) {
        List<Student> list =new ArrayList<>();
        list.add(new Student("Charlie",3.5));
        list.add(new Student("Bob",4.5));
        list.add(new Student("Vipul",7.8));
        list.add(new Student("Arun",8.9));
        list.add(new Student("Akshit",6.5));
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(3);
        numbers.add(1);
        numbers.add(5);
        numbers.sort(null);//works fine with Integer
        list.sort(null);//requires compareTo method implementation
        System.out.println(numbers);
        System.out.println(list);
    }
}
