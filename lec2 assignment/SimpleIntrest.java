// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter principal amount: ");
        double p = in.nextDouble();

        System.out.print("enter time period(in months): ");
        double t = in.nextDouble();

        System.out.print("enter intrest rate: ");
        float r = in.nextFloat();

        double SI = (p*r*t) / 100;

        System.out.print("simple intrest is " + SI);

        in.close();
    }
}
