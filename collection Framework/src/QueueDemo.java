import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue1= new LinkedList<>();// queue is a interface
//        list.add(1);// enqueue
//        list.add(4);
//        list.add(8);
//        System.out.println(list);
//        Integer i = list.remove(); // dequeue
//        System.out.println(i);
//        System.out.println(list);
//        list.peek();//peek
        queue1.add(1);
        System.out.println(queue1.size());
        //System.out.println(queue1.remove()); // throws exception if empty
        System.out.println(queue1.poll()); // better than remove

        System.out.println(queue1.peek());
      //  System.out.println(queue1.element());//throws exception if empty

    Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1));// true
        System.out.println(queue2.offer(2));// true
        System.out.println(queue2.offer((3)));//false
        //System.out.println(queue2.add(3));//throws exception



    }
}
