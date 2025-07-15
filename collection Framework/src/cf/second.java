package cf;

import java.util.*;

//class StringLength implements Comparator<String>{
//
//    public int compare(String s1,String s2){
//        return  s2.length() - s1.length();
//    }
//
//}
//
//class MyComparator implements Comparator<Integer>{
//    @Override
//    public int compare(Integer o1 ,Integer o2){
//        return  o2 - o1;
//    }
//
//}



public class second {
    public static void main(String[] args) {
        //        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(9);
//        list.add(3);
//        list.sort(new MyComparator());
//        System.out.println(list);

//        Collections.sort(list);
        List<String> words = Arrays.asList("banana","apple","date");
        words.sort((a,b)-> a.length() - b.length());
        System.out.println(words);

//        Object[] array = list.toArray();
//        Integer[] array1 = list.toArray(new Integer[0]);
//        list.remove(Integer.valueOf(1));
//        System.out.println(list);

//        List<String> fruits = new ArrayList<>();
//        fruits.add("Apple");
//        fruits.add("Apple");
//        fruits.add("Banana");
//        fruits.add("Cherry");
//        fruits.add("Banana");
//        fruits.add("Date");
//
//        fruits.remove("Apple");
//        System.out.println(fruits);
//        System.out.println(list);
//
//        List<Integer> list1 = List.of(4, 5, 7, 9);
//
//        list.addAll(list1);
//        System.out.println(list);

//
//        List<String> list = new ArrayList<>();
//        System.out.println(list.getClass().getName());
//
//        List<String> list1 = Arrays.asList("Monday", "Tuesday");
//        System.out.println(list.getClass().getName());
//        list1.set(1,"Wednesday");
//        System.out.println(list1.get(1));
//        String[] array = {"Apple", "Banana", "Cherry"};
//        List<String> list2 = Arrays.asList(array);
//        System.out.println(list2.getClass().getName());
//
//        List<String> list4 = new ArrayList<>(list2);
//        list4.add("Mongo");
//        System.out.println(list4);

        List<Integer> integers = List.of(1, 2, 4, 5, 6);

    }
}