package Udemy_Course;

public class workingWithText {
    public static void main(String[] args) {

        String STRING = "Dang da banh";
        String STRING2 = "Dang choi guitar";
        String STRING3 = "Dang choi game";
        String STRING4 = "Dang nau an";
        String STRING5 = "Dang pha cafe";
        String STRING6 = STRING + " @ " + STRING2 + " @ " + STRING3 + " @ " + STRING4 + " @ " + STRING5;

        System.out.println(STRING6);

        String[] arrList = STRING6.split("@ ", 3);
        for (String a : arrList) {
            System.out.println(a);
        }


    }
}
