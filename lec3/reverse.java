import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        long rem, a = 0;

        while (num > 0) {
            rem = num % 10;
            a = a*10 + rem;
            num /= 10;
        }

        System.out.println(a);

    }


}
