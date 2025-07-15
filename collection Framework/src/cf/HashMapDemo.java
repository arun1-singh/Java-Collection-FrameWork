package cf;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Akshit");
        map.put(2,"Neha");
        map.put(3,"Arun");
        map.put(4,"Vicky");
        map.put(5,"Amit");
        System.out.println(map);
        String s = map.get(3);
        System.out.println(s);
        String s1 = map.get(69);
        System.out.println(s1);
        boolean b = map.containsKey(2);
        System.out.println(b);
        boolean b1 = map.containsValue("Arun");
        System.out.println(b1);

//        Set<Integer> keys=map.keySet();
        for (int i : map.keySet()){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer,String> entry : entries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());
        }
        System.out.println(map);

        map.remove(4);
        System.out.println(map);
    }
}
