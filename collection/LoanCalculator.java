/*Q.1)Create An interface to override two methods loanAmount() and accept() method to calculate HomeLoan and CarLoan*/

package collection;

// Interface declaration
public interface LoanCalculator {
    
    // Method to display Principal Amount
    public void displayPriAmnt();
    
    // Method to calculate Loan Amount
    public void calcLoan();
}
