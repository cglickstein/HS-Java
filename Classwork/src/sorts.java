import java.util.*;
public class sorts {

	public static void main(String[] args) {
		int[] elements={2,9,7,1,4,3};
		for (int j=0;j<elements.length-1;j++)
		{
			int minIndex=j;
			//locate smallest number inner loop
			for (int k=j+1;k<elements.length;k++) //3 might be smallest number so run to end
			{
				if(elements[k]<elements[minIndex])
				{
					//2nd pass j=1 k=2 minIndex=1... but now 7 is smallest (compared to 9) and index is 2
					minIndex=k; //want it to be k
				}
			}
			//switch elements[minIndex] with elements[j] by introduce new var
			int temp=elements[j];
			elements[j]=elements[minIndex];//1 go where 2 is so store 2
			elements[minIndex]= temp; //thats how put 2 there
			//print list every iteration to see swapping smallest numb every time
			System.out.println(Arrays.toString(elements));
		}

	}

}
