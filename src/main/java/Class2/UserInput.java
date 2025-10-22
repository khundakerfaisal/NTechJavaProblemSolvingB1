package Class2;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner inputName = new Scanner(System.in);
        System.out.println("Enter First Name :");
        String firstName = inputName.nextLine();
        System.out.println("Enter Last Name :");
        String lastName = inputName.nextLine();
//        System.out.println("Full name is : " + firstName );
        System.out.println("Full name is : " + firstName + " " + lastName);
    }
}
