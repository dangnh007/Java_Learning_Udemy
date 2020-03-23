package Udemy_Course;

public class workingWithLoops {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        while (i < 20) {
            System.out.println("The value of i is: " + i);
            i++;
        }

        do {
            System.out.println("The value of j is: " + j);
            j++;
        } while (j < 30);

        for (int k = 30; k < 40; k++) {
            System.out.println("The value of k is: " + k);
        }

        int m = 0;
        while(true){
            System.out.println("Value of loop is: " + m);
            if (m==5){
                break;
            }
            m++;
        }
    }
}
