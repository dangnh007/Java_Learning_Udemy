package Old_Course;

import java.security.SecureRandom;

public class RandomInt {

    public static String Makerandomnumber(){
        SecureRandom random = new SecureRandom();
        int randomNumber = random.nextInt(999_999_999) + 100_000_000;
        return Integer.toString(randomNumber);
    }

    public static void main(String[] args){
        String a = RandomInt.Makerandomnumber();
        String X = "/api/eda/v1/participants/" + a + "/info";
        String Y = "Check number: " + a ;
        System.out.println(X);
        System.out.println(Y);
    }
}
