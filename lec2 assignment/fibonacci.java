import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         System.out.print("Enter the number of terms for Fibonacci series: ");

         int n = in.nextInt();

         int a = 0, b = 1, c;

         System.out.print("Fibonacci series up to " + n + " terms: ");

            for (int i = 1; i <= n; ++i){

                System.out.print(a + " ");

                c = a + b;
                a = b;
                b = c;
            }
         in.close();
    }
}
