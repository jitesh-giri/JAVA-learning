import java.util.Scanner;

public class recurring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number: ");
    int num = sc.nextInt();
    
    System.out.print("Enter which term is to be tracked for occurences: ");
    int n = sc.nextInt();

    int count = 0;

    while (num > 0) {
        int rem = num % 10;

        if (rem == n) {
            count++;
        }

        num /= 10; 
        
    }
    System.out.println("The number of occurences of " + n + " is: " + count + " times.");

    sc.close();
    }
    
}
