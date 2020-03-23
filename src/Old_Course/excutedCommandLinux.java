package Old_Course;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class excutedCommandLinux {
    public static void main (String[] args) throws IOException, InterruptedException {

        Process p = Runtime.getRuntime().exec("find / -name ScheduleReport_2019-11-19_to_2019-11-19.csv");
        p.waitFor();
        BufferedReader buf = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        String line = "";
        String output = "";

        while ((line = buf.readLine()) != null) {
            output += line + "\n";
        }
        System.out.println("Download Path is:" + output);
    }
}
