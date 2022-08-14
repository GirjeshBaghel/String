//The Java String class join() method returns a string joined with a given delimiter. In the String join() method, the delimiter is copied for each element. 
package String;
import java.util.Scanner;

public class join {
	static void join_method()
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the  First String : "); 
		String str = sc.nextLine();     					// storing a first string here
		System.out.print(str);
		/*
		 * System.out.print("Enter a Second String to Join a first String : "); String
		 * str1 = sc.nextLine();
		 */						// storing a second string here
		System.out.print(String.join(str," Join_Method"));    // join the string here.
	}
	
	public static void main(String... args)					// main method
	{
		join_method();										// join method calling
	}
}
