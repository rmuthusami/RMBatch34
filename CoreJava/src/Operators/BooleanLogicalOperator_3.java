package Operators;

public class BooleanLogicalOperator_3 {
    public static void main(String[] args) {
        System.out.println(args[0] + " " +  args[1]);

        int age1 = Integer.parseInt(args[0]);
        int age2 = Integer.parseInt(args[1]);

        boolean canPlaySoccer = (age1++ >20) || (age2++ > 20); // post increment

        if (canPlaySoccer)
            System.out.println("can Play Soccer");
        else
            System.out.println("can not Play Soccer");
    }
}
