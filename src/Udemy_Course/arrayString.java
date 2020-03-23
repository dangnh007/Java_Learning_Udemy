package Udemy_Course;

public class arrayString {
    public static void main(String[] args) {
        String[] words = new String[3];
        words[0] = "Hello";
        words[1] = "All";
        words[2] = "World";
        int i=0;
        do {
            System.out.println(words[i]);
            i++;
        } while (i<words.length);

        String[] fruits = {"Apple", "Kiwi", "Banana", "Orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        String[] tests = new String[2];
        for (String test : tests) {
            System.out.println(test);
        }
        tests[0] = "abd";
        for (String test : tests) {
            System.out.println(test);
        }
    }
}

