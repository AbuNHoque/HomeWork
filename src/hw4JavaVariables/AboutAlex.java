package hw4JavaVariables;

public class AboutAlex {

	public String name;
	public int myAnnualSalary; 
	public byte age;
	public short myApartmentRent;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;	

	public AboutAlex() {
		System.out.println("\bThis is all about Alex---->\b");
		
	}
	
public void alexInfo() {
		
		System.out.println("My name is: "+ name+"\nMy annual salary: "+myAnnualSalary+ "\nMy Age : "+age+"\nMy Apartment rent is : "+myApartmentRent+"\nMy bank balance is: "+myBankBalance+
				"\nMy Height is: "+myHeight+ "\nMyGrade is: "+myGrade+ "\nMy Sex is: "+sex+"\nI am an US Citizen: "+usCitizen);
	}
	
}
