
public class recursive {

	public static void main(String[] args) {
		//RECURSION- idea of a method/function calling itself to do something
		//factorial- take number and multiply it by every number less so good to do with recursion
		//3!=6
		//base case: whe we stop because nothing else to do. for this, its when we keep breaking down and get to 1
		int n=4;
		int result=factorial(n);
		System.out.println(result);


	}

	public static int factorial(int n) {
		if (n==0) {
			return 0;
		}
		else
			return (n*factorial(n-1)); //calling method again
		//4 *factorial(3)
		//3*factorial(2)
		//2*factorial(1)
		//1
		//runs backward- break down and solve easiest one first 
		
	}

}
//STACK BECAUSE FIR