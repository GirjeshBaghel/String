//The equals() method compares two strings by their reference or object , and returns true if the strings are equal, and false if not. 
package String;

import java.util.Scanner;

public class equals {
	
	public static void display()							// display method
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the  First String : "); 
		String str = sc.nextLine();     					// storing a first string here
		System.out.print("Enter a Second String : ");
		String str1 = sc.nextLine();  						// storing a second string here
				
		//Equals method that return a boolean type and its compare reference variable
		System.out.println(str == str1);  					// compare reference only
		System.out.println(str.equals(str1));				// compare reference value here 
		System.out.println(str.equalsIgnoreCase(str1)); 	// it ignores the Capitalization and lower case
		
		
		
	}
	public static void main(String[] args) { 				// main method
		display();

	}
}
