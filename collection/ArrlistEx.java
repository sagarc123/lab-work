package collection;

import java.util.ArrayList;

public class ArrlistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Maths");
		al1.add("science");
		
		System.out.println(al1);
		System.out.println("The size of the ArraylIst:"+al1.size());
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("History");
		al2.add("civics");
		
		
		al1.addAll(al2);
		
		System.out.println(al1);
		
		
		al2.addAll(al1);
		System.out.println(al2);
		
		System.out.println(al2.get(4));
		
		al2.set(5, "geometry");
		
		System.out.println("Final Arraylist:"+al2);

	}

}
