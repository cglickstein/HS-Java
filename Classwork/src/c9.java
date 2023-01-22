//class written full of different methods. like uppercase for string.
public class c9 {

	public static void main(String[] args) {
String sentence="Programming with Java";
int ind;
ind=sentence.indexOf('g');
//every single character has an index number. tells FIRST TIME
System.out.println(ind);
//why important? we want to find where space is to separate things like first name and last name
//KNOWING WHERE IT IS
//IF FINDING INDEX OF CHAR THEN ''. STRING IS ""
//-1 means not found
int space;
space=sentence.indexOf(' ',12); //if put number there then starts from that index. 0 if no number
ind=sentence.lastIndexOf(' '); //stars from end
System.out.println(ind);
//if first index and last name is the same then don't have middle name because only one space
//middle name would be between index and last index of space 
sentence=sentence.concat(" is fun"); 
System.out.println("apple".compareTo("apple")); //see if they are same
//SAME GETS 0
//DIFFERENT GETS 1
//1
//WHEN WE DO COMPARE TO WE ARE ONLY LOOKING FOR THE NUMBER

//another way to compare strings is .equals
System.out.println("apple".compareTo("apple"));


	}

}
