import java.util.Scanner;

public class periParellelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of base: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of side: ");
        int s = sc.nextInt();

        int perimeter = 2 * (s + b);

        System.out.println("Perimeter of parellelogram is " + perimeter);
        sc.close();
    }
}
