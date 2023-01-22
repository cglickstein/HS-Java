//search
public class sort {

	public static void main(String[] args) {
		// SEQUENTIAL regular search to see if there. if not then -1. TARGET = item looking for
		//elements (array)
		//loop: 
		//1 5 23 12 7 42
		
		//public static int sequentialSearch
		//send in array and target 
		for(int j=0; j<elements.length;j++)
		{
			if(elements[j]==target)
				return j; //inside of method
		}
		//when for loop finished then account for if don't find anything 
		return -1;
	
	//BINARY SEARCH- CAN DO IF HAVE SORTED LIST IN ASCENDING - cuts list in half and says is target bigger or smaller than first half then ignore half
//PRECONDITION IS CONDITION GOING IN
	//have target and elements. elements in array are 1 3 7 9 12 16 22
		//using keywords/vars left, right, and middle. add up and divide to find middle (6 indexes so divide by 2)
		
		//precondition= items found in element are in ascending order
		int [] elements= {1,3,7,9,12,16};
		int target=3;
		binarySearch(elements, target);
		public static int binarySearch(int [] elements, int target)
		{
			int left=0; //always start with 1
			int right= elements.length-1;
			while(left<=right) //nothing left to checkand just re checking 
			{
				int middle=(left+right)/2; //not values but find middle INDEX. INDEX of middle //elements bracket middle find middle 
				if(target<elements[middle])
				{
					right=middle-1; //not 9. change value of right
				}
				else if(target>elements[middle])
				{
					left=middle+1;
				}
				else 
					return middle;
			}
			return -1;
		}
	
	
	}

}
