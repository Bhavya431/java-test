package ifelse.ifelse;

import java.util.Scanner;

/**
 * ifelse loop
 *
 */
public class App 
{
    @SuppressWarnings({ "unused", "resource" })
	public static void main( String[] args )
    {
    	Scanner input = new Scanner(System.in); 
   	 System.out.println("Please Enter current year:"); 
   	int currentyear = input.nextInt();
   	Scanner input2 = new Scanner(System.in); 
  	 System.out.println("yearjoined"); 
  	int yearjoined = input2.nextInt();
  	int diff;
    diff =currentyear-yearjoined;
    System.out.println("no of years worked:" +diff);
  	if (diff>3)	
  	{
  		System.out.println("Received bonus of 2500$");
  		
  	}
  	else {
  		System.out.println("Received  no bonus");
  	}
    }
}
    
    
    

