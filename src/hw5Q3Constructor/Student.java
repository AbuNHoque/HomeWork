package hw5Q3Constructor;

public class Student {

	public String stName;
	public byte stID;
	public char sex;
	public boolean isProgrammer;
	public float grade;
	
	public Student(){
		
		System.out.println(" This is from default Constructor of Student class");
		
	}
	public Student(String stName, byte stID, char sex, boolean isProgrammer, float grade) {
		
		
		this.stName=stName;
		this.stID=stID;
		this.sex=sex;
		this.isProgrammer=isProgrammer;
		this.grade=grade;
		
		System.out.println("\nStudent Name: "+stName+"\nID: "+stID+"\nSex: "+sex+"\nGrade: "+grade+"\nJava programmer: "+isProgrammer);
		
				
	}
	
	
	
	
}
