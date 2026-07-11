import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");

        int n = sc.nextInt();

        int a = 0, b = 1, c;

        System.out.println("fibonacci series upto " + n + " terms are");

        for (int i = 1; i <= n; i++) {
            
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        sc.close();
    }
}
