package Conditional;

import java.util.*;

public class Test3 {
    public static void main(String args[]) {

        int age = 12;

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
