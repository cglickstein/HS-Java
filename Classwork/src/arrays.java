
public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array of integers, # in [] shows how many in array
		//[]show that it is array
		//can't change size of array
		//can't have more than 1 type of data in array (strings and ints)
		//2 dimensional arrays have two sets of brackets, rows before columns
		//need 2 for loops to go through 2 D arrays
		//if you write sales[0].length and sales is 2D array, it will give the number of columns in row 0
		//A 2D array doesn't have to be a perfect square, can do board[0]=new int [6] and board [1] = new int[2] and the first row will have 6 columns and the second will have 2
		
		//1
		int[] numbers; 
		numbers=new Int[10];//instantiation, making new instance of integer array
		
		//2
		int[] numbers2=new int[10];
		System.out.println(numbers2);
		
		//3
		int[] numbers3= {3,6,2,1,6};//3=0th element, 6=1st, etc
		
		//4
		numbers[0]=3;
		System.out.println(numbers[0]);
		System.out.println(numbers);
		
		for (int i=0; i<numbers.length; i++)//length starts counting from one
			numbers[i]=-2;
		numbers[2]=3;
		for (int i=0; i<numbers.length; i++)//length of array = number of elements, length of numbers=10
			System.out.println("Index" + i + "      " + numbers[i]);
		
		numbers[4]=numbers[2]+10;//takes value of index of 2 (3rd place) in numbers which is 3 and adds 10, 13
		System.out.println(numbers[4]);
		
		
	}

}