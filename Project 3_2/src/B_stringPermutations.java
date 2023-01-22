import java.util.Scanner;
public class B_stringPermutations {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter three strings: ");
		String one;
		String two;
		String three;
		one=reader.next();
		two=reader.next();
		three=reader.next();
		System.out.println("Permutations:");
		System.out.println(one+two+three);
		System.out.println(one+three+two);
		System.out.println(two+one+three);
		System.out.println(two+three+one);	
		System.out.println(three+two+one);
		System.out.println(three+one+two);
	}

}
