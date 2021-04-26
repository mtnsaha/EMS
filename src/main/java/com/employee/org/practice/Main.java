package com.employee.org.practice;

import java.util.LinkedList;

public class Main {
    public static  void main(String[] args) {
        LinkedList<Student> mylinklist = new LinkedList<>();
       mylinklist.add(new Student("akash","physics",22));
        mylinklist.add(new Student("prakash","geography",20));
        mylinklist.add(new Student("rahul","literature",19));
        mylinklist.add(new Student("rekha","biology",25));
        mylinklist.add(new Student("amrita","history",21));

        for (Student st: mylinklist)
        {
            System.out.println(st.getStudentSubject()+" "+st.getStudentName()+"  "+st.getStudentAge());
        }


        mylinklist.remove(4);

        for (Student st: mylinklist)
        {
            System.out.println(st.getStudentSubject()+" "+st.getStudentName()+"  "+st.getStudentAge());
        }

    }

}
