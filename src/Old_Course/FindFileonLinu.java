package Old_Course;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class FindFileonLinu {
    public static void main (String[] args) throws IOException, InterruptedException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = new Date();
        String command = "find / -name ScheduleReport_" + dateFormat.format(date) + "_to_" + dateFormat.format(date) + ".csv";
        Process p = Runtime.getRuntime().exec(command);
        p.waitFor();
        BufferedReader buf = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        String line = "";
        String output = "";

        while ((line = buf.readLine()) != null) {
            output += line;
        }
        System.out.println(dateFormat.format(date));
    }
}
