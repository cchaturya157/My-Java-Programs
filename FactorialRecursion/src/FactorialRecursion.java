import java.util.Scanner;

public class FactorialRecursion {

	static int n;
	static Scanner scanner;
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
			
		scanner = new Scanner(System.in);
		
		int x=scanner.nextInt();
		
		System.out.println("enter the value of n"+x);
		
		FactorialRecursion fr = new FactorialRecursion();
		
		System.out.println("the factorial value is "+fr.factorial(x));
		
	}

}
