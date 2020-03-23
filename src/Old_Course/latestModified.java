package Old_Course;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class latestModified {

    public static String latestFile() {
        String filename = null;
        File dir = new File(System.getProperty("user.home") + "\\Downloads\\");
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            return null;
        }
        File lastModifiedFile = files[0];
        for (int i = 1; i < files.length; i++) {
            if (lastModifiedFile.lastModified() < files[i].lastModified()) {
                lastModifiedFile = files[i];
            }
        }
        filename = lastModifiedFile.toString();
        return filename;
    }

    public static void main (String[] args){
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String line = "";
        String cvsSplitBy = ",";
        String result = null;
        int countExistData = 0;
        int countLine = 0;
        String csvFile = latestFile();
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
        System.out.println("Flie: " + latestFile());


    }
}