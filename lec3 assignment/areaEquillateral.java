import java.util.Scanner;

public class areaEquillateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the side of the equilateral triangle: ");
        float s = sc.nextFloat();

        double area = (Math.sqrt(3) * s * s)* 1/4;

        System.out.println("Area of the equillateral trianglr is " + area);

        sc.close();
    }
}
