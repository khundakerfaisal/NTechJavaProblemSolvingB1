package Class1;

public class TypeCasting {
    public static void main(String[] args) {
//        float number=4000.00f;        //Widening casting
//        double numberDouble=number;
//        System.out.println(numberDouble);

        String name="Arif";

        double number = 10.35;      //Narrowing casting
        int numberInt = (int) number;
        System.out.println("Integer number is : "+numberInt);
    }
}
