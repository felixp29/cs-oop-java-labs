package lab04.prob04;

import java.util.Vector;

public class Student extends Person {

    private Vector<String> courses;
    private Vector<Integer> grades;

    public Student(String n, String add) {
        super(n, add);
        this.courses = new Vector<>();
        this.grades = new Vector<>();
    }

    public void addCourseGrade(String course, int grade) {
        courses.add(course);
        grades.add(grade);
    }

    public void printGrades() {
        System.out.println(grades);
        /*
        for (int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));
        }
         */
    }

    public double getAverageGrade() {
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum = sum + grades.get(i);
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student: " + super.toString();
    }
}
