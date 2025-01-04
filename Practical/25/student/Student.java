package student;

public class Student {
     int enrollmentNo;
     String name;
     String gender;

    public Student(int enrollmentNo, String name, String gender) {
        this.enrollmentNo = enrollmentNo;
        this.name = name;
        this.gender = gender;
    }

    public int getEnrollmentNo() {
        return enrollmentNo;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }
}