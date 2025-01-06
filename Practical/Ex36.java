/* 36.Write a program in Java to create, write, modify, read operations on a Text file.*/

import java.io.*;
class Ex36
{
    public static void main(String[] args) throws IOException
    {
        File file = new File("Ex36.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write("Hello World \n");
        writer.close();
        FileReader reader = new FileReader(file);
        int i;
        while((i=reader.read())!=-1)
        {
            System.out.print((char)i);
        }
        reader.close();
        FileWriter writer2 = new FileWriter(file);
        writer2.write("Hello World Again");
        writer2.close();
        FileReader reader2 = new FileReader(file);
        int j;
        while((j=reader2.read())!=-1)
        {
            System.out.print((char)j);
        }
        reader2.close();
    }
}