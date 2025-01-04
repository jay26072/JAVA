/*13.Write a program in Java to demonstrate use of this keyword. Check whether this can access the Static variables of the class or not. 
[Refer class student in Q12 to perform the task] */

class Student {

    int enrollmentNo;
    String name;
    String gender;
    int marks;

    public Student() {
        enrollmentNo = 5;
        name = "Demo";
        gender = "male";
        marks = 50;
    }

    public Student(int en, String nm, String gn, int mk) {
        this.enrollmentNo = en;
        this.name = nm.toUpperCase();
        this.gender = gn.toUpperCase();
        this.marks = mk;
    }

    public int getEnrollmentNo() {
        return (this.enrollmentNo);
    }

    public void setEnrollmentNo(int en) {
        this.enrollmentNo = en;
    }

    public String getName() {
        return (this.name);
    }

    public void setName(String nm) {
        this.name = nm.toUpperCase();
    }

    public String getGender() {
        return (this.gender);
    }

    public void setGender(String gn) {
        this.gender = gn.toUpperCase();
    }

    public int getMarks() {
        return (this.marks);
    }

    public void displayStudent() {
        System.out.println("***********************");
        System.out.println("Enrollment No : " + this.getEnrollmentNo());
        System.out.println("Student Name  : " + this.getName());
        System.out.println("Gender        : " + this.getGender());
        System.out.println("Marks         : " + this.getMarks());
        System.out.println("***********************");
    }
}

class Ex13 {

    public static void main(String args[]) {

        Student s = new Student();
        s.displayStudent();

        Student s1 = new Student(1, "Jay", "male", 100);
        s1.displayStudent();
    }
}
