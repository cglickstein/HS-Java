
public class c4 {

	public static void main(String[] args) {
		//System.out.println(((double 3/2)); //cast double to three and still end up with a double
		System.out.println(((double) (3)/2)); //how written is very important
		//primitive data types. int m then m=3 then m=m+2 changes in memory location
		int m; //m holds number without a decimal place 
		double x; 
		x=3;
		System.out.println(x);
		//m=3.5 CANT DO
		//data types that aren't primitive are called OBJECTS like more than one character strung together (string)
		//string name; then name = "bob"; name points to something else
		
		String name; //lower case shows that string is an object 
		Double g; 
		
		String message;
		int a=20, b=35; 
		message="Bill sold " + a + " and Sylvia sold " + b + " subscriptions."; //concatenating 
		System.out.println(message);
		System.out.println("number"+3+4); //adding to a string because from left to RIGHT so 34
		System.out.println("number"+(3+4));	
		System.out.println(3+4+"number");	
		System.out.println("number"+3*4);
		
		message= "The conductoor yelled,\"All Aboard.\""; //backslash to escape string and show quotes
		System.out.println(message);
		
		String filePath;
		filePath="c:\\Java\\Ch3.docx"; //two back slashes are needed to make 2 characters and not combine
		System.out.println("the room was full of \tdogs."); //\t is one character on java. its an escape character
		System.out.println("the room was full of\n\tdogs\n\tdogs\n\tcaats\n\tand chimpanzees.");
	}

}
