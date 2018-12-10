
public class ReverseString {
	
	static	String s;
	
	String reverseString(String s) {
		  
		 char ch[]= s.toCharArray();

	  char rv[]= new char[s.length()];
	 
	for(int i=0,j=s.length()-1;i<s.length();i++,j--)
	  {
		  rv[j]= ch[i];
	  }
	  String r= new String(rv);	
	  return r;
	}
	

	public static void main(String[] args)
	{
		
		ReverseString rs= new ReverseString();
		
		System.out.println(rs.reverseString("Chaturya"));
		
		
		
	}

}
