package test3.test3;

import java.util.Scanner;

/**
 * Sum of numbers and strings
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
     
      int sum ;
      
        @SuppressWarnings("resource")
		Scanner input =new Scanner (System.in); 
        System.out.println("Please Enter firstnumber");
        int firstnumber =input.nextInt();
        System.out.println("Please Enter secondnumber");
        int secondnumber = input.nextInt();
        sum = firstnumber +secondnumber;
        System.out.println("sum of two numbers" +sum);
        
    }
}
