import java.util.Scanner;

public class RupeeDollor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter amount in rupees: ");
        double a = in.nextDouble();

        System.out.println("conversion is be done by the exchange rate on 25 june 2026 i.e. 1$ = ₹94.44");

        double b = a / 94.44 ;
        
        System.out.println("amount in dollor will be " + b);

        in.close();
    }
}
