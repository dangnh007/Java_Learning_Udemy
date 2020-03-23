package Udemy_Course;

public class usingVariables {
    public static void main(String[] args){

        /**
         * byte: The byte data type is an 8-bit signed two's complement integer. It has a minimum value of -128 and a maximum value of 127 (inclusive).
         * The byte data type can be useful for saving memory in large arrays, where the memory savings actually matters.
         * They can also be used in place of int where their limits help to clarify your code; the fact that a variable's range is limited can serve as a form of documentation.
         */
        byte BYTE = 127;

        /**
         * short: The short data type is a 16-bit signed two's complement integer. It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
         * As with byte, the same guidelines apply: you can use a short to save memory in large arrays, in situations where the memory savings actually matters.
         */
        short SHORT = -32768;

        /**
         * By default, the int data type is a 32-bit signed two's complement integer, which has a minimum value of -2^31 and a maximum value of 2^31-1.
         * In Java SE 8 and later, you can use the int data type to represent an unsigned 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1
         */
        int INT = 2147483647;

        /**
         * The long data type is a 64-bit two's complement integer. The signed long has a minimum value of -2^63 and a maximum value of 2^63-1.
         * In Java SE 8 and later, you can use the long data type to represent an unsigned 64-bit long, which has a minimum value of 0 and a maximum value of 264-1
         */
        long LONG = 9223372036854775807L;

        /**
         * float: The float data type is a single-precision 32-bit IEEE 754 floating point
         */
        float FLOAT = 2147483647.2f;

        /**
         * The double data type is a double-precision 64-bit IEEE 754 floating point.
         */
        double DOUBLE = 92233720368547758065.45;
        char CHAR = 'g';
        boolean BOOLEAN = false;

        String parseInt = "20";
        int afterParseInt = Integer.parseInt(parseInt);

        System.out.println(BYTE);
        System.out.println(SHORT);
        System.out.println(INT);
        System.out.println(LONG);
        System.out.println(FLOAT);
        System.out.println(DOUBLE);
        System.out.println(CHAR);
        System.out.println(BOOLEAN);
        System.out.println(parseInt);
        System.out.println(afterParseInt);

    }
}
