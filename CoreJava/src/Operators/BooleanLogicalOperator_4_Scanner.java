package Operators;

import java.util.Scanner;

public class BooleanLogicalOperator_4_Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First Age");
        int age1 = scanner.nextInt();
        System.out.println("Please Enter Second Age");
        int age2 = scanner.nextInt();

        boolean canPlaySoccer = (age1++ > 20) || (age2++ > 20); //Post Increment

        if (canPlaySoccer) {
            System.out.println("Can Play Soccer");
        } else {
          System.out.println("Sorry cannot play soccer");
        }
    }
}
