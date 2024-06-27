//Write a program to generate input mismatch exception when trying to enter string value in stead of number
package Anudip; //Package declaration 

import java.util.*; //Importing the java.util which contains scanner 

public class Solution_exception { // Class declaration
	public static void main(String[] args) {
		int age; // assigning variable age
		Scanner sc = new Scanner(System.in); // Creating Scanner object for user input
		try {
			age = sc.nextInt(); // reading the input from the user
			if (age > 18) // applying the condition
			{
				System.out.println("Eligible for voting"); // printing the output for satisfying the condition
			} else {
				System.out.println("Not Eligible for voting"); // printing the output for not satisfying the condition
			}

		} catch (InputMismatchException e) // Catching the InputMismatchException
		{
			System.out.println(e); // Printing the error message
		}
	}

}
