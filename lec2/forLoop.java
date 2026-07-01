

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        for(int num = 1; num <= a; num++){
        //    System.out.print(num + " ");  
              System.out.println("Hello World");      
        }

        in.close();
    }
}
