package cf;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        List<String> shoppingList = new CopyOnWriteArrayList<>();
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Intial shopping List:" + shoppingList);

        for(String item : shoppingList){
            System.out.println(item);
            if(item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added Butter while reading");
            }
        }
        System.out.println("Updated shopping List: " + shoppingList);

        List<String> sharedList = new CopyOnWriteArrayList<>();
        sharedList.add("Item1");
        sharedList.add("Item1");
        sharedList.add("Item1");
        Thread thread = new Thread(()->{
        try{
            while (true){
                for(String item : sharedList) {
                    System.out.println("Reading item: " + item);
                    Thread.sleep(500);
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in reader thread: " + e);
        }
        });
        Thread writerthread = new Thread(()->{
            try{
                Thread.sleep(500);
                sharedList.add("Item4");
                System.out.println("Added Item4 to the list.");
                Thread.sleep(500);
                sharedList.remove("Item1");
                System.out.println("Removed Item1 from the list.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

     thread.start();
     writerthread.start();

    }
}
