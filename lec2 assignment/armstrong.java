import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int t1 = num;
        int sum = 0;
        int digit;

        while(t1 > 0){
            digit = t1 % 10;
            sum = sum + digit*digit*digit;
            t1 = t1 / 10;
        }

        if (sum == num) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
        sc.close();
    }
}
