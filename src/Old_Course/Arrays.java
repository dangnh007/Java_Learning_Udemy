package Old_Course;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Arrays {
    public static void main(String[] args) {
        String home = System.getProperty("user.home");
        String s = "File is not exist";
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String fileName = "ScheduleReport_" + dateFormat.format(date) + "_to_" + dateFormat.format(date) + ".csv";
        String downloadPath = "D:\\Download\\";
//                System.getProperty("user.home") + "\\Downloads";
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();
        for (int i = 0; i < dirContents.length; i++) {
            if (s == "File is not exist") {
                if (dirContents[i].getName().equals(fileName)) {
                    s = "File is exist";
                }
            }
        }
            System.out.println(s);
            System.out.println(fileName);
            System.out.println(home);

        }


}


