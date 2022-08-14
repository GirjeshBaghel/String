//The Java String class length() method finds the length of a string. The length of the Java string is the same as the Unicode code units of the string.
package String;
import java.util.Scanner;

public class length {
	public static void display()							// display method
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the  First String : "); 
		String str = sc.nextLine();     					// storing a first string here
		System.out.print("Enter a Second String : ");
		String str1 = sc.nextLine();  						// storing a second string here
		
		System.out.println("Length of First String : "+str.length());  // printing length of string here
		System.out.println("Length of Second String : "+str1.length()); // printing length of string here
	}
	public static void main(String[] args) {
		display();

	}
}
