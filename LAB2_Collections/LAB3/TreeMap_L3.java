//WAP to copy all mapping from the specified map to another map and check a map a contains key -value mappings

package Anudip;
import java.util.*;
import java.util.TreeMap;

public class TreeMap_L3 {
	public static void main(String[] args){
		//TODO Auto-Generated method stub
		
		//Creating the TreeMap
		TreeMap<String, Integer> Emp= new TreeMap<String, Integer>();
		
		//inserting element to the tree
		Emp.put("Aarav", 20000);
		Emp.put("Simran",10000);
		Emp.put("Chirag",5000);
		Emp.put("Manisha",20000);
		System.out.println(Emp);
		
		//Creating the another TreeMap
		Map<String, Integer> moreEmp= new TreeMap<String, Integer>();
		
		//Inserting the values to the another newly created TreeMap
		moreEmp.put("Arya", 15000);
		moreEmp.put("Raman", 8000);
		moreEmp.put("latika", 18000);
		
		//Copying the values from the both TreeMap
		Emp.putAll(moreEmp);
		
		
		//Printing the TreeMap which has all values of both the TreeMap
		System.out.println(Emp);
	

}
}
