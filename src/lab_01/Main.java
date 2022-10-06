package lab_01;

import java.util.Scanner;

/**
 * lab_01.Main Class of Application
 * It scans user input and creates a new lab_01.Student with the given information.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter your date of birth: ");
        String studentDateOfBirthString = scanner.nextLine();

        System.out.print("Enter your cumulative GPA: ");
        String studentCumulativeGPAString = scanner.nextLine();

        System.out.print("Enter your department: ");
        String studentDepartment = scanner.nextLine();

        int studentDateOfBirth = Integer.parseInt(studentDateOfBirthString);            //Parsing scanned String input to int value
        double studentCumulativeGPA = Double.parseDouble(studentCumulativeGPAString);   //Parsing scanned String input to double value

        Student student = new Student(studentName, studentDateOfBirth, studentCumulativeGPA, studentDepartment);

        System.out.println("=====================");
        System.out.println("lab_01.Student name: "+student.getStudentName());
        System.out.println("lab_01.Student's age: "+student.getAge(student.getDateOfBirth()));
        System.out.println("lab_01.Student's GPA: "+student.getCumulativeGPA());
        System.out.println("lab_01.Student's department: "+student.getDepartment());
    }
}