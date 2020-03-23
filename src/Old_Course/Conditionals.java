package Old_Course;

public class Conditionals {
        public static void main(String[] args) {
            String a = "Wow";
            String b = "Wow";
            String k = "DN";
            String c = a;
            String d = c;
            //Compare equal
            boolean b1 = a == b;
            //Compare equal
            boolean b2 = b.equals(d);
            //Compare diff
            boolean b3 = !c.equals(k);
            String attempt = "try to ";
            //Logic compare 3 thang same result
            if (!"try to ".equals(attempt)) {
                System.out.println("Success!");
            }
            else {
                System.out.println("Fail!");
            }

            int e = 5;
            //neu bang tra ve 4, neu khac tra ve 8
            int result = e == 4 ? 1 : 8;
//            System.out.println(result);
//            System.out.println(a);
//            System.out.println(b);
//            System.out.println(b1);
//            System.out.println(b2);
//            System.out.println(b3);

        }
    }
