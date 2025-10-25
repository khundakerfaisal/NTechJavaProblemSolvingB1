package Class3;

public class HashSet {
    public static void main(String[] args) {

        java.util.HashSet<Integer> set = new java.util.HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10); // Duplicate, will be ignored
        set.add(30);
        System.out.println(set);
    }

}

