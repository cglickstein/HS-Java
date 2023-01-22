//case
public class c13 {

	public static void main(String[] args) {
		String lg="";
		int grade=99;
		if (grade>=90)
			lg="A";
		else if (grade>=80)
			lg="B";
		else if (grade>=70)
			lg="C";
		else
			lg="D";
		//one variable that you're checking many times,
			
		int switchgrade=90;
		switch(switchgrade/10)
		{
		case 10:
		case 9:
			lg="A";
			break;
		case 8:
			lg="B";
			break;
		case 7:
			lg="C";
			break;
		default:
			lg= "D";
			break;
		}
		System.out.println(lg);
		//for else if, doesnt go into anything except first condition satisfied. cases fall through 
		//to solve falling through put break in between each case condition
		//advantage of a switch is that just falls through so dont need code after first line
	}

}