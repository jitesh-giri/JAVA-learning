import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");

        int num = sc.nextInt();

        while (num < 5) {
            System.out.println(num);

            num += 1;
        }
    }
}
