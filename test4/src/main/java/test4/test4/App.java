package test4.test4;

import java.util.Scanner;

/**
 * string concatenate
 *
 */
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in);
    	System.out.print("First Name:");
    	String FirstName = input.nextLine();
    	
   	    System.out.print("Last Name:");
   	   String LastName = input.nextLine();
   	String fullName = FirstName + LastName;
   	System.out.print("combined string :" + fullName);
    }


    }

