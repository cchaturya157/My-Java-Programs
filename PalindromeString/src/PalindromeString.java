
public class PalindromeString {
	static String reverse;
	static String ps;
	public static String reverseString(String s1)
	{
		if(s1.length()==0)
		{
			reverse= s1;
		}
		else
		{
		 reverse= reverseString(s1.substring(1))+ s1.charAt(0);
		}
		return reverse;
	}
	
	public static String palindromeString(String s)
	{
		
		String s1= reverseString(s);
		if(s.equalsIgnoreCase(s1)==true)
		{
			ps= "this is a palindrome";
		}
		else if(s.equalsIgnoreCase(s1)==false)
		{
			ps= "this is not a palindrome";
		}
		return ps;
	}
	public static void main(String[] args) {
		
		System.out.println(palindromeString(args[0]));
		

	}

}
