import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class E {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file1=new Scanner(new FileReader("U:\\students1.txt"));
		String name="";
		while (file1.hasNextLine())
		{
		name=file1.nextLine();
		}
		System.out.println(name);
		
		String nameRearranged=nameRearranged(name);
		System.out.println(nameRearranged);
	}

	private static String nameRearranged(String name) {
		String[] list=name.split(",");
		String s2=list[1]+", "+list[2]+", "+list[0];
		return s2;
	}

}
