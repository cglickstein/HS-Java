import java.util.ArrayList;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		List<Integer> list=getRandomList();
		for (Integer value: list) 
			System.out.println(value);
	

	}
	public static List<Integer>getRandomList() 

	{	Scanner reader = new Scanner(System.in);
		Random generator=new Random();
		System.out.println("Enter how many numbers the list should have: ");
		int fill = reader.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<fill;i++)
			list.add((int) (generator.nextDouble()*101));
		return list;

	}
}
