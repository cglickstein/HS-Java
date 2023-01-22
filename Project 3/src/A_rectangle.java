import java.util.Scanner;

public class A_rectangle {

	public static void main(String[] args) {
		Double length;
		Double width;
		
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter lenght of rectangle: ");
		length=reader.nextDouble();		
		System.out.print("Enter width of rectangle: ");
		width=reader.nextDouble();	
		System.out.println("The area of the rectangle is "+ (width*length)+ ".");
		System.out.println("The perimeter of the rectangle is "+(2*width+2*length)+".");

	}

}
