package cf;

import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class sortedmapDemo {
    public static void main(String[] args) {
        SortedMap<Integer,String> map = new TreeMap<>((a,b) -> b - a );
        map.put(91,"Arun");
        map.put(99,"Vicky");
        map.put(78,"Vipul");
        map.put(86,"abcd");
        map.get(78);
        map.containsKey(86);
        map.containsValue(99);

//
//        System.out.println(map);
//        System.out.println(map.firstKey());
//        System.out.println(map.lastKey());
//        System.out.println(map.headMap(91));
//        System.out.println(map.tailMap(91));
//        System.out.println(map.subMap(78,91));

        NavigableMap<Integer,String>  navigable = new TreeMap<>();
        navigable.put(5,"Five");
        navigable.put(1,"One");
        navigable.put(3,"Three");
        System.out.println(navigable);

        System.out.println(navigable.lowerKey(3));
        System.out.println(navigable.ceilingKey(4));
        System.out.println(navigable.higherEntry(1));
        System.out.println(navigable.descendingMap());
    }
}
