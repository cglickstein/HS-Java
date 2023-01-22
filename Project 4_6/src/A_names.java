import java.util.Scanner;
public class A_names {

	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		System.out.println("Enter first name of 1 to terminate program");
		String fname="a";
		while (fname!="1")
		{
			System.out.println("Enter first and last name: ");
			fname=reader.next();
			String lname=reader.next();
			System.out.println("Your full name is "+fname+" "+lname);
			System.out.println("Your first name is "+fname+", your last name is "+lname);
			System.out.println("\nEnter 1 as your first name to terminate the program\n");
		}


	}

}
