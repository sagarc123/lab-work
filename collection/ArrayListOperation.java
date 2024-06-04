//Q.2)Create ArrayList of your favourite vegetables and perform four operations on it.

package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListOperation {

    public static void main(String[] args) {

        // Initializing ArrayList
        ArrayList<String> vegetables = new ArrayList<String>();
        
        // Adding elements to the ArrayList named vegetables
       	vegetables.add("DrumStick");
        vegetables.add("Dill Leaves");
        vegetables.add("Caluiflower");
        vegetables.add("Peas");
        
        // Printing the elements in the ArrayList
        System.out.println("Favourite Vegetables list: " + vegetables);
        
        // Traversing list through iterator
        System.out.println("Traversing list through Interator:");
        Iterator itr = vegetables.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        // Add a new vegetable to the list
        vegetables.add("Spring Onions");
        System.out.println("After adding Spring Onions: " + vegetables);
        
        // Replacing element at specified index with new one
        vegetables.set(2, "Broccoli");
        System.out.println("After replacing vegetable at index 2 with Broccoli: " + vegetables);
        
        // Remove a vegetable from the list
        vegetables.remove("Peas");
        System.out.println("After removing Peas: " + vegetables);
        
        // Showing Vegetable at index 3
        String vegetableAtIndex3 = vegetables.get(3);
        System.out.println("Vegetable at index 3: " + vegetableAtIndex3);
    }
}
