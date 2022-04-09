package logical;

import java.util.Scanner;

public class Palindrome_Study {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("Plz Enter Name");
String Name = sc.next();
String rev="";
for(int i=0;i<=Name.length()-1;i++)
{
rev=rev+Name.charAt(i);	
}
if(Name.equals(rev))
{System.out.println("It is Palindrome");
	}
else {
	System.out.println("It is not Palindrome");
}
		
		
		
		
		
		
	}

}
