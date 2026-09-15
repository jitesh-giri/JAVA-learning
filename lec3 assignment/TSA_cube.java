import java.util.Scanner;

public class TSA_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the cube: ");
        double l = sc.nextDouble();

        double tsa = 6 * l * l;
        System.out.println("The total surface area of the cube is: " + tsa);
        sc.close();
    }
    
}
