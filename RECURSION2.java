
public class RECURSION2 {

	public static void main(String[] args) {
		mysteryMix("abcdefgh!");

	}

	public static void mysteryMix(String str) {
		int length=str.length();
		if(length>=3)
		{
			mysteryMix(str.substring(0,length/3));
			System.out.print(str.substring(length/3,2*length/3));
			mysteryMix(str.substring(2*length/3));
		}
		
	}

}
