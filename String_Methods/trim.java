//The Java String class trim() method eliminates leading and trailing spaces. The Unicode value of space character is '\u0020'.
package String;
import java.util.Scanner;

public class trim {

	Scanner sc = new Scanner(System.in);
	  trim()
	  {
		  System.out.print("Enter the String with Spaces : "); 
	      String str = sc.nextLine();
	      System.out.println(str.trim()+"Space Remove");
	      
	  }
	  public static void main(String[] args)
	  {
		  new trim();
	  }
}
