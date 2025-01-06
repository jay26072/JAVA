/* 38.Write a java program to checks the existence of a specified file.*/

import java.io.File;

public class Ex38 {

    public static void main(String[] args) {

        File my_file_dir = new File("Ex38.java");

        if (my_file_dir.exists()) {

            System.out.println("The directory or file exists.\n");
        } else {

            System.out.println("The directory or file does not exist.\n");
        }

    }
}
