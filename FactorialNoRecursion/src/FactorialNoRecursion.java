
public class FactorialNoRecursion {
	
	static int n;
	static int fact=1 ;
	

	public static void main(String[] args) {
	
					 n= Integer.parseInt(args[0]);
					
			       for(int j=1;j<=n;j++)
			    	   
			       {
			       
			       fact= fact*j;
			       
			     
				}
			       System.out.println(fact);
			}
			
			
		}
		
			


