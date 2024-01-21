package Conditional;

import java.util.*;

public class even_odd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Numbers: ");
        double N = sc.nextDouble();

        if (N % 2 == 0) {
            System.out.println("Its an Even Number");
        } else {
            System.out.println("Its an Odd Number");
        }

    }

}
