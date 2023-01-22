import javax.lang.model.util.Elements;

public class mergeSourt {
	static double Average() {
		System.out.println("yuppppp");
	}

	public static void main(String[] args) {
		/*public MergeSort(int [] elements); // main method can only access merge sourt 
		//calls mergesorthelper. 
		//sends original list. sends int from and int to which is  n-1 and temporary array same size 
		private MergeSortHelper(); //RECURSIVE part of mergesort. calls itself and breaks the original array into smaller pieces until 1 element sized array
		private Merge(int [] elements, int from, int middle, int to, int [] temp);
		//comparison between which element smaller to go first. use temp to store smaller */
		
		//values inside of array change 
		
	}

	public static void MergeSort(int [] elements) {
		int n = elements.length;
		int [] temp = new int[n];
		MergeSortHelper(elements, 0,n-1, temp);
				
				//length and stores in n then makes temp list then use mergesorthelper
	} 
	
	private static void MergeSortHelper(int [] elements, int from, int to, int [] temp)
	{
		if (from<to) //already went through everything
		{
			int middle=(from+to)/2; //like binary search
			MergeSortHelper(elements, from, middle, temp); //recursive because calling element we're in right now 
			MergeSortHelper(elements, middle+1, to, temp);
			Merge(elements, from, middle,to, temp);
		}//0 to 1, 2 to 1
	}
	private static void Merge(int[] elements, int from, int mid, int to, int [] temp)
	{
		int i=from;
		int j=mid+1;
		int k=from;
		
		while(i<= mid && j<=to)
		{
			if (elements[i]< elements[j])
			{
				temp[k]=elements[i];
				i++;
						
			}
			else
			{
				temp[k]=elements[j];
				j++;
			}
			k++;
		}
		while(i<=mid) //that side of array had bigger numbers in it,c opy into temp so dont lose values
			//taking extra numbers and put into temp so theyre not lost 
		{
			temp[k]=elements[i];
			i++;
			k++;
		}
		while (j<=to)
		{
			temp[k]=elements[j];
			j++;
			k++;
		}
		for (k=from;k<=to;k++)
		{
			elements[k]=temp[k];
		}
	}
}
