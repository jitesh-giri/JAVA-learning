import java.util.Scanner;

public class volumeCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double pi = 3.14;

        System.out.print("Enter the radius: ");
        double r = sc.nextDouble();
        
        System.out.print("Enter the Height: ");
        double h = sc.nextDouble();

        double volume = (pi * r * r * h)* (1.0/3.0);

        System.out.println("Volume of the cone: " + volume);

        sc.close();
    }
}
