package cf;

import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetDemo {
    public static void main(String[] args) {
        //Thread-Safe
        //Copy-on-Write Mechanism( new copy is created when something is added or removed from the array)
        //No Duplicate Elements
        //Iterators do not reflect modifications

        CopyOnWriteArraySet<Integer> copyOnWriteSet = new CopyOnWriteArraySet<>();//consistent
        ConcurrentSkipListSet<Integer> concurrentSkipListSet = new ConcurrentSkipListSet<>();

        for (int i = 1; i <=5; i++){
            copyOnWriteSet.add(i);
            concurrentSkipListSet.add(i);
        }
        System.out.println("Intial CopyOnWriteArraySet: " + copyOnWriteSet);
        System.out.println("Intial concurrentSkipListSet: " + copyOnWriteSet);

        System.out.println("\nIterating and modifying CopyOnWriteArraySet:");
        for (Integer num : copyOnWriteSet) {
            System.out.println("Reading from CopyOnWriteArraySet: " + num);
            copyOnWriteSet.add(6);
        }
        System.out.println(copyOnWriteSet);
    for ( Integer num : concurrentSkipListSet){ // Weakly-consistent
        System.out.println("Reading from ConcurrentSkipListSet: " + num);
        concurrentSkipListSet.add(6);
    }
    }
}
