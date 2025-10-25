package Class3;

public class ArrayList {
    public static void main(String[] args) {
        java.util.ArrayList<String> fruits= new java.util.ArrayList<>();
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.remove("Banana");

        System.out.println(fruits);

//        String [] arrConvert=fruits.toArray(new String[0]);  //Array list convert to 1d array
//        System.out.println(arrConvert[0]);

    }
}
