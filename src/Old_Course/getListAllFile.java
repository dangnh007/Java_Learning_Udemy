package Old_Course;

import java.io.File;

public class getListAllFile {
    public static void main(String[] args)
    {
        String dirPath = System.getProperty("user.home") + "\\Downloads\\";
        File folder = new File(dirPath);
        File[] files = folder.listFiles();
        for (File file : files)
        {
            System.out.println(file.getName());
            System.out.println(dirPath);
        }
    }
}
