// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class palindrome_or_not {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String num = sc.nextLine();

        String rev = "";

        for(int i = num.length() - 1; i >= 0; i--){
            rev = rev + num.charAt(i);
        }

        if(num.equals(rev)){
            System.out.println(num + " is a Palindrome.");
        }
        else{
            System.out.println(num + " is not a Palindrome.");
        }

        sc.close();
    }
}
