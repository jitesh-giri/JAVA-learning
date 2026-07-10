import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //type casting
        int num = (int)(65.28f);
        System.out.println(num); 
        
        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);

        byte c = 20;
        byte d = 50;
        byte e = 100;
        int f = (c * d) / e;
        System.out.println(f);

    }
}
