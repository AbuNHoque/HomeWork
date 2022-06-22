package hw6IfElseCondition01;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		
		System.out.println("\bTemperature of today\b");
		System.out.println("...................................");
		
		Scanner scanner =new Scanner(System.in);
		
		int todaysTemperature=scanner.nextInt();
		
		if(todaysTemperature<=32) {
			System.out.println("Frezzeing");
			
			}
		
		else if(todaysTemperature<=55) {
			System.out.println("Pleasant");
			
			}
		
		else if(todaysTemperature<=73) {
			System.out.println("Getting Warmer");
			
			}
		
		else if(todaysTemperature<=101) {
			System.out.println("Hot");
			
			}
		else { 
			System.out.println("Ice on my head please");
		}
		scanner.close();
	}

}
