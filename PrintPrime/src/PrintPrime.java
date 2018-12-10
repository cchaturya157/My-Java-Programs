
public class PrintPrime {
	
static int input;
	static int n;
	 

	public static void main(String[] args) {
		for(input=2;input<100;input++)
		{
			
			boolean sb=true;
			for(n=2;n<input;n++)
		
				
			{
				
				if (input%n==0)
				{
				 sb=false;
				 break;
		
					
				}

				}
				 if(sb==true)
				 {
					 System.out.println(input+"  ");
				 }
				
		
		}
	}
}



