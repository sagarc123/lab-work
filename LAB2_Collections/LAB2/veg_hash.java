//Write a program to implement set operation using HashSet and LinkedHassSet to add the list of favourite fruits and vegetables' perform minimum four operations of the set on mentioned set.

package Anudip;
//importing HashSet for managing HashSet operation.
import java.util.HashSet;
//importing LinkedHashSet for managing the LinkedHashList.
import java.util.LinkedHashSet;

public class veg_hash {
	public static void main(String[] args) {
		//Creating HashSet for Favorite fruits
		HashSet<String>favoriteFruits = new HashSet<>();
		favoriteFruits.add("Mango");
		favoriteFruits.add("Grapes");
		favoriteFruits.add("Orange");
		favoriteFruits.add("Gauva");
		
		// LinkedHashSet for favorite vegetables  
		LinkedHashSet<String>favoriteVegetable = new LinkedHashSet<>();
		favoriteVegetable.add("Potato");
		favoriteVegetable.add("GreenPeas");
		favoriteVegetable.add("Cauliflower");
		favoriteVegetable.add("Grapes");
		
		//First operation , Union of both Sets
		HashSet<String>unionSet = new HashSet<>(favoriteFruits);
		unionSet.addAll(favoriteVegetable);
		System.out.println("The union of favorite fruits and vegetables: "+unionSet);
		
		//Second operation ,Intersection of both Sets
		HashSet<String>intersectionSet = new HashSet<>(favoriteFruits);
		intersectionSet.retainAll(favoriteVegetable);
		System.out.println("The intersection of favorite fruits and vegetables: "+intersectionSet);
		

		//Third operation ,Difference between both sets
		HashSet<String>differenceSet = new HashSet<>(favoriteFruits);
		differenceSet.removeAll(favoriteVegetable);
		System.out.println("The difference between the favorite fruits and vegetables: "+differenceSet);
		
	
		//Fourth operation ,Is favorite vegetable is a subset of favorite fruits
        boolean isSubset = favoriteFruits.containsAll(favoriteVegetable);
        System.out.println("Are all favorite vegetables also favorite fruits ? "+isSubset);
		
	
	}

}
