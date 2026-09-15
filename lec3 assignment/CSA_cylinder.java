import java.util.Scanner;

public class CSA_cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of cylinder: ");
        float r = sc.nextFloat();
        
        System.out.print("Enter the height of the cylinder: ");
        float h = sc.nextFloat();

        double csa = 2 * 3.14 * r * h;
        System.out.println("Curved surface area of the cylinder is: " + csa);

        sc.close();
    }

}
