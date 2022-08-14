//compareTo method that compare ASCI value of each Character to another word
package String;
import java.util.Scanner;

public class compareTo {
	
	compareTo()
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the  First String : "); 
		String str = sc.nextLine();     					// storing a first string here
		System.out.print("Enter a Second String : ");
		String str1 = sc.nextLine();  						// storing a second string here
		
		
		System.out.println(str.compareTo(str1)); 			// compare a ASCI value to another String
	}
	

	public static void main(String[] args) { 				// main method
	
		new compareTo(); 									// constructor calling
	}
}
