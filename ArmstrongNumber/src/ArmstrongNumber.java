import java.util.Scanner;
public class ArmstrongNumber {
	static Scanner sc;
	public static int armStrong(int n)
	{
	
		int total=0;
		while(n!=0)
		{
			int rem= n%10;
			
			int temp= rem*rem*rem;
			total= total+temp;
			n=n/10;
		}
		return total;
	}
		public static void isArmstrong(int original_number, int armstrong_sum)
		{
			if(original_number==armstrong_sum)
			{
				System.out.println("this is an armstrong number");
				
			}
			else
			{
				System.out.println("this is not an armstrong number");
			}
	}


	public static void main(String[] args) {
		
		System.out.println("enter the number");
		
		sc= new Scanner(System.in);
		
		int num =sc.nextInt();
		
		isArmstrong(num,armStrong(num));
		

	}

}
