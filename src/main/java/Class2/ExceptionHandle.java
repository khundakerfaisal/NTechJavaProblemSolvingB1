package Class2;

import java.util.Scanner;

public class ExceptionHandle {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter  number");
            int Number1 = input.nextInt();
            System.out.println("Enter  number");
            int Number2 = input.nextInt();
            System.out.println("The Int number is " + Number1 + " " + Number2);

        } catch (Exception e) {
            System.out.println("You entered double number");
        }
    }



}
