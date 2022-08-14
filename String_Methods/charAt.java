//The charAt() method returns the character at the specified index in a string. The index of the first character is 0, the second character is 1, and so on.
package String;
import java.util.Scanner;

public class charAt {

	public static void display()							// display method
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the  First String : "); 
		String str = sc.nextLine();     					// storing a first string here
		System.out.print("Enter a Second String : ");
		String str1 = sc.nextLine();  						// storing a second string here
		
		System.out.println(str.charAt(3));					// CharAt method return a index value here
			
		
	}
	public static void main(String[] args) {  				// main method
		display();

	}

}
