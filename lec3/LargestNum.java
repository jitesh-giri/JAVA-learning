import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first num: ");
        int a = sc.nextInt();

        System.out.print("Enter first num: ");
        int b = sc.nextInt();

        System.out.print("Enter first num: ");
        int c = sc.nextInt();

        int max = a;

        // method 1

        // if (b > max) {
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        // }

        // method 2
        max = Math.max(c, Math.max(a, b));


        System.out.println(max);

        sc.close();
    }
}
