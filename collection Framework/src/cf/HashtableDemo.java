package cf;

import java.util.HashMap;
import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        // Hashtable is synchronized
        // no null key or value
        //legacy class
        //Replace by concurrent HashMap
        //Slower than hashmap due to multithreading
        //only linked list incase of collision
        //All methods are synchronized including get
        hashtable.put(1,"Apple");
        hashtable.put(2,"Banana");
        hashtable.put(3,"Cherry");
        System.out.println(hashtable);
        System.out.println("Value for key 2: " + hashtable.get(3));
        System.out.println("Does key 3 exits?: " + hashtable.containsKey(3));
        hashtable.remove(1);
        System.out.println("After removing key 1: " + hashtable);
//        hashtable.put(null,"value");//throws exception
//        hashtable.put(4,null);//throws exception

        Hashtable<Integer,String> map = new Hashtable<>() ;
        Thread thread1 = new Thread(() -> {
           for(int i=0; i < 1000 ; i++){
               map.put(i,"Thread1");
           }
        });
        Thread thread2 = new Thread(()-> {
            for(int i=1000; i < 2000 ; i++){
                map.put(i,"thread2");
            }
        });
        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final Size of HashMap: " + map.size());
    }
}
