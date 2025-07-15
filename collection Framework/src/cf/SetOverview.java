package cf;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListMap;

public class SetOverview {
    public static void main(String[] args) {
        // Set is a collection that cannot contains duplicate elements
        //faster operations
        // map -> HashMap , LinkedHashMap , TreeMap , EnumMap
        //Set -> Hashset, LinkedHashSet,TreeSet,EnumSet
        NavigableSet<Integer> set = new TreeSet<>();
//        Map<String,Integer> map = new HashMap<>();
//        Set<String> integers = map.keySet();
        set.add(12);
        set.add(12);
        set.add(2);
        set.add(3);
        set.add(34);
        System.out.println(set);
        System.out.println(set.contains(12));
        System.out.println(set.remove(3));
        set.clear();
        System.out.println(set.isEmpty());
        for ( int i : set){
            System.out.println(i);
        }
//        Set<Integer> integers = Collections.synchronizedSet(set);//not built in thread safety external use
        ConcurrentSkipListMap set1= new ConcurrentSkipListMap<>();//uilt in thread safety

        //unmodifiable
        Set<Integer> integers= Set.of(1,2,3,4,56,67,77,35,56);


    }
}
