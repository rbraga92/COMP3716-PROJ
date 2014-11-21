import java.util.ArrayList;

/**
*
* Created by Clodomir while working on students needs
* Tuesday, Nov 20th.
* 
*/
class Mandates {
    private ArrayList<Student> canWorkWith=new ArrayList<Student>();
    private ArrayList<Student> cannotWorkWith=new ArrayList<Student>();

    public ArrayList<Student> getCanWorkWithList() {
        return canWorkWith;
    }
    
     public ArrayList<Student> getWouldNotLikeToWorkWithList() {
        return cannotWorkWith;
    }

    public void addToCanWorkWith(Student student) {
        this.canWorkWith.add(student);
    }

    public void addToWouldNotLikeToWorkWith(Student student) {
        this.cannotWorkWith.add(student);
    }
    
    public boolean removeFromCannotWorkWithList(int studentNumber) {
        Student student =  this.search(studentNumber, this.cannotWorkWith);
        if(student != null){
            this.cannotWorkWith.remove(student);
            return true;
        }
        return false;
    }
    
    public boolean removeCanWorkWithList(int studentNumber) {
        Student student =  this.search(studentNumber, this.canWorkWith);
        if(student != null){
            this.canWorkWith.remove(student);
            return true;
        }
        return false;
    }
     
    public Student search(int studentNumber, ArrayList<Student> list) {
        Student student = null;

        for (int i = 0; i < list.size(); i++) {
            if (studentNumber == list.get(i).getStudentNumber()) {
                student = list.get(i);
            }

        }
        return student;
    }

       
}
