package logical;

import java.util.Scanner;

public class No__of_white_space {

	public static void main(String[] args) {
	
	String space=" ";
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Name");
	String name=sc.next();
	String b = null;
	
	for(int i=0;i<=name.length()-1;i++) {
		b =b+name.charAt(i);
	if(space.equals(b))
	{
		count++;
	}
	}	
		
	System.out.println("no of white spaces are "+count);	
		
		
		
		
	}

}
