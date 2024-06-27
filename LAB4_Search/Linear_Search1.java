//WAP to implement Linear search.

package Anudip;
import java.util.Scanner;
public class Linear_Search1 {
	    public static void main(String[]args){
	    	
	    	//Defining the variables and array.
	        int i,len,key,array[];
	        Scanner input = new Scanner(System.in);
	        
	        //printing the statement for getting the array length input.
	        System.out.print("Enter array length: ");
	        len = input.nextInt();
	        array = new int[len];
	        
            //printing the statement for input.
	        System.out.print("Enter "+len+" numbers: ");
	        for(i=0;i<len;i++){
	            array[i] = input.nextInt();
	        }
	        //printing the statement for the getting the element which need to be find.
	        System.out.print("Enter the search key value: ");
	        key = input.nextInt();
	        for(i=0;i<len;i++){
	            if(array[i]==key){
	            	
	            	//printing the statement where we found the element.
	                System.out.println("Key found at: "+(i+1));
	                break;
	            }
	        }
	        if(i==len) {
	        	
	        	//printing the statement as we have not found the element.
	            System.out.println("Key doesn't exist in the array");
	        }
	    }
	}

