package array;

public class ArrayExample_Loop {
    public static void main(String[] args) {
        int heights[] = {2,3,4,5,6,7,8};
        String names[] = {"Peter", "Pan", "Sam","Gagan"};

        System.out.println("length = " + names.length);
        for(int i = 0; i <  4; i++) {
            System.out.println("names[" + i + "]" + names[i]);
        }

        System.out.println("============WHILE Loop===========");
        int j = 0;

        while (j < names.length) {
            System.out.println("names[" + j + "]" + names[j]);
            j++;
        }

        System.out.println("============ DO WHILE Loop===========");
        int k = 0;

        do  {
            System.out.println("names[" + k + "]" + names[k]);
            k++;
        } while (k < names.length);
        System.out.println("I am done...");
    }
}
