
import java.util.Scanner;

public class DeleteElementInArray {
	static Scanner sc;
	
	public static void deleteElement(int[] a, int delete)
	{

	for(int i=0;i<a.length;i++)
	{
		if(delete==a[i])
		{
			for(int j=i;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			} break;
		}
	}
	for(int i=0;i<a.length-1;i++) 
	{
	System.out.println(a[i]);
	}
	}
		
	public static void main(String[] args) {
		
		sc= new Scanner(System.in);
		System.out.println("Enter the no. of elements in the array");
		int n=sc.nextInt();
		int array[]= new int[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++)
		{
			array[i]= sc.nextInt();
		}
		System.out.println("the elements you entered are");

		for(int i=0;i<n;i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("eneter the no. to be deleted");
		int del= sc.nextInt();
		
		deleteElement(array,del);

	}
	}
