/*To calculate HomeLoan*/
package collection;

import java.util.Scanner;

// Class implementing the LoanCalculator interface
public class HomeLoan implements LoanCalculator {

    // Attributes
    public double principalAmount, loanAmount, rateOfInterest = 8.5;//
    public int years;
    
    // Scanner object to take user input
    Scanner scanner = new Scanner(System.in);
    
    // Method to input the Principal Amount And Number of Years 
    @Override
    public void displayPriAmnt() {
        System.out.println("Enter the principal amount of the home:");
        principalAmount = scanner.nextDouble();
        System.out.println("Enter the number of years for the home loan:");
        years = scanner.nextInt();
    }

    // Method to calculate Loan Amount of Car
    @Override
	public void calcLoan() {
    	loanAmount = (principalAmount * years * rateOfInterest) / 100;
        System.out.println("The loan amount is: " + loanAmount);
		
	}

    // Main method
    public static void main(String[] args) {
        HomeLoan obj = new HomeLoan(); // Creating object of HomeLoan class
        obj.displayPriAmnt(); // Calling method to input principal amount and No of Years(Loan Term)
        obj.calcLoan(); // Calling method to calculate and display the loan amount
    }
}
