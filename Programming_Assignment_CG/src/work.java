import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class work1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file1=new Scanner(new FileReader("C:\\file1.txt"));
		Scanner file2=new Scanner(new FileReader("C:\\file2.txt"));

This code here should work. What I am doing here is going through the file line by line with the while loop. With each line, I am splitting the parts by your specified delimiter, space. Then, I loop through the elements, trim() it which removes excess spaces, grab the integer, and add it to sum. For each of the integers I take, I add to count. At the very end it's the same as yours.
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test {

    public static void main(String args[]) throws IOException {

        Scanner file = new Scanner(new File("input.txt"));

        String line = null;
        int sum = 0;
        int count = 0;
        while ((line = file.nextLine()) != null) {
            String[] vals = line.split(" ");
            for(int i = 0; i < vals.length; i++) {
                sum += Integer.valueOf(vals[i].trim());
                count++;
            }
        }
        System.out.println("the average is = " + ((double) sum / count));

    }

} 

package txtfileaverage;

import java.io.*;
import java.util.Scanner;

public classWORK {

    public static void main(String args[])  throws IOException
     {
        Scanner file = new Scanner(new File("input.txt")); 

        int numTimes = file.nextInt();
        file.nextLine();

            for(int i = 0; i < numTimes; i++);
            {   
                int sum = 0;
                int count = 0;
              Scanner split = new Scanner(file.nextLine());
              while(split.hasNextInt())
                //for (int a = 0; a < 4 ; a++)
                {
        sum += split.nextInt();
        count++;
                }    
        System.out.println("the average is = " + ((double)sum / count));

            }
                }
	}

}