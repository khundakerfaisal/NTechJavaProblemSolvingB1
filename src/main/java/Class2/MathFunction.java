package Class2;

import java.util.Random;

public class MathFunction {
    public static void main(String[] args) {

        double Number1 = 9.00;
        double Number2 = 4.00;
        double inputValues = 20.49;

        System.out.println("Square value is : " + Math.sqrt(Number1));
        System.out.println("Max value is : " + Math.max(Number1,Number2));
        System.out.println("Min value is : " + Math.min(Number1,Number2));
        System.out.println("Round value is : " + Math.round(inputValues));
        System.out.println("Floor value is : " + Math.floor(inputValues));
        System.out.println("Ceil value is : " + Math.ceil(inputValues));
        System.out.println("Random Value Is : " +Math.round(Math.random()*1000));

        //Random Number Generate
        Random randNumber = new Random();
        String prefixName = "0081";
        int generateDigit = randNumber.nextInt(9999) + 1111;
        String RandomNumberGenerate = prefixName + generateDigit;
        System.out.println("Mobile Number is :" +RandomNumberGenerate);


    }

}
