import java.util.Scanner;
public class PalindromeNumbers {
	static Scanner sc;
	public static int reverseNumbers(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem= n%10;
			rev= rev*10+rem;
			n=n/10;
		}
		return rev;
		
	}
	public static void isPalindrome(int original_number,int  reverse_number)
	{
		if (original_number==reverse_number)
		{
			System.out.println("This is a palindrome");
		}
		else {
			System.out.println("this is not a palindrome");
		}
	}
	public static void main(String[] args) {
		System.out.println("enter the no.");
		sc= new Scanner(System.in);
		int num=sc.nextInt();
		isPalindrome(num,reverseNumbers(num));

	}

}
