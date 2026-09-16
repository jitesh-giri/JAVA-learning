import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = sc.nextInt(); 
        int a = 0;
        int b = 1;

        for (int i = 0; i <= n; i++) {
            System.out.println(a);
            int sum = a + b;
            a = b;
            b = sum;
        }

        sc.close();
    }
}
