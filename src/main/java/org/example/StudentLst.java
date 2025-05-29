package org.example;

import java.util.Scanner;

public class StudentLst {

    public static void main(String[] args) {
        Student[] students= new Student[2];
        Scanner inScanner = new Scanner(System.in);

        for(int i=0; i< students.length;i++){
            System.out.print("Enter student's name: ");
            String name = inScanner.nextLine();
            Student student = new Student(name);

            students[i]= student;

        }
        System.out.println(printOutput(students));
    }

    // This is to create a string of student names
    public static String printOutput(Student[] students){
        String str="";

        // This is to loop through each student and add their name to the output
        for (Student student : students) {
            str += "Student Name: " + student.getName() + "\n";
        }

        return str;
    }
}