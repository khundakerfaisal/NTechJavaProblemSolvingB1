package Class1;

import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        //comparison Operator
            int a1 = 10;
            int b1 = 5;
            System.out.println("A is Grater then B \n" + (a1 > b1));

        // Assignment Operator
            int value3 = a1;
            System.out.println("Assignment operator: " + value3);


    //Logical Operator
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input age ..:");
        int value2 =sc.nextInt();
        boolean age = value2<=16;
        if (age){

            System.out.println("You are input the wrong age");

        }
        else {    System.out.println("You are input the correct age");
        }
    //Bit-wise operator
        int a = 5; // Binary: 0101
        int b = 3; // Binary: 0011
        System.out.println(a & b);




    }
}
