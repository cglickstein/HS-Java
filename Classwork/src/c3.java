
public class c3 {

	public static void main(String[] args) {
		// Math
		/*many lines can get commented out this way*/
		System.out.println(2+5);
		System.out.println(13+89);
		System.out.println(5/2); //when you do math with two integers, you'll only get integer part- not rounded
		System.out.println(34%5); //mod-gives remainder
		System.out.println(34/5);
		System.out.println(4/6);
		System.out.println(34%6);
		
		System.out.println(4.0/6);
		System.out.println(3.0+2); //get decimal answers with mixed numbers
		System.out.println(3/2+5.0); //first gives integer
		System.out.println(15.6/2+5); //can't have integer division or integer. always need float
		System.out.println(4*3+7/5-25.5); 
		//we can't change int variables to literals and add a 0
		//Type conversion/casting- change type of data. a lot of time we have variables and number
		
		System.out.println((int)7.5); //casting 7.5 to be an integer
		System.out.println((double)25);
		System.out.println((double)(3/2));
		System.out.println((double)3/2); //double is attached to 3 then divides and gives a double
		System.out.println(3/(double)2); //can also do this with 2
		
		int m,n;
		double x,y;
		x=3;
		m=(int)(x+.5);
		System.out.println(m);
		
		y=-3;
		n=(int)(y-.5); //can't put double into int
		System.out.println(n);
		System.out.println((double)(x+2)); //x was declared a double
		System.out.println((double)(m)); //still has integer but can be used as a double
		
		int r;
		//r= (double)(x+.5); //cant ever put a double into an integer because have to cast it. other way is fine
		r=(int)(x+.5); //inting "x" then making it into a double
		
		//example: liter cartons have to be integer OR age as double and age as int
		
		//if m is int then you can put into double but then you can never change it
	}
;
}
