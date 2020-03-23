package Old_Course;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example {
    public static void main(String[] args){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String Command = "find / -name ScheduleReport_" + dateFormat.format(date) + "_to_" + dateFormat.format(date) + ".csv";
        System.out.println(Command);
    }
}
