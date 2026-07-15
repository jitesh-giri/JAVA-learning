import java.util.Scanner;

public class areaParllelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        float base = sc.nextFloat();

        System.out.print("Enter the height: ");
        float height = sc.nextFloat();

        float area = base * height;

        System.out.println("Area of the parllelogram is " + area);

        sc.close();
    }
}
