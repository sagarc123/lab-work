//WAP To sort array element Given by user in Descending order.
package Anudip;

import java.util.Scanner;

public class Desecnding_sort {
	// Declare an array of integers with a size of 6
    int a[] = new int[6];
    int i, j, temp;
    Scanner sc = new Scanner(System.in);
    
    // Method to accept 6 elements from the user
    public void accept() {
        System.out.println("ENTER ANY 6 ELEMENTS:");
        for (i = 0; i < 6; i++) {
            a[i] = sc.nextInt();
        }
    }
    
    // Method to sort the array in descending order
    public void sort() {
        for (i = 0; i < 6; i++) {
            for (j = i + 1; j < 6; j++) {
                if (a[i] < a[j]) {
                    // Swamping the elements if the current element is less than the next element
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    
    // Method to display the sorted array
    public void display() {
        System.out.println("THE SORTED ELEMENTS ARE:");
        for (i = 0; i < 6; i++) {
            System.out.println(a[i]);
        }
    }
    
    // Main method to execute the program
    public static void main(String[] args) {
    	Desecnding_sort obj = new Desecnding_sort(); // Create an instance of Desecnding_sort
        obj.accept(); // Call accept method to input array elements
        obj.sort(); // Call sort method to sort the array
        obj.display(); // Call display method to show the sorted array
    }
}