import java.util.Scanner;

public class areaRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of the first diagonal: ");
        float d1 = sc.nextFloat();

        System.out.print("Enter the value of the second diagonal: ");
        float d2 = sc.nextFloat();

        float area =  (d1 * d2)*1/2;

        System.out.println("Area of the rhombus is " + area);

        sc.close();
    }
}
