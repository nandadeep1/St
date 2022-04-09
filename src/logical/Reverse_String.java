package logical;

public class Reverse_String {

	public static void main(String[] args) {
	String o="1234";
	String k="";
	char c;
	for(int i=0;i<=o.length()-1;i++)
	{
	c=o.charAt(i);//collects character at index i
	k=c+k;//Stores collected character in string
	}
	System.out.println(k);	
		
		
	}

}
