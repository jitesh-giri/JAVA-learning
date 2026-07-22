import java.util.Scanner;

public class periRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Side of Rhombus is: ");
        int side = sc.nextInt();

        int perimeter = side * 4;

        System.out.println("Perimeter of rhombus is " + perimeter);

        sc.close();
    }
}