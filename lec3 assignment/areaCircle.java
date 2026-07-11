import java.util.Scanner;

public class areaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");

        double r = sc.nextDouble();
        double pi = 22/7;

        double area = pi*r*r;

        System.out.println("Area of the circle is " + area );

        sc.close();
    }
}
