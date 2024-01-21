package Conditional;

import java.util.*;

public class if_else {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Age: ");
        double age = sc.nextDouble();

        if (age >= 18) {
            System.out.println("Eligible to Vote");
            System.out.println("Eligible to Drive");
        } else if (age > 13 && age < 18) {
            System.out.println("You are Teenager");
        } else {
            System.out.println("Not Adult");
        }
    }

}
