import java.util.Scanner;

public class Palindrome 
{
	   public static void main(String args[])	
	   {
		   System.out.println("Enter your Palindrome words");
		   StringBuilder Palindrome = new StringBuilder();
		   Scanner scanner = new Scanner(System. in);
		   Palindrome.append(scanner.nextLine());
                   String Palindrome2 = Palindrome.toString().replaceAll(" ","");
                   StringBuilder Palindrome3 = new StringBuilder(Palindrome2);
                   Palindrome3.reverse();
		   if (Palindrome2.toString().equals(Palindrome3.toString()))
		   {
			   System.out.println("This is the Palindrome word:" + (Palindrome3));
		   }
		   else
		   {
		   System.out.println("This is not the Palindrome word");
		   }
		 
	   }

}