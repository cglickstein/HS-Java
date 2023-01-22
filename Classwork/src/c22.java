import java.util.*;
public class c22 {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<Integer>();
		
		for (int i=0; i<4; i++)
			list.add(i*i); //4 elements with 0,1,4,9
		
		for (int i=0; i<4; i++)
			System.out.println(list.get(i)); //using methods and not actual place
		//objects like Integers with capital i
		//2 methods. get retrieves and add adds
		//first for loop was boxing. took i which was int and made Integer - object
		//second for loop unboxed i to print it out as an int
		
		Integer intObject=list.get(2); //Assigns Integer with value 4 to intObject
		
		System.out.println("intObject: "+intObject);
		
		int n=list.get(3); //example of auto-unboxing
		System.out.println("n: "+n);
		
		int x =list.set(3, 5); //FOURTH  element (9) is replaces by 5. x=9
		System.out.println("x: "+x);
		//System.out.println((list.get(3))
		
		for (int i=0; i<4; i++)
			System.out.println(list.get(i));
		
		x=list.remove(2); //x = 4, 4 removed from the list
		System.out.println("x: "+x);
		
		System.out.println(list);
		for (int i=0; i<3; i++) //made from 4 to 3 because removed and made smaller
			System.out.println(list.get(i));
		
		for (int i=0; i<list.size(); i++) //list.size()
			System.out.println(list.get(i));
	
		list.add(1,7); //inserting something so everything gets moved down one
		//0 7 1 5 everything gets moved over
		System.out.println(list);
		list.add(2,8);
		System.out.println(list);
		
		//pre condition- at right now
		//post conditon- what you want to happen
	
	}

}
