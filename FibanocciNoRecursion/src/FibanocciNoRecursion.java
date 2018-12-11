
public class FibanocciNoRecursion {
	

	
	static int n;
	static int k;
	static int[] a = new int[100];
  
	

	
	

	public static void main(String[] args) {
			       
			    	 for (int i=2;i<=Integer.parseInt(args[0]);i++)
			    	 {
			    	   a[0]=0;a[1]=1;
			       k=a[i]= (a[i-1])+(a[i-2]); 
  
				}
			    	 System.out.println(" the fibanocci number at  " +Integer.parseInt(args[0])+"th  position is "+k);
		
}
}
			
			
		
			





