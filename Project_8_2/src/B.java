import java.util.*;
public class B {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		list.add(3); list.add(7); list.add(9);
		System.out.println(list);
		System.out.println("Enter the values you wish to swap: ");
		int swap1=reader.nextInt();
		int swap2=reader.nextInt();
		swap(list,swap1,swap2);

	}
	public static void swap(List<Integer>list, int swap1,int swap2) 
	{Scanner reader= new Scanner(System.in);
	int index=0;
	int a=0;
	int b=0;
	while (index<list.size())
		{
		if (swap1==list.get(index))
			{a=index;
			}
		if (swap2==list.get(index))
			{b=index;
			}
		index++;
		}
	list.set (a,swap2);
	list.set (b,swap1);
	for (Integer value: list) 
		System.out.print((value)+" ");		
	}
}