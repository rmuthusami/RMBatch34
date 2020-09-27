package Operators;

public class    BooleanLogicalOperator_2 {
    public static void main(String[] args) {
        int age1 = 15;
        int age2 = 21;

        boolean canPlaySoccer = (age1++ > 20) & (age2++ > 20); //Post Increment
        // & if the left is false , it will still go to the right for checking...
        // && if the left is false , it will not go to the right for checking...

        System.out.println( "CanPlaySoccer " + canPlaySoccer);

        System.out.println("age1 =" + age1 + " age2 =" +age2);

        canPlaySoccer = (age1++ > 20) | (age2++ > 20);
        System.out.println( "CanPlaySoccer " + canPlaySoccer);


    }
}
