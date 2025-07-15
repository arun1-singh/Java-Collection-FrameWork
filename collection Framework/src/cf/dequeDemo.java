package cf;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class dequeDemo {
    public static void main(String[] args) {
        //double-ended queue
        // allows insertion and removalof elements from both the ends
        // versatile than regular queues and stacks because they support all operations of both

        /*
        INSERTION METHODS

        addFirst(E e): Inserts the specified element at the front.
        addLast(E e): Insers the specified element at the end.
        offerFirst(E e): Inserts the specified element at the front if possible
        offerLast(E e): Inserts the specified element at the end if possible
       */

  /* Removal Methods
  removeFirst(),removeLast(),pollFirst(),pollLast()
  Examination Methods
  getFirst(),getLast(),peekFirst(),peekLast()
   */
        /*
        Stack Methods
        push(E e): Adds an element at the front (equivalent to addFirst(e E)).
        pop(): Removes and returns the first element (equivalent to removeFirst())
         */
        Deque<Integer> deque1 = new ArrayDeque<>(); // faster iteration, low memory , no null allowed
        // circular, head and tail
        // no need to shift elements, just shift head and tail
        deque1.addFirst(10); // head--
        deque1.addLast(20);
        deque1.offerFirst(5);
        deque1.offerLast(25);
        System.out.println(deque1);
        // 5, 10, 20, 25
        System.out.println("First Element: " + deque1.getFirst()); // Outputs 5
        System.out.println("Last Element: " + deque1.getLast()); // Outputs 25
        System.out.println(deque1.removeFirst()); // Removes 5

        System.out.println(deque1.pollLast()); // Removes 25
        System.out.println(deque1);
        for(int num : deque1){
            System.out.println(num);
        }
        Deque<Integer> deque2 = new LinkedList<>(); // insertion,deletion somewhere in the middle

    }
}
