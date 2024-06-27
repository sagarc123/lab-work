//WAP to implement Binary Search

package Anudip;
import java.util.Scanner;
public class Binary_Search {

    public static void main(String[]args) {
    	
    	// defining the variables and array
        int i, j, temp, key, low, mid, high, array[]; 
        Scanner sc = new Scanner(System.in);
        
        // accepting the size of array as input
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        array = new int[size];

        // accepting the elements of array
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
 
        // accepting key value
        System.out.print("Enter the key to search: ");
        key = sc.nextInt();

        // sorting the array in ascending order
        for (i = 0; i < size; i++) {
            for(j=i+1;j<size;j++){
                if(array[i]>array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.print("Sorted elements: ");
        for (i = 0; i < size; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.println(" ");

        //Binary search
        // eg:- 3 2 40 10 4
        low = 0;
        high = size-1;
        //Applying while loop for binary search algorithm.
        while(low<=high){
            mid = (low+high)/2;
            if (array[mid] == key) {
            	
            	//Printing the statement for the element we found at which location.
                System.out.println("Key value found at " +(mid+1));
                break;
            }
            else if(key < array[mid]){
                high = mid-1;
            }
            else if(key > array[mid]){
                low = mid+1;
            }
            else{
            	
            	//Printing the statement for not finding the element.
                System.out.println("Element doesn't exist in the array.");
            }
        }
    }
}
