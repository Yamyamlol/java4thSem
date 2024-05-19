/* 
      NAME: SANYAM RAWAT
      SECTION: D
      ROLL NO: 58
*/


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class q15TW
{
    public static void main(String[] args) 
    {
        String sourceFile = "source.txt";
        String targetFile = "target.txt";

        System.out.println("\t\t\t******INPUT******");
        copyUsingStreams(sourceFile, targetFile);
        
        System.out.println("\t\t\t******OUTPUT******");
        copyUsingReaders(sourceFile, targetFile);
    }

    public static void copyUsingStreams(String sourceFile, String targetFile)
    {
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(targetFile, true)) { 

            byte[] buffer = new byte[1024];
            int length;

            while ((length = fis.read(buffer)) > 0) 
            {
                fos.write(buffer, 0, length);
            }

            System.out.println("Content copied successfully using FileInputStream and FileOutputStream.");

        }
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

    public static void copyUsingReaders(String sourceFile, String targetFile)
    {
        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(targetFile, true)) { 

            char[] buffer = new char[1024];
            int length;

            while ((length = fr.read(buffer)) > 0) 
            {
                fw.write(buffer, 0, length);
            }

            System.out.println("Content copied successfully using FileReader and FileWriter.");

        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}