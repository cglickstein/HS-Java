
public class recursive2 {

	public static void main(String[] args) {
		int x=3;
		System.out.println(x);
		System.out.println(factorial(x));

	}

	private static long factorial(int n) {
		// TODO Auto-generated method stub
		if(n==1)
			return 1;
		else {
			System.out.println("*"+(n-1));
			return n*factorial(n-1);
		}
	}

}
