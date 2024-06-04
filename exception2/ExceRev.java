package exception2;

public class ExceRev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int c[]= new int[5];
			int a = 10, b=0;
			c[5]=a/b;
			
			
			System.out.println("the divison is:"+c);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println();
		}
	}

}
