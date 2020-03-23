package Old_Course;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateTime {
    public static void main (String[] args){
        Calendar cal = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        cal.add(Calendar.DATE, -12775);
        System.out.println("Yesterday's dat "+dateFormat.format(cal.getTime()));
    }
}
