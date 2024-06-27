//WAP to throw an exception On input of odd number from user.(if user give even number print "It's even number so welcome!!!) else throw exception.
package Anudip;
import java.util.Scanner;

public class Odd_Even_check {
	public static void check(int number) {
		if(number%2==0)                      
		{
			System.out.println("It's even number so welcome!!!");
		}
		else
		{
			throw new ArithmeticException("Odd number");
		}
	}
	public static void main(String[] args) {
		Odd_Even_check obj=new Odd_Even_check();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		obj.check(number);
	
		
	}

}
