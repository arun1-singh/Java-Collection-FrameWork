package cf;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Day,String> map = new EnumMap<>(Day.class); //*Array of Size same as enum * No Hashing // Ordinal/index is used
        map.put(Day.TUESDAY,"GYM"); //Faster than hashmap Memory Efficient
        map.put(Day.MONDAY,"Walk");
        String s = map.get(Day.TUESDAY);
        String s1 = map.get(Day.MONDAY);
        System.out.println(s1);
        System.out.println(s);
        System.out.println(map);
    }
}

enum Day {
    MONDAY, TUESDAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY , SUNDAY
}
