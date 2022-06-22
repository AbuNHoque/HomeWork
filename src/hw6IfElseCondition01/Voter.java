package hw6IfElseCondition01;


import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		
		System.out.println("\b Please add a valid age\b");
		System.out.println("...................................");
		Scanner scanner = new Scanner(System.in);
		
		
	int age=scanner.nextInt();
	
	if (age>= 18) {
		System.out.println("I am a Voter");
	}
	else {
		System.out.println("I am not a Voter");
		
	}
	scanner.close();

	}

}
