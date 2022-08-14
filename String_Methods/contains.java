/*The Java String class contains() method searches the sequence of characters in this string. 
It returns true if the sequence of char values is found in this string otherwise returns false.*/
package String;
import java.util.Scanner;

public class contains {
	
	public static void showing()
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the  First String : "); 
		String str = sc.nextLine();     					// storing a first string here
		  							
		System.out.print(str.contains("Hello"));			// check that particular string are have or not their
	}

	public static void main(String... args)					// main method	
	{
		showing();
	}
}
