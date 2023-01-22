
public class c11 {

	public static void main(String[] args) {

		String sentence= "Fun!";
		System.out.println(sentence.length());
		String sentence2="CARS,Apples, Balls, Cars";
		//chaining
		sentence2=sentence2.toLowerCase().replace("ar", "*"); //replaces strings and characters
		System.out.println(sentence2);
		String sentence3="Programming with Java";
		System.out.println(sentence3.substring(3,7)); //SLICE-pulls a string from sentence three
		//stops before 7th location
		//if do one number then it stars with that location and goes until very end
		//cant go to farther than there is. go one more to get whole thing
		System.out.println(sentence3.substring(3,21));
		System.out.println(sentence3.toUpperCase());
		System.out.println(sentence3.startsWith("Pr")); //STARTS AND ENDS WITH-doesn't matter how many letters
		//BOOLEAN- returns t or f
		/*System.out.println(sentence3.endsWith("av"));*/
	}

}
