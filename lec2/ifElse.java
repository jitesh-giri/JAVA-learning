

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if (a >= 18 ) {
            System.out.println("Eligible for voting");
        }
        else {
            System.out.println("Not eligible for voting");
        }
    }
}   
