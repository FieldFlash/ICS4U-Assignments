package main;

public class Student extends Person{
    private int studentId;

    public Student() {
        this.studentId = 0;
    }

    public Student(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    
    public String toStringStudent() {
        return "Student ID: " + this.studentId;
    }
}
