/***************************************************************
* COMP 3716 - Group G - Project
* 
* A method by which to import a CSV file of students
* during initialization of the program.
****************************************************************/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class importCSV(ArrayList<Student> listOfStudents){
	
	String studentName = "";
	int studentID = 0;
	String fileLine = "";
	
	while(/*has next line*/){
		
		
		Scanner scn = new Scanner(fileLine)).useDelimiter(",");
		
		studentID = scn.nextInt();
		String studentLastName = scn.next();
		String studentFirstName = scn.next();
		studentName = studentLastName + ", " + studentFirstName;
		
		listOfStudents.addStudent(new Student(studentName, studentID));
		
		//move scanner to next line
	}
	
	scn.close();
}