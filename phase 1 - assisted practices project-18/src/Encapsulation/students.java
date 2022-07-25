package Encapsulation;

public class students {
	private int id;
	public String studentName;
	public String CourseName;
	
	students(int id, String studentName, String courseName){
		this.CourseName=courseName;
		this.id= id;
		this.studentName = studentName;
	}
	
	void printdetails() {
		System.out.println("student ID : " + id + " studentName: " + studentName + " courseName: " + CourseName);
	}
	

}
