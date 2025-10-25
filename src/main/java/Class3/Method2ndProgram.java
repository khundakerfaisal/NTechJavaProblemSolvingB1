package Class3;

public class Method2ndProgram {
    public void addNumber(int a, int b) {
        int sumOfAmount = a + b;
        System.out.println("Sum of amount is : " + sumOfAmount);
    }

    public static void main(String[] args) {
        Method2ndProgram sumOfValue = new Method2ndProgram();
        sumOfValue.addNumber(10, 12);
    }
}
