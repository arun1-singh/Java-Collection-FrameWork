package cf;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
    private static void simulateApplicationRunning(){
        try{
            System.out.println("Simulate Application Running");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        WeakHashMap<String,Image> imageCache = new WeakHashMap<>();
       loadCache(imageCache);
        System.out.println(imageCache);

        System.gc();
        simulateApplicationRunning();

        System.out.println("Cache after running (some entries may be cleared): " + imageCache);
    }
    public static void loadCache(Map<String,Image> imageCache){
        String k1 = new String("img1");
        String k2 = new String("img2");
        imageCache.put(k1,new Image("image 1"));
        imageCache.put(k2,new Image("image 2"));
    }

}

class Image{
    private String name;

    public Image(String name){
        this.name=name;
    }
    @Override
    public String toString(){
        return name;
    }

}