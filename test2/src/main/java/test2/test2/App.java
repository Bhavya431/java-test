package test2.test2;

import java.util.Scanner;

/**
 * scanner input
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); 
    	 System.out.println("Please Enter Name:"); 
    	  String name = input.next();
    	  System.out.println("welecome to hava selenium world "+ name);
    }
}
