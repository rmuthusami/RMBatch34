package Operators;

public class BooleanLogicalOperators {
    public static void main(String[] args) {
        boolean issame = (5 == 7); // false
        System.out.println(issame);
        System.out.println(!issame);

        boolean isTrue = 100/4 > 20;  // true
        System.out.println(!isTrue);

        boolean finalResult = issame;
        System.out.println(finalResult);

        System.out.println(!true);
    }
}
