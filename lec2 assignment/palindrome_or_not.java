// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class palindrome_or_not {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String num = sc.nextLine();

        String temp = num;
        String rev = "";
        int rem;

        for(int i = temp.length() - 1; i >= 0; i--){
            rev = rev + temp.charAt(i);
        }

        if(num.equals(rev)){
            System.out.println(num + " is a Palindrome.");
        }
        else{
            System.out.println(num + " is not a Palindrome.");
        }
    }
}
