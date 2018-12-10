
public class FactorialRecursion {

	static int n;
	int factorial(int n) {
		
		if (n==0)
		{
			return 1;
		
		}
		else if(n==1)
		{
			return 1;
		}
		else
		{
			return factorial(n-1)*n;
		}
	}
	public static void main(String[] args) {
			
		
		int x=Integer.parseInt(args[0]);
		
		FactorialRecursion fr = new FactorialRecursion();
		
		System.out.println(fr.factorial(x));
		
	}

}
