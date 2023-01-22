import java.util.Scanner;

public class C_intsAndDecimals {
	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter five decimal numbers: ");
		double one;
		double two;
		double three;
		double four;
		double five;
		one=reader.nextDouble();
		two=reader.nextDouble();
		three=reader.nextDouble();
		four=reader.nextDouble();
		five=reader.nextDouble();
		System.out.println("These are the decimal places: " +one + "," + two+","+three+","+four+","+five);
		int intone = (int)one;
		int inttwo = (int)two;
		int intthree= (int)three;
		int intfour= (int)four;
		int intfive= (int)five;
		int sum = intone+inttwo+intthree+intfour+intfive;
		System.out.println("Integers of the numbers: "+ intone+ ","+ inttwo+ ","+ intthree+","+ intfour+","+ intfive );
		System.out.println("Sum of the integer numbers: " + sum);
		System.out.println("The average of the numbers is " + sum/5.0 );
		int rone = (int) Math.round(one);
		int rtwo = (int)Math.round(two);
		int rthree= (int)Math.round(three);
		int rfour= (int)Math.round(four);
		int rfive= (int)Math.round(five);
		System.out.println(" ");
		int sum2= rone+rtwo+rthree+rfour+rfive;
		System.out.println("Sum of the rounded integer numbers: " + sum2);
		System.out.println("The average of the numbers: " + sum2/5.0 );
		
		
		
		
		
		
	}

}
