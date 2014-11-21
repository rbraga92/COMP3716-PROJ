import java.util.ArrayList;

/**
 *
 * Created by Clodomir while working on students needs
 * Tuesday, Nov 18th.
 * 
 */

public class ClassList {
	private ArrayList<Student> students;
	public ClassList(ArrayList<Student> students){
		this.students=students;
	}
	public ClassList(){
		//Is this correct?	//by hkc
	}
	public ArrayList<Student> getList(){
		return students;
	}
	public Student getStudent(int studentNumber){
		Student student=null;
		for(int i=0;i<this.students.size();i++){
			if(this.students.get(i).getStudentNumber()==studentNumber){
				student=this.students.get(i);
			}
		}
		return student;
	}
	public void addStudent(Student student){
		this.students.add(student);
	}
	public boolean removeStudent(int studentNumber){
		if(student!=null){
			this.students.remove(this.getStudent(studentNumber));
			return true;
		}
		return false;
	}
	public String toString(){
		String listStudents="hello";
		// parse through here
		return listStudents;
	}
}
