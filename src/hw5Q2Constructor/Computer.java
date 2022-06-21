package hw5Q2Constructor;

public class Computer {

	public String brand="Apple";
	public String model="MacBook Air"; 
	public String operatingSystem="MacOS Mojave";
	public int price=800;
	public char grade='A';
	public boolean madeInUSA=false;	
	
	public Computer() {// default constructor
		System.out.println("This is from default constructor");	
		
	}
	
	
	//Parameterized Constructor
	public Computer(String brand, String model, String operatingSystem, int price, 
			char grade, boolean madeInUSA)	{
		this.brand =brand;
		this.model=model;
		this.operatingSystem=operatingSystem;
		this.price=price;
		this.grade=grade;
		this.madeInUSA=madeInUSA;
		
		
		System.out.println("\nMy Brand: "+ brand+"\nModel: "+model+"\nOpertaing system: "+operatingSystem+"\nPrice: "+price+"\nGrade: "+grade+"\nMade In USA: "+madeInUSA);
		
		
	}
}