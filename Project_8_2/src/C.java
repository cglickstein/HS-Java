import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class C {

	public static void main(String[] args) {
		Scanner reader= new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3); list.add(7); list.add(9);list.add(-2);list.add(-3);
		System.out.println(list);
		neg(list,reader);

	}
	public static void neg(List<Integer>list, Scanner a) 
	{

	int index=0;
	while (index<list.size())
		{if (list.get(index)<0)
			{System.out.print(list.get(index)+" ");
			}
		index++;
		}
	

	}
}