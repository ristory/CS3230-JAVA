import java.util.*;
import java.util.Scanner;

public class FractionCal
{
	
	static	String regex = "-?[0-9]+[ \t]*/[ \t]*-?[0-9]+[ \t]*[+-/\\*][ \t]*-?[0-9]+[ \t]*/[ \t]*-?[0-9]+";
    public static void main(String[] args) 
    {      
      
         Scanner scan = new Scanner(System. in );
         System.out.println("Enter the expression ");
         String test = scan.nextLine();
         if (test.matches(regex))
         {
			
		 System.out.println(test);
         String[]split = test.split(" ");
         int a1 = Integer.parseInt(split[0]);
         int b1 = Integer.parseInt(split[2]);
         Fraction F1 = new Fraction(a1,b1);
         System.out.println("Fraction1:" + F1);
         int a2 = Integer.parseInt(split[4]);
         int b2 = Integer.parseInt(split[6]);
         Fraction F2 = new Fraction(a2,b2);
         System.out.println("Fraction2:" + F2);
           
         if (split[3].equals("+"))
         {
        	 Fraction F3 = F1.add(F2);
             System.out.println("F3 = F1 + F2 : " + F3);
             if (F3.equals(F1))
                 System.out.println("F3 equals F1");
                else
                 System.out.println("F3 is not equal to F1");
              if (F3.equals(F2))
                 System.out.println("F3 equals F2");
              else
              	System.out.println("F3 is not equal to F2");
         }
         if (split[3].equals("-"))
         {
        	 Fraction F3 = F1.sub(F2);
             System.out.println("F3 = F1 + F2 : " + F3);
             if (F3.equals(F1))
                 System.out.println("F3 equals F1");
                else
                 System.out.println("F3 is not equal to F1");
              if (F3.equals(F2))
                 System.out.println("F3 equals F2");
              else
              	System.out.println("F3 is not equal to F2");
         }
         if (split[3].equals("*"))
         {
        Fraction F3 = F1.mult(F2);
        System.out.println("F3 = F1 * F2 : " + F3);
        if (F3.equals(F1))
            System.out.println("F3 equals F1");
           else
            System.out.println("F3 is not equal to F1");
         if (F3.equals(F2))
            System.out.println("F3 equals F2");
         else
         	System.out.println("F3 is not equal to F2");
         }
         if (split[3].equals("/"))
         {
        Fraction F3 = F1.div(F2);
        System.out.println("F3 = F1 * F2 : " + F3);
        if (F3.equals(F1))
            System.out.println("F3 equals F1");
           else
            System.out.println("F3 is not equal to F1");
         if (F3.equals(F2))
            System.out.println("F3 equals F2");
         else
         	System.out.println("F3 is not equal to F2");
         }
  	
         }
         
         else
				System.out.println("Invalid inout");
         
} 
}