package cf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class immutableMapdemo {
    public static void main(String[] args) {
        Map<String,Integer> map1 = new HashMap<>();
        map1.put("A",1);
        map1.put("B",2);
        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
        //map2.put("C",3); throws Exception
        Map<String, Integer> A = Map.of("ARUN", 97, "VICKY", 96);// only 10 entries can be inserted
        A.put("VIPUL",87);// Also Throws Exception
        System.out.println(A);
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Akshit", 93), Map.entry("Vivek", 89)); //More than 10 entries can be inserted


    }
}
