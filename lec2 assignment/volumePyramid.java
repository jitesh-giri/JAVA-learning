import java.util.Scanner;

public class volumePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base length of the pyramid: ");
        double baseLength = sc.nextDouble();

        System.out.print("Enter the height of the pyramid: ");
        double height = sc.nextDouble();

        double volume = (1.0/3.0) * baseLength * baseLength * height;
        System.out.println("The volume of the pyramid is: " + volume);

        sc.close();
    }
}