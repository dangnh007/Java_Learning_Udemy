package Udemy_Course;

import java.util.Scanner;

public class gettingUserInput {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name, age and salary:");
        String name = input.nextLine();

        // Numerical input
        int age = input.nextInt();
        double salary = input.nextDouble();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);

        int number;
        do {
            System.out.println("Please enter the number:");
            number = input.nextInt();
        } while (number != 5);
    }
}
