import java.util.Scanner;

public class c15 {

	public static void main(String[] args) {
		String one="one";
		String two="two";
		System.out.println(one.compareTo("one")); //if first two are dif, a less than b. if b one more than a then pos
		//we usually just care about whether equal or not equal
		System.out.println("ball".compareTo("bat"));
		System.out.println("apple".compareTo("ball"));
		//that was one way to compare string
		System.out.println("bat".compareTo("ball"));
		if (one.compareTo("one")==0)
		{
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("They are not equal");
		}
		
		//second method
		
		if (one.equals("one"))
		{
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("They are not equal");
		}
		
	}

}