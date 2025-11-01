package OOPClass2;

public class PolymorphismMethodOverloading {

    public void sumOfNumber(int a, int b) {
        int addValue = a + b;
        System.out.println("First overloading : " + addValue);
    }

    public void sumOfNumber(int a, int b, int c) {
        int addValue = a + b + c;
        System.out.println("Second overloading : " + addValue);
    }

    public void sumOfNumber(int a, int b, int c, int d) {
        int addValue = a + b + c - d;
        System.out.println("Third overloading : " + addValue);
    }

    public static void main(String[] args) {
        PolymorphismMethodOverloading overloading = new PolymorphismMethodOverloading();
        overloading.sumOfNumber(10, 5);
        overloading.sumOfNumber(10, 20,30);
        overloading.sumOfNumber(10, 20, 30,10);

    }
}
