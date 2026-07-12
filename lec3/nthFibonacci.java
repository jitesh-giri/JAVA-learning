import java.util.Scanner;

public class nthFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0, b = 1;
        int count = 2, temp;

        while (count <= n) {
            temp = b;
            b += a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}
