import java.util.Scanner;

public class volumePrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        System.out.print("Enter length of prism: ");
        double length = sc.nextDouble();

        double volume = 0.5 * base * height * length;   // volume = base area * length

        System.out.println("Volume of Triangular Prism = " + volume);

        sc.close();
    }
}