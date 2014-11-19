import java.util.ArrayList;

/**
 *
 * Created by Clodomir while working on students needs
 * Tuesday, Nov 18th.
 * 
 */

public class ClassList {

    private ArrayList<Student> students;

    public ClassList(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getList() {
        return students;
    }

    public Student getStudent(int studentNumber) {
        Student student = null;

        if (this.students.isEmpty()) {
            return null;
        }

        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getStudentNumber() == studentNumber) {
                student = this.students.get(i);
            }

        }
        return student;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public boolean removeStudent(int studentNumber) {
        Student student = this.getStudent(studentNumber);
        if (student != null) {
            this.students.remove(student);
            return true;
        } else {
            return false;
        }
    }

}
