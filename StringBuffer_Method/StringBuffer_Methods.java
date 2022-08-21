// StringBuffer is synchronized i.e. thread safe. It means two threads can't call the methods of StringBuffer simultaneously.
// StringBuffer is slow StringBuilder.
//StringBuilder is non-synchronized i.e. not thread safe. It means two threads can call the methods of StringBuilder simultaneously.
//StringBuilder is more faster than StringBuffer.
package String;
import java.util.Scanner;

public class StringBuffer_Methods {
	
                                  Scanner sc = new Scanner(System.in);                
                                  StringBuffer str = new StringBuffer("Hello ");          // StringBuffer taking a string
                                  
                                   void accept()                                           // accepting a string from user
                                   {
                                      System.out.print("Enter a String : ");
                                      str.append(sc.nextLine());                            // concating old string with new string by append method
                                      append();
                                    }
  
                                  void append()                                             // appending method
                                  {
                                      System.out.println("Append Method : "+str);           // printing append string here
                                      insert();                                             // inserting method calling
 
                                  }
                                  void insert()
                                  {		
                                      System.out.println("Insert Method : "+str.insert(1, " Insert String "));  // inserting a string by the string index position
                                      replace();                                               // replace method calling
                                  }

                                  void replace()
                                  {
                                    System.out.print("Replacing String : "+str.replace(1, 6," Replace String "));   // print the replace string by the staring value and last value
                                    delete();                                                 // delete method calling
                                  }

                                  void delete()
                                  {
                                    System.out.print("\nDeleting String : "+str.delete(1, 27));// printing the string after a deleting
                                    reverse();                                                  // reverse method calling
                                  }

                                  void reverse()
                                  {
                                    System.out.print("\nReverse String : "+str.reverse());      // printing string after a reverse order
                                    length();                                                   // length method calling
                                  }

                                  void length()
                                  {
                                    System.out.print("\nLength Of String : "+str.length());     // printing the string length
                                    capacity();                                                 // capacity method calling
                                  }

                                  void capacity()
                                  {
                                    System.out.print("\nCapacity Of String : "+str.capacity()); // printing the capacity of a string
                                  }

                                  public static void main(String[] args)                        // main method
                                  {
                                    StringBuffer_Methods ob  = new StringBuffer_Methods();      // creating a object of a class
                                    ob.accept();                                                // calling a accept method

                                  }
}
