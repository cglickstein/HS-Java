import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		Double degree=0.0;
		System.out.print("Enter degrees in fahrenheit: ");
		degree=reader.nextDouble();
		System.out.println("The degrees in celcius is "+ ((degree-32)*5/9)+ " degrees.");
				
		

	}

}
