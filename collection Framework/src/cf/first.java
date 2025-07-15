package cf;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class first {
    public static <object> void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(11);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.size());

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        object[] elementData = (object[]) field.get(list);
        System.out.println("ArrayList Capacity: " + elementData.length);

        list.add(1);

        elementData = (object[]) field.get(list);
        System.out.println("ArrayList capacity: " +  elementData.length);
 //        list.set(2,50);
//        System.out.println(list);
//        System.out.println(list.get(2));
//        System.out.println(list.size());
//        for ( int i=0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//        for(int x:list){
//            System.out.println(x);
//        }
//        System.out.println(list.contains(2));
//        System.out.println(list.contains(10));
//        list.remove(2);
    }
}
