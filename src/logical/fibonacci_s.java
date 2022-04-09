package logical;

public class fibonacci_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 2 3 5
		int p=0;
		int q=1,r;
		System.out.print(+p+" "+q);
		for(int i=0;i<=20;i++)
		{
			r=p+q;
			p=q;
			q=r;
			System.out.print(" "+r);
			
		}

	}

}
