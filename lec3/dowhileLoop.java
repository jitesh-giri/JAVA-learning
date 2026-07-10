import java.util.Scanner;

public class dowhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the num: ");
        int n = sc.nextInt();

        do {
            System.out.println(n);
            n++;
        } while (n < 1);

        sc.close();

    }
    
}
