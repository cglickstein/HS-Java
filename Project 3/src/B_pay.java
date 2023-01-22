import java.util.Scanner;

public class B_pay {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter pay rate: ");
		Double pay;
		pay=reader.nextDouble();	
		System.out.print("Enter hours worked: ");
		Double hours;
		hours=reader.nextDouble();
		System.out.print("Gross pay: "+hours*pay+"$");
	}

}
