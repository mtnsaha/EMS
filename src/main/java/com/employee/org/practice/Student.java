package com.employee.org.practice;

public class Student {
    private String studentName;
    private String studentSubject;
    private int StudentAge;

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSubject() {
        return studentSubject;
    }

    public int getStudentAge() {
        return StudentAge;
    }

    public Student(String studentName, String studentSubject, int studentAge) {
        this.studentName = studentName;
        this.studentSubject = studentSubject;
        StudentAge = studentAge;
    }
}
