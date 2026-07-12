import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        float a = sc.nextFloat();

        System.out.print("Enter the second number: ");
        float b = sc.nextFloat();

        System.out.print("Enter the operator: ");
        char op = sc.next().trim().charAt(0);

        float temp;

        if (op == '+') {
            temp = a + b;
            System.out.println(temp);
        }
        else if (op == '-') {
            temp = a - b;
            System.out.println(temp);
        }
        else if (op == '*') {
            temp = a * b;
            System.out.println(temp);
        }
        else if (op == '/') {
            temp = a / b;
            System.out.println(temp);
        }
        else{
            System.out.println("Invalid operator");
        }

        sc.close();
    }
}
