package lab_01;

import java.util.Calendar;

/**
 * This class "lab_01.Student" holds the Name, date of birth, GPA and department of a lab_01.Student.
 * It can also calculate the age of a student by its date of birth.
 */
public class Student {
    private String studentName;
    private int dateOfBirth;
    private double cumulativeGPA;
    private String department;

    public Student(String studentName, int dateOfBirth, double cumulativeGPA, String department){
        this.studentName = studentName;
        this.dateOfBirth = dateOfBirth;
        this.cumulativeGPA = cumulativeGPA;
        this. department = department;
    }

    /**
     * This Method calculates the age of a lab_01.Student with his/her given date of birth.
     * @param dateOfBirth the date of birth of him/her as an int value.
     * @return the age as an int value.
     */
    public int getAge(int dateOfBirth) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR); //Get the current Year from java util.
        return currentYear-dateOfBirth;
    }

    /**
     * Getter-Method for lab_01.Student Name.
     * @return lab_01.Student Name as a String
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * Getter-Method for lab_01.Student date of birth.
     * @return lab_01.Student date of birth as an int
     */
    public int getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Getter-Method for lab_01.Student cumulative GPA.
     * @return lab_01.Student cumulative GPA as a double
     */
    public double getCumulativeGPA() {
        return cumulativeGPA;
    }

    /**
     * Getter-Method for lab_01.Student department.
     * @return lab_01.Student department as a String
     */
    public String getDepartment() {
        return department;
    }
}