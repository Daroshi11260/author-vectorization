
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class FileHelper
{
    public static String getFileContents(String filename)
    {
        String result = "";
        try {
            Scanner file = new Scanner(new File(filename));
            while (file.hasNextLine())
            {
                String line = file.nextLine();
                if (line.length()>0)
                    result += line + " ";
            }
            file.close();
        } catch(FileNotFoundException ex) {
            System.out.println("File not found: " + filename);
            ex.printStackTrace();
        }
        return result;

    }
}
