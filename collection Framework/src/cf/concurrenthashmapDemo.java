package cf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class concurrenthashmapDemo {
    public static void main(String[] args) {
        ConcurrentMap<String,Integer> map = new ConcurrentHashMap<>();


        // MAP -> SORTED -> THREAD SAFE -> ConcurrentSkipListMap -> (Thread Safe Tree Map) -> Achieving concurrency
// skip List -> Probabilistic data Structure that allows for efficient search , insertion , deletion operations similar to sorted
// linked list but with multiple layers that skip over portions of the list to provide faster access to elements.
//ConcurrentSkipListMap is concurrent version of Tree Map
        //ConcurrentHashMap is concurrent version of HashMap

    }
}
