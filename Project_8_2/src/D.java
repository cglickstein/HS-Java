import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("hi"); list.add("my"); list.add("name");list.add("is");list.add("chava");
		System.out.println(list);
		pow(list);
	}
	
	public static void pow(List<String>list) 
	{
		int index=0;
		while (index<list.size())
		{if (index%2==0)
			{list.set(index,"");
			}
		index++;
		}
		
		
		for (String value: list) 
			System.out.print((value)+" ");
	}
}
