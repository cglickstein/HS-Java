import java.util.Scanner;

public class F {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter hourly rate: ");
		double hourlyRate=reader.nextDouble();
		System.out.println("Enter total consulting time in mins: ");
		double consultTime=reader.nextDouble();
		System.out.println("Enter income: ");
		double income=reader.nextDouble();
		boolean flag;
		if (income<=25000)
			flag=true;
		else
			flag=false;

		double billingAmount=billingAmount(hourlyRate,consultTime, flag);
		billingAmount=(Math.round(billingAmount))/1;
		System.out.println("The billing amount is "+billingAmount+" dollars.");
		
	}

	private static double billingAmount(double hourlyRate, double consultTime, boolean flag) {
		if (flag==true && consultTime<=30)
			return 0;
		if (flag==true &&consultTime>30)
			return((.4*hourlyRate)*(consultTime/60));
		if (flag==false && consultTime<=20)
			return 0;
		if (flag==false &&consultTime>20)
			return((.7*hourlyRate)*(consultTime/60));
		else
			return 0; //way to do this differently?
		
	}

}
