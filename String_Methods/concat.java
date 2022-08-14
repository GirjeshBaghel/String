//The Java String class concat() method combines specified string at the end of this string. It returns a combined string. It is like appending another string.
package String;
import java.util.Scanner;

public class concat {

		
	concat()												// constructor 
	{
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the  First String : "); 
		String str = sc.nextLine(); 						// storing a first string here
		
		System.out.print("Enter a Second String : ");
		String str1 = sc.nextLine();  						// storing a second string here
		if(str.length()==0  && str1.length()==0)			// compare a length here 
		{
			System.out.println("Please Wrtie proper String here."); 
		}
		else
		System.out.println("After Concat String :  "+str.concat(str1));  // adding string here
			
				 
		
	}

	public static void main(String[] args) { 				// main method
	
		new concat(); 									// constructor calling
	}
}
