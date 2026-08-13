package lab04.prob04;

import java.util.Vector;

public class Teacher extends Person {

    private Vector<String> courses;

    public Teacher(String name, String address) {
        super(name, address);
        this.courses = new Vector<>();
    }

    public boolean addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            return true;
        }
        return false;
    }

    public boolean removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
}
