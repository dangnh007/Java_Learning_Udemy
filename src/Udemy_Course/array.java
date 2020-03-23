package Udemy_Course;

public class array {
    public static void main(String[] args) {
        int value = 7;
        int[] values;
        values = new int[3];
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {3,4,5,6,7,8};
        for (int i : numbers) {
            System.out.println(i);
        }
    }
}
