package Old_Course;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReadCSV {
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String line = "";
        String cvsSplitBy = ",";
        String result = null;
        int countExistData = 0;
        int countLine = 0;
        String csvFile = System.getProperty("user.home") + "\\Documents\\" + "ScheduleReport_2019-11-22_to_2019-11-22 (2).csv";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                if (!country[0].contains("TEST AUTOMATION SITE") || !country[1].contains(dateFormat.format(date) + " 11:00 PM")){
                    countExistData = countExistData + 1;
                }
                countLine = countLine + 1;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (countExistData == 1 && countLine > 1){
            result = "PASSED";
        }
        else {
            result = "FAILED";
        }
        System.out.println(result);
        System.out.println("Count exist: " + countExistData);
        System.out.println("Count line: " + countLine);

    }
}
