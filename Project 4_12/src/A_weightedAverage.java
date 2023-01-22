import java.util.Scanner;
public class A_weightedAverage {

	public static void main(String[] args) {
		Scanner reader=new Scanner(System.in);
		System.out.print("Enter average grade for quizzes, tests, HW, and projects respectively: ");
		double quiz=reader.nextDouble();
		double test=reader.nextDouble();
		double HW=reader.nextDouble();
		double project=reader.nextDouble();
		
		System.out.print("Enter percent worth for quizzes, tests, HW, and projects respectively: ");
		double quizp=reader.nextDouble();
		quizp=quizp/100;
		double testp=reader.nextDouble();
		testp=testp/100;
		double HWp=reader.nextDouble();
		HWp=HWp/100;
		double projectp=reader.nextDouble();
		projectp=projectp/100;
		
		double quiza= quiz*quizp;
		double testa=test*testp;
		double HWa=HW*HWp;
		double projecta=project*projectp;
		
		double weightedAverage=quiza+testa+HWa+projecta;
		int rounded=(int)Math.round(weightedAverage);
		
		double average=(quiz+test+HW+project)/4;
		
		System.out.println("Weighted avg: "+weightedAverage);
		System.out.println("Unweighted avg: "+average);
		
		
		
	}

}
