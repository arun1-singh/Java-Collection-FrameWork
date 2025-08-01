package cf;

import javax.sound.sampled.Line;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap= new LinkedHashMap<>(11,0.3f,true);// Double Linked List

        linkedHashMap.put("Orange",10);
        linkedHashMap.put("Apple",20);
        linkedHashMap.put("Guava",13);
        linkedHashMap.get("Orange");
        for (Map.Entry<String,Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        HashMap<String,Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap1 = new LinkedHashMap(hashMap);

        hashMap.put("Shubham", 91);
        hashMap.put("Bob",80);
        hashMap.put("Akshit",78);
        Integer res = hashMap.getOrDefault("Arun", 0);
        System.out.println(res);
        Integer shubham = hashMap.putIfAbsent("Shubham", 92);
        System.out.println(hashMap);
        hashMap.put("Shubham",97);
        System.out.println(hashMap);
    }
}
