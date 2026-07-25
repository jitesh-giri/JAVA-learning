import java.util.Scanner;

public class volumeSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of sphere: ");
        double r = sc.nextDouble();
        double pi = 3.14159;

        double volume = (4.0/3.0) * pi * r * r * r;
        
        System.out.println("Volume of the sphere is: " + volume);
        sc.close();

    }
}
