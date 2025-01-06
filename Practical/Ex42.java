/* 42.Write a java program to count the availability of text lines in the particular file. 
    A file is read before counting lines of a particular file.*/

import java.io.*;

class Ex42
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("Ex36.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        int count = 0;
        while(line != null)
        {
            count++;
            line = br.readLine();
        }
        System.out.println("Total number of lines: " + count);
        br.close();
    }
}