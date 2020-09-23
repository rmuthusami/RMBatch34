package array;

import com.sun.jdi.PathSearchingVirtualMachine;

public class ArrayExample_2D_2 {
    public static void main(String[] args) {
        int ages[] = {5,6,7,8,9};
        int height[] = {6,4,5,3,6};

        for (int i = 0; i < ages.length; i++) {
            System.out.println("age = " + ages[i] + " with height = " + height[i]);
        }

        int details_1[][] = new int[10][2];

        int details[][] = { {5,6}, {6,4}, {7,5}, {8,3}, {9,6}};
        System.out.println(details.length);

        System.out.println(details[0][0]);
        System.out.println(details[0][1]);

    }
}
