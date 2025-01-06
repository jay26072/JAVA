/* 40.Write a java program to demonstrate the way contents are read from a file.*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex40 
{
    public static void main(String[] args) throws IOException {
        File file = new File("Ex36.txt");
        FileReader reader = new FileReader(file);
        int i;
        while((i=reader.read())!=-1)
        {
            System.out.print((char)i);
        }
        reader.close();
    }
}