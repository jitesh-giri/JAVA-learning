// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class calculator_ifElse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = in.nextFloat();

        System.out.print("Enter second number: ");
        float b = in.nextFloat();

        System.out.print("Enter an operator (+, -, *, /): ");
        char op = in.next().charAt(0);
        
        float result ;

        if (op == '+') {
            result = a + b ;
            System.out.println("sum = " + result);
        }
        else if (op == '-') {
            result = a - b ;
            System.out.println("difference = " + result);
        }
        else if (op == '*') {
            result = a * b ;
            System.out.println("product = " + result);
        }
        else if (op == '/'){
            if (b != 0) {
                result = a / b ;
                System.out.println("quotient = " + result);
            }
            else {
                System.out.println("not divisible by zero");
            }
        }
        else {
            System.out.println("Invalid operator");
        }

        in.close();
    }
}
