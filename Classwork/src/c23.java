import java.util.List;

import java.util.*;
public class c23 {

	public static void main(String[] args) {
		// PreCondition: List list is an ArrayList that contains Integer
		//
		//(process) value sorted in increasing order
		//PostCondition: value inserted in its correct position in the list
		
		System.out.println("a".compareTo("b")); //just know a is smaller
		List<Integer> list = new ArrayList<Integer>();
		list.add(3); list.add(7); list.add(9);
		Integer num= 20; //want  3 5 7 9 OBJECT COMPARING TO ANOTHER OBJECT
		int index=0; //start at 0th location which has 3- see if greater or less than number we have
		
		while (index<list.size() && num.compareTo(list.get(index))>0)
			//if num is greater than 0
			//if first number is larger than you get a positive 
			//System.out.println("Num is greater than 3");
			index++;
		//stop when number is same or larger. once stops:
		list.add(index, num); //insert num into index location
		System.out.println(list);
		 
		//for each loop- most time we want to print everything in list
		for (Integer value: list) //if list of strings then value be String
			System.out.println(value);
		//value gets value of each item of list which why Integer
			

				

	}

}
