package Operators;

public class PrePostIncrement {
    public static void main(String[] args) {
        int age1 = 5;
        int age2 = 5;

        age1 = age1++; //Post Increment; First assign and then increment
        age2 = ++age2; //Pre Increment; First increment then assign
        System.out.println(age1);
        System.out.println(age2);
    }
}
