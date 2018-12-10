//program to print fibanocci series till 10 numbers
import java.util.Scanner;
public class FibanocciRecursion {


static Scanner sc;



int fibanocci(int j) {
	
	if(j==0)
	{
		return 0;
	}
	
	else if (j==1||j==2)
	{
		return 1;
	}
	else{
		
	
	return fibanocci(j-1)+ fibanocci( j-2);
		
	}
	
	
}


	public static void main(String[] args) {
		 
	
	  
	 System.out.println("enter the desired number upto which series is printed");
	 sc= new Scanner(System.in);
	 
		int n= sc.nextInt();
		
	 
	FibanocciRecursion f = new FibanocciRecursion();
	
	for(int i=0;i<n;i++)
	{
		
		
	System.out.println(" The required fibanocci series is "  +f.fibanocci(i));

	}

}

}