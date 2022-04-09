 package Package1;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
	    Scanner input =new Scanner(System.in);
		System.out.println("please enter value of a=");
	    int a =input.nextInt();
	    System.out.println("please enter value of b=");
	    int b =input.nextInt();
	    System.out.println("what u want between these two?");
	    System.out.println("Enter 1 for Addition");
	    System.out.println("      2 for Subtraction");
	    System.out.println("      3 for Multiplication");
	    System.out.println("      4 for Divison");
	    int in =input.nextInt();
	    double c;
	    while(true)
	    {
	    	switch(in)
	    	{
	    	case 1:
	    		c=a+b;
	    		System.out.println("Answer is "+c);
	    		break;
	    	case 2:
	    		c=a-b;
	    		System.out.println("Answer is "+c);
	    		break;
	    	case 3:
	    		c=a*b;
	    		System.out.println("Answer is "+c);
	    		break;
	    	case 4:
	    		c=(a/b);
	    		System.out.println("Answer is "+c);
	    		break;
	    	}	
	    	 System.exit(0);
	    }	
	   
	}
		
}
