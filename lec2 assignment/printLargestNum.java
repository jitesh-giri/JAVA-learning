// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class printLargestNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = in.nextInt();

        System.out.print("Enter second number: ");
        int b = in.nextInt();

        if (a > b) {
            System.out.println(a + " is bigger than " + b);
        }
        else if (b > a) {
            System.out.println(b + " is bigger than " + a);
        }
        else {
            System.out.println("both are equal");
        }

        in.close();
    }
}
