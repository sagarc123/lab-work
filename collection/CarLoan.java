/*To calculate HomeLoan*/
package collection;

import java.util.Scanner;

// Class implementing the LoanCalculator interface for CarLoan
public class CarLoan implements LoanCalculator {

    // Attributes
    public double principalAmount, loanAmount, rateOfInterest = 7.5;
    public int years;
    Scanner scanner = new Scanner(System.in);

    // Method to display principal amount
    public void displayPriAmnt() {
        System.out.println("Enter the principal amount of car:");
        principalAmount = scanner.nextDouble();
        System.out.println("Enter the number of years for the car loan:");
        years = scanner.nextInt();
    }

    // Method to calculate
    @Override
    public void calcLoan() {
        loanAmount = (principalAmount * years * rateOfInterest) / 100;
        System.out.println("The car loan amount is: " + loanAmount);
    }

    // Main method
    public static void main(String[] args) {
        CarLoan obj = new CarLoan(); // Creating object of CarLoan class
        obj.displayPriAmnt(); // Calling method to display principal amount
        obj.calcLoan(); // Calling method to calculate car loan amount
    }
}
