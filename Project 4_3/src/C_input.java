import java.util.Scanner;
public class C_input {
	
	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		System.out.println("Enter an integer between 0 and 35: ");
		int integer=reader.nextInt();
		
		if (integer>0 && integer <=9)
			System.out.println(integer);
		if (integer>9 && integer<36) 
			System.out.println((char) (integer+55));
		if (integer>35 || integer<0)
			System.out.println("Error.");


	}
}
