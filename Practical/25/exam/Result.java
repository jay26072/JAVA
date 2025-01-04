package exam;
import student.Student;
public class Result {
     Student student;
     int marks;

    public Result(Student student, int marks) {
        this.student = student;
        this.marks = marks;
    }

    public void generateMarkSheet() {
        System.out.println("********** Mark Sheet **********");
        System.out.println("Enrollment No: " + student.getEnrollmentNo());
        System.out.println("Name         : " + student.getName());
        System.out.println("Gender       : " + student.getGender());
        System.out.println("Marks        : " + marks);
        System.out.println("********************************");
    }
}
