package hw4JavaVariables;



public class AboutMe {
	
	public String name;
	public int myAnnualSalary; 
	public byte age;
	public short myApartmentRent;
	public long myBankBalance;
	public float myHeight;
	public double myGrade;
	public char sex;
	public boolean usCitizen;	

	public AboutMe() { // constructor declared
		System.out.println("\bThis is all about me---->\b");
		
	}
	
	public void myInfo() { //method is declared 
		
		System.out.println("My name is: "+ name+"\nMy annual salary: "+myAnnualSalary+ "\nMy Age : "+age+"\nMy Apartment rent is : "+myApartmentRent+"\nMy bank balance is: "+myBankBalance+
				"\nMy Height is: "+myHeight+ "\nMyGrade is: "+myGrade+ "\nMy Sex is: "+sex+"\nI am an US Citizen: "+usCitizen);
	}
	

	
	
	
	

}
