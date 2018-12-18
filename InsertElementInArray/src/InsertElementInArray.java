import java.util.Scanner;

public class InsertElementInArray {

	public static void insertElemantInArray(int[] a, int inserted_element, int inserted_index) {

		for (int i =a.length-1;i >inserted_index; i--)
		{
            
			a[i]=a[i-1];
			
		}

		a[inserted_index] = inserted_element;

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}
	}

	static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("Enter the no. of elemnets in the arrays");

		int num = sc.nextInt();

		int[] array = new int[num];

		System.out.println("Enter the array elements");

		for (int i = 0; i < num; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("these are the no.s that you entered ");
		for (int i = 0; i < num; i++) 
		{

			System.out.println(array[i]);
		}
			
			System.out.println(" Enter the index in which the element has to be inserted");
			int i_i=sc.nextInt();
			System.out.println("enter the element to be inserted");
			int i_element = sc.nextInt();
			
			insertElemantInArray(array,  i_element,  i_i);

		

	}
}
