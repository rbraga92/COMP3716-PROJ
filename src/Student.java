/**
 *
 * Created by Clodomir while working on students needs
 * Tuesday, Nov 17th.
 * 
 */

public class Student{
    
    private String studentName;
    private int studentNumber;
    private Schedule privateSchedule;
    private Schedule publicSchedule;
    private Assessment selfAssessment;  //Skills/grades included.
    private Preferences studentPreferences;
    //private Mandates professorMandates;
    //Mandates not yet implemented.

    public Student(String studentName, int studentNumber) {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
        //this.professorMandates = new Mandates();
        //Mandates not yet implemented.
        this.studentPreferences = new Preferences();
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public Schedule getPublicSchedule() {
        return publicSchedule;
    }

    /*public Mandates getProfessorMandates() {
        return professorMandates;
    }*/ //not yet implemented

    public Schedule getPrivateSchedule() {
        return privateSchedule;
    }
    
    public Preferences getStudentPreferences() {
        return studentPreferences;
    }

    public Assessment getSelfAssessment() {
        return selfAssessment;
    }
    
    public void setPrivateSchedule(Schedule privateSchedule) {
        this.privateSchedule = privateSchedule;
    }

/*
 *Student Public schedule is obtained from "MUN's servers". 
 *However to simulation proproses this method receives an schedule. 
 * Clodomir
 */
    public void setPublicSchedule(Schedule publicSchedule) {  
        this.publicSchedule = publicSchedule;
    }
    
    public void setSelfAssessment(Assessment selfAssessment) {
        this.selfAssessment = selfAssessment;
    }

    public void setStudentPreferences(Preferences studentPreferences) {
        this.studentPreferences = studentPreferences;
	}
    
    public String toString(){
    	return studentNumber + ": " + studentName;
    }
}