package Class3;

import java.util.HashMap;

public class Hasmap {
    public static void main(String[] args) {
        HashMap<String,Integer> marks=new HashMap<>();
        marks.put("A+",85);
        marks.put("A-",80);
        marks.put("A",70);
        System.out.println(marks);
        System.out.println(marks.get("A-"));


    }
}
