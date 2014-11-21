/*************************************************
* COMP 3716 - Group G - Project
* 
* main method
**************************************************/

public class Start{
	
	public static void main(String args[])
	{
		ClassList studentList = new ClassList();
		importCSV.importStatic(studentList, 42);
		//bring up interface
		System.out.println(studentList.toString());
	}
}