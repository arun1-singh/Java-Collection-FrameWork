package cf;

public class hashdemo {
    public static void main(String[] args) {
        System.out.println(simpleHash("Arun"));
        System.out.println(simpleHash("ABC"));
        System.out.println(simpleHash("CBA"));
    }
    public static int simpleHash(String key) {
        int sum =0;
        for (char c : key.toCharArray()) {
            sum += (int) c;
        }
        return sum % 10;
    }
}
