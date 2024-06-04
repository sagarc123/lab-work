package collection;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedlistVegetables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int count;
        System.out.println("How many vegetables do you want to add:");
        count = sc.nextInt();
        
        LinkedList<String> l1= new LinkedList<String>();
        System.out.println("Enter the names of the Vegetables:");
        sc.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.print("Vegetable " + i + ": ");
            String vegetable = sc.nextLine();
            l1.add(vegetable);
            
        }

   
	

    	// 1.Print the list of vegetables
	    System.out.println("List of Vegetables: " + l1);
	
	    // Demonstrating LinkedList methods
	    // 2. Add a vegetable at the first position
	    l1.addFirst("Spinach");
	    System.out.println("After adding Spinach at first position: " + l1);
	
	    // 3. Add a vegetable at the last position
	    l1.addLast("Kale");
	    System.out.println("After adding Kale at last position: " + l1);
	
	    // 4. Remove the first vegetable
	    l1.removeFirst();
	    System.out.println("After removing the first vegetable: " + l1);
	
		}
}


