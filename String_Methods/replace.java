//The Java String class replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
//The Java String class replaceAll() method returns a string replacing all the sequence of characters matching regex and replacement string.
package String;
import java.util.Scanner;

public class replace {
	
	Scanner sc = new Scanner(System.in);
	  void replacing()													// replace method
	  {
		  System.out.print("Enter a String : "); 						// taking a string from user
	      String str = sc.nextLine();
	      String str1 = str.replace("hello", "Java");					// replacing a string here
	      System.out.println("After replace : "+str1);	    
	   }
	   void replace_all()												// replace_All method
	   {
		   System.out.print("Enter a String : ");
		   String str = sc.nextLine();
		   String str1 = str.replaceAll("a", "e");  					// replace a with e in all string
		   System.out.println("After replaceAll_Method : "+str1);  		// output show after changing the string
	   }
		public static void main(String[] args)							//  main method
		{
			
			replace rp = new replace();
			rp.replacing();												// calling a replace method
			rp.replace_all();											// calling replace all method
		}
}
