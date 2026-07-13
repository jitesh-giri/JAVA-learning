import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        float b = sc.nextFloat();

        System.out.print("Enter the height of the triangle: ");
        float h = sc.nextFloat();

        float area = b * h;

        System.out.println("Area of th rectangle is " + area);

        sc.close();
    }
}
