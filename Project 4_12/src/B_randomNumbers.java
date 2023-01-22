import java.util.Random;

public class B_randomNumbers {

	public static void main(String[] args) {
		Random generator=new Random(); 
		int num1=(generator.nextInt(100)+1);
		int num2=(generator.nextInt(100));
		int num3=(generator.nextInt(100)+1);
		int num4=(generator.nextInt(100)+1);
		int num5=(generator.nextInt(100)+1);
		System.out.println("The numbers are: "+num1+", "+num2+", "+num3+", "+num4+", "+num5);
		
		int low, high;
		low=Math.min(num1, num2);
		low=Math.min(low,num3);
		low=Math.min(low,num4);
		low=Math.min(low,num5);
		System.out.println(low+" is the lowest number.");
		
		high=Math.max(num1, num2);
		high=Math.max(high,num3);
		high=Math.max(high,num4);
		high=Math.max(high,num5);
		System.out.println(high+" is the highest number.");		
		

	}

}
