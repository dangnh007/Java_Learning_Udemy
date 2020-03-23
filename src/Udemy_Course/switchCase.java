package Udemy_Course;

import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Please input the number of option: ");
        int option = number.nextInt();
        switch (option) {
            case 1 :
                System.out.println("This is number one");
                break;
            case 2 :
                System.out.println("This is number one");
                break;
            case 3 :
                System.out.println("This is number three");
                break;
            default:
                System.out.println("This is other number");
        }
    }
}
