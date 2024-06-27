//WAP to associate the specified value with the specified key in a HashMap.

package Anudip;
import java.util.HashMap;
import java.util.Map;

public class HashMap_L3 {
	public static void main(String[] args) {
		//Creating a HashMap
		Map<Integer , String> veg = new HashMap<Integer , String>();
		
		//Inserting values into the Hashmap
		veg.put(1, "Carrot");
		veg.put(2, "Spinach");
		veg.put(3, "Cucumber");
		veg.put(4, "Betroot");
		veg.put(5, "Tomato");
		veg.put(6, "Raddish");
		veg.put(7, "Cabbage");
		veg.put(8, "Drumsticks");
		
		//Printing the all elements of the HashMap
		System.out.println(veg);
		
	}

}
