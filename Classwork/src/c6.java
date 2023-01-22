import java.util.Scanner;
public class c6 {

	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		String name;
		int age;
		double gpa;
		
		System.out.println("Enter you name (string): ");
		name=reader.nextLine();
		
		System.out.println("Enter you age (integer): ");
		age=reader.nextInt();
		
		System.out.println("Enter you gpa (double): ");
		gpa=reader.nextDouble();
		System.out.println("name "+ name +"age "+age+"gpa "+gpa);
		
		//we push enter after 10. next reads until enter so skips but name reads whole line and discards the enter
		System.out.println("Enter you age (integer): ");
		age=reader.nextInt();
		reader.nextLine(); //gets rid of space by throwing in extra read. just gobbles up enter
		
		String lname;
		System.out.println("Enter you name (string): ");
		name=reader.next();
		lname=reader.next(); //next reads until the space
		//display with space
		
		
		System.out.println("Enter you gpa (double): ");
		gpa=reader.nextDouble();
		System.out.println("name "+ name +"age "+age+"gpa "+gpa);
	}

}

//space with just next
