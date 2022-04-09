package logical;


public class Spliting_String {

	public static void main(String[] args) {
		

		String a1="java,selenium,testNg,Maven";
		String[] p1 = a1.split(",",4);

		for(String a:p1)
		{
			System.out.println(a);
		}


	}

}
