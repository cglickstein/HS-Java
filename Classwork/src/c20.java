
public class c20 {
// ways to create an array
	public static void main(String[] args) {
		int[] numbers; //square says i have an array called numbers
		//i can only have ints inside of it- 1 data type
		
		numbers=new int[10]; //10 shelves in an array. INSTANTIATION - new instance of array
		
		int[] numbers2= new int[10];
		
		int[] numbers3= {3,6,2,1,6}; //3 is 0th elements. auto sets size
		
		numbers[0]=3; //put 3 in 0s
		System.out.println(numbers[0]);
		//cant just print numbers
		
		for (int i=0; i<numbers.length; i++)
			System.out.println("index"+i+"    "+numbers[i]);
		
		for (int i=0; i<numbers.length; i++)
			numbers[i]=2;
		
		numbers[4]=numbers[2]+10;
		System.out.println(numbers[4]);
		
		System.out.println(numbers[10]); //error out of range
		
		
			
		

	

}} 
