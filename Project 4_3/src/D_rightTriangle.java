import java.util.Scanner;
public class D_rightTriangle {

	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		System.out.println("Enter lengths of three sides of a triangle: ");
		int one=reader.nextInt();	
		int two=reader.nextInt();
		int three=reader.nextInt();
		
		int onesquare=one*one;
		int twosquare=two*two;
		int threesquare=three*three;
		
		if (onesquare+twosquare==threesquare||threesquare+twosquare==onesquare||onesquare+threesquare==twosquare)
			System.out.print("This is a right triangle");
		else
			System.out.print("This is not a right triangle");

	}

}
