

import java.util.Scanner;

public class E_cookies {

	public static void main(String[] args) {
		System.out.print("Enter the number of cookies:  ");
		Scanner a=new Scanner(System.in);
		int totalCookies=a.nextInt();
		int box=24;
		int container=75;
		int cookieBox=totalCookies/box;
		int leftoverCookies=totalCookies%box;
		int cookieContainer=cookieBox/container;
		int leftoverBoxes=cookieBox%container;
		System.out.println(cookieContainer+" containers of 75 boxes of cookies were shipped out. "
				+ leftoverBoxes+" boxes and "+leftoverCookies+" cookies were left over. ");

	}

}
