
public class ReverseAnInteger {

	public static void reverseAnInteger(int n)
	{
	
	int rev=0;
	
		while(n!=0)
		{
		int rem=n%10;
		rev = rev*10+rem;
		 n=n/10;
		}
	
		System.out.println(rev);
	
	}
	public static void main(String[] args) {
		
		System.out.println("Enter the number to be reversed");
		
		int num = Integer.parseInt(args[0]);
		reverseAnInteger(num);

	}

}
