package hw3JavaBasics;

public class Titu {

	public int myYearSalary = 1234567;
	public String name = "Abu Hoque";
	public byte age = 51;
	public short myApartmentRent = 1234;
	public long mybankbalance = 1234567l;
	public float myHeight = 1.84f;
	public double myGrade = 3.5;
	public char sex = 'M';
	public boolean USCitizen = false;
	
		
	public static void main(String[] args) {	
				Titu titu=new Titu();
				System.out.println(titu.name);
				System.out.println(titu.age);
				System.out.println("My Name is: " + titu.name + "\nMy Age: " + titu.age);
		

	}

}
