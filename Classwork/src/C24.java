import java.util.Scanner;

public class C24 {

	public static void main(String[] args) {
		//methods to run code over and over
		//instead of continueing to recalculate boxes, just recalculate all boxes at one time and add another box
		//also to organize code. do a,b,c and methods do a then b then c
		Scanner reader = new Scanner(System.in);
		int u=2;
		int v=3;
		int x,y,w;
		//x=pow(u,v); //call method called pow. passing pow two variables.
		//u and v are called ACTUAL PARAMETERS/ARGUGMENTS
		//System.out.println(x);
		//y=pow(x,2);
		//System.out.println(y);
		pow(reader,3);
		
		
		//value of u in main goes into value of u in mthd

	}
	public static void pow(Scanner u, int v) //sends double back. x double so pass double
	//value of u go into a. dif variable but same value at moment passed 
	{
		System.out.println("Enter a number: ");
		int s = u.nextInt();
		int c=s*v;
		System.out.println(c); //void doesn't return
	//return c;
	}
	
	
	//can have object or object with class type you send to method
	//send scanner then method have ability to read something
}
