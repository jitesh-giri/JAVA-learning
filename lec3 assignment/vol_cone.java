import java.util.Scanner;

public class vol_cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the cone: ");
        double radius = sc.nextDouble();

        System.out.print("Enter the height of the cone: ");
        double height = sc.nextDouble();

        double volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;

        System.out.println("The volume of the cone is: " + volume);

        sc.close();
    }
}