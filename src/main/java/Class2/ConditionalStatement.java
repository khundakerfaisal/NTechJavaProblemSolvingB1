package Class2;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner inputAmount = new Scanner(System.in);
        System.out.println("Enter Amount : ");
        int cashAmount = inputAmount.nextInt();
        if (cashAmount >= 100 && cashAmount <= 110) {
            System.out.println("Can get two ice cream");
        } else if (cashAmount >= 50) {
            System.out.println("CAN GET one ice cream");
        } else {
            System.out.println("More money needed !!");
        }
    }
}
