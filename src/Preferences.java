import java.util.ArrayList;

/**
*
* Created by Clodomir while working on students needs
* Tuesday, Nov 18th.
* 
*/

class Preferences{
	private ArrayList<Student> wouldLikeToWorkWith=new ArrayList<Student>();
	private ArrayList<Student> wouldNotLikeToWorkWith=new ArrayList<Student>();
	public ArrayList<Student> getWouldLikeToWorkWithList(){
		return wouldLikeToWorkWith;
	}
	public ArrayList<Student> getWouldNotLikeToWorkWithList(){
		return wouldNotLikeToWorkWith;
    }
	public void addToWouldLikeToWorkWith(Student student){
		this.wouldLikeToWorkWith.add(student);
	}
	public void addToWouldNotLikeToWorkWith(Student student){
		this.wouldNotLikeToWorkWith.add(student);
	}
	public boolean removeFromWouldNotLikeList(int studentNumber){
		if(student!=null){
			this.wouldNotLikeToWorkWith.remove(this.search(studentNumber,this.wouldNotLikeToWorkWith));
			return true;
		}
		return false;
	}
	public boolean removeFromWouldLikeList(int studentNumber){
		if(student!=null){
			this.wouldLikeToWorkWith.remove(this.search(studentNumber,this.wouldLikeToWorkWith));
			return true;
		}
		return false;
	}
	public Student search(int studentNumber,ArrayList<Student> list){
		Student student=null;
		for(int i=0;i<list.size();i++){
			if(studentNumber==list.get(i).getStudentNumber()){
				student=list.get(i);
			}
		}
		return student;
	}
}
