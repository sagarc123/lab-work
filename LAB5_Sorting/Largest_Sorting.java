package Anudip;

import java.util.Scanner;

public class Largest_Sorting {

	//Initialing the variables
	int a[] = new int[5];
	int i, j, temp;
	Scanner sc = new Scanner(System.in);
	
	//Taking the input from the user.
	public void accept() {
		System.out.println("ENTER 5 ELEMENTS:");
		for (i=0;i<5;i++) 
		{
			a[i]=sc.nextInt();
		}
	}
	//Method o sorting all elements in bigger to smaller value format.
	public void sort() 
	{
		for(i=0;i<5;i++) 
		{
			for(j=i+1;j<5;j++) 
			{
				if(a[i]<a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
	}
	public void display() 
	{
		System.out.println("THE SORTED ELEMENT ARE:");
		for(i=0;i<5;i++) {
			System.out.println(a[i]);
		}
	}
	//Printing the Second largest and third largest number.
	public void largestvalue() 
	{
	System.out.println("the second largest number is :" +a[1]);
	System.out.println("the third largest number in the array is : "+a[2]);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largest_Sorting obj = new Largest_Sorting();
		obj.accept();
		obj.sort();
		obj.display();
		obj.largestvalue();
	}

}