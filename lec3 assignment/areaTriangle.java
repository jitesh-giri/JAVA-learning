import java.util.Scanner;

public class areaTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the height of the triangle: ");
        float h = sc.nextFloat();

        System.out.print("Enter the base of the triangle: ");
        float b = sc.nextFloat(); 

        double area = 0.5 * b * h;

        System.out.print("Area of the trianglr is " + area);

        sc.close();
    }
}
