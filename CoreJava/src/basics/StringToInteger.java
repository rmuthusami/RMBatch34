package basics;

public class StringToInteger {
    public static void main(String[] args) {
        String one = "1";

        int two = 2;
        // to convert a integer string to a integer use Integer.parseInt();
        int oneInt = Integer.parseInt(one);
        System.out.println(oneInt + two);
    }
}
