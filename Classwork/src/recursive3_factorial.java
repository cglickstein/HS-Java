
public class recursive3_factorial {

	public static void main(String[] args) {
		int placeholder=3;
		//System.out.println(factorial(position));
		//tenth number of the sequence, not to 15
	
		System.out.println(fibonacci(placeholder));

	}

	private static int fibonacci(int n) {
		if(n<=1)
			return n;
		else if (n==1)
			return 1;
		return (fibonacci(n-1)+fibonacci(n-2)); //2 previous ones before 
	}

}

