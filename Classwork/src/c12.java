import java.util.Scanner;

public class c12{

	public static void main(String[] args) {
		//boolean expressions
		System.out.println(!(10>7)); //exclamation point gives opposite
		System.out.println(' '<'a'); //32 and 97 
		System.out.println('A'=='a'); //capital is less
		System.out.println((14<20) &&(5>10));
		System.out.println((14<20) ||(5>10));
		
		Scanner reader=new Scanner (System.in);
		System.out.println("Enter an integer: ");
		int input=reader.nextInt();
		
		boolean numComparison= (input>100);
		System.out.println(numComparison);
		
		if (input<100)
			System.out.println("less");//put 50 then get false
		else
			System.out.println("greater");
		
		if (numComparison)
		{
			System.out.println("greater");
		}
		else
			System.out.println("less");
		
		System.out.println((17<4*3)||(8*2==4*4) && !(3+3==6)); //works from LEFT TO RIGHT
		
		System.out.println("Enter balance: ");
		double balance= reader.nextDouble();
		double interestRate=0;
		
		if (balance>=50000)
			interestRate=.05;
		else
		{
			if (balance>=25000)
				interestRate=.04;
			else
			{
				if(balance>=10000)
					interestRate=.03;
				else
					interestRate=0;
			}
		}
	System.out.println(interestRate);
	
	
	
	
	
	
	
	
	}

}