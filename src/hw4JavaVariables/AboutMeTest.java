package hw4JavaVariables;

public class AboutMeTest {

	public static void main(String[] args) {
		AboutMe titu= new AboutMe(); // constructor initialized
		titu.name="Abu Hoque";
		titu.myAnnualSalary= 1234567; 
		titu.age= 51;
		titu.myApartmentRent= 1234;
		titu.myBankBalance= 13579025l;
		titu.myHeight= 1.69f;
		titu.myGrade= 3.9;
		titu.sex ='M';
		titu.usCitizen= false;	
		titu.myInfo(); //method initialized
		
		System.out.println("\n==========================\n");
		
		AboutAlex alex= new AboutAlex();
		alex.name="Alex";
		alex.myAnnualSalary= 7654321; 
		alex.age= 41;
		alex.myApartmentRent= 4321;
		alex.myBankBalance= 9501325l;
		alex.myHeight= 1.59f;
		alex.myGrade= 3.85;
		alex.sex ='F';
		alex.usCitizen= true;	
		alex.alexInfo();//alex
		
	}
	
	
}
