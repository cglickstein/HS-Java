import java.util.Scanner;

public class E_students {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		System.out.println("Enter number of students (maximum:50): ");
		int studentNum= reader.nextInt();
		//studentNum++;
		String[] students= new String[studentNum]; 
		double [] scores= new double [studentNum];
		
		for(int i=0; i<studentNum;i++)
		{
			System.out.println("Enter student "+(i+1)+"'s name: ");
			students[i]=reader.next();
			System.out.println("Enter student "+(i+1)+"'s grade: ");
			scores[i]=reader.nextDouble();
		}

		double sumGrades=0;
		for(int j=0; j<scores.length;j++)
		{
			sumGrades+=scores[j];

		}
		double average=(sumGrades/students.length);
		average=Math.round(average);
		System.out.println("Class average: "+ (average));
		
		for(int i=0; i<scores.length;i++)
		{
			if (scores[i]<average)
				
				System.out.println(students[i]+" scored below the class average. ");
		}
		 int max=0;
		 int i;
		 String highest = null;
		for(i=0; i<scores.length;i++)
		{
			if (scores[i]>max)
			{
				max=(int) scores[i];
				highest=students[i];
			}
		}
		System.out.println(highest+" scored a "+max+" which is the highest.");
	}

}
