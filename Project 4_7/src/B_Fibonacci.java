import java.util.Scanner;
public class B_Fibonacci {

	public static void main(String[] args) {
		Scanner reader=new Scanner (System.in);
		System.out.println("Enter two numbers: ");
		int num1=reader.nextInt();
		int num2=reader.nextInt();
		System.out.println("Enter the positon of desired number in sequence: ");
		int position=reader.nextInt();
		//int newNum=0;
		int sum=0;
		int count=2;
		while (count!=position)
			{sum=num1+num2;
			count++;
			num1=num2;
			num2=sum;}
		System.out.println("\nThe number in position "+position+" is "+sum+".");


		

	}

}
