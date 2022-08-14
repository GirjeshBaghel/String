//The java string split() method splits this string against given regular expression and returns a char array.
package String;
import java.util.Scanner;

public class split {

	static void split_method()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String with spaces : "); // Taking a String with user
		String s1= sc.nextLine();  
		String[] words=s1.split("\\s");		//splits the string based on whitespace  
		
		//using java foreach loop to print elements of string array  
		for(String w:words){  
		System.out.println(w);  
		}  
	}
	
	public static void main(String... args) { 	// main method
		split_method();							// calls a static method

	}

}
