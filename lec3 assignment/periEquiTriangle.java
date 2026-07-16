import java.util.Scanner;

public class periEquiTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the equal side of the equillateral triangle: ");

        int s = sc.nextInt();
        int peri = 3*s;
        
        System.out.println("The perimeter of the equilateral tirangle is " + peri);

        sc.close();
    }
}
