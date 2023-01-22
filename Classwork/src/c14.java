
public class c14 {

	public static void main(String[] args) {
		int num=2;
		switch(num)
		{
		case 0:
		case 1:
			System.out.println("Hello");
		case 2:
			System.out.println("there");
		case 3:
			System.out.println("I am");
		case 4:
		case 5:
			System.out.println("Mickey Mouse");
			break;
		case 6:
			System.out.println("Nice day");
			break;
		default:
			System.out.println("out of range");
			//you can go all the way through
		}

		int grade=10;
		switch(grade)
		//has to  be in this order because getting more privelages
		{
		case 12:
			System.out.println("You can eat outside");
		case 11:
			System.out.println("You can leave early on Friday");
		case 10:
			System.out.println("You can come late on Wednesday");
		case 9:
			System.out.println("You can eat here");
			break;
		default:
			System.out.println("You are not in highschool.");
		//if no break then would say you're not in highschool
		//can have letters as cases	
		}

	}

}