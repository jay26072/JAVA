/* 25.Assume that there are two packages, student and exam. A student package contains Student class and the exam package contains Result class. Write a program that generates mark sheet for students.*/

import exam.Result;
import student.Student;

public class Ex25 {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Jay", "Male");
        Result result1 = new Result(student1, 85);
        result1.generateMarkSheet();

        Student student2 = new Student(102,"Kevin", "Male");
        Result result2 = new Result(student2, 70);
        result2.generateMarkSheet();
    }
}

