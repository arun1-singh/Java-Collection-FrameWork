package cf;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TaskSubmissionSystem {
    private static ConcurrentLinkedQueue<String> taskQueue = new ConcurrentLinkedQueue<>();
    public static void main(String[] args) {
        Thread producer = new Thread(()->{
            while (true) {
                try{
                    taskQueue.add("Task " + System.currentTimeMillis());

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        Thread consumer = new Thread(()->{
           try {
               String task = taskQueue.poll();
               System.out.println("Processing: " + task);
           } catch (Exception e){
               e.printStackTrace();
           }
        });
        producer.start();
        consumer.start();
    }
}
