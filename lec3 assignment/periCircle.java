import java.util.Scanner;

public class periCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the: ");
        double r = sc.nextInt();
        double pi = 3.14;

        double perimeter = 2 * pi * r;

        System.out.println("Perimeter of the circle is " + perimeter);

        sc.close();
    } 


}
