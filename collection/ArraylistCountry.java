//Create list of countries (minimum 10) given by user.

package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int count;
        System.out.println("How many countries do you want to add:");
        count = sc.nextInt();

     
       

        ArrayList<String> country = new ArrayList<String>();

      
        System.out.println("Enter the names of the countries:");
        sc.nextLine();

        for (int i = 1; i <= count; i++) {
            System.out.print("Country " + i + ": ");
            String Country = sc.nextLine();
            country.add(Country);
        }

    
        System.out.println(country);
		}
		
		
}

