import java.util.Scanner;

public class areaIsosceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the equal sides of the isosceles triangle: ");
        double equalSide = sc.nextDouble();

        System.out.print("Enter the base of isosceles triangle: ");
        double base = sc.nextDouble();

        double height = Math.sqrt(equalSide * equalSide - (base * base) / 4);
        double area = 0.5 * base * height;

        System.out.println("The area of the isosceles triangle is: " + area);
    }
}
