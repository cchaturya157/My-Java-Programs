import java.util.Scanner;

public class JoinTwoArrays {
	static Scanner sc;

	public static void joinTwoArrays(int[] a, int[] b) {
		
		{
			int[] c = new int[a.length+b.length];

			for (int i = 0; i < a.length; i++) {
				c[i] = a[i];
			}
			for (int i = 0; i < b.length; i++) {
				c[a.length + i] = b[i];
			}
			System.out.println("the elements of the resultant array are");
			for (int i = 0; i < c.length; i++) {
				System.out.println(c[i]);
			}
		}
	}

	public static void main(String[] args) {

		sc = new Scanner(System.in);
		System.out.println("Enter the size of the first array");
		int array_size1 = sc.nextInt();
		System.out.println("Enter the size of the second array");
		int array_size2 = sc.nextInt();
		int[] first_array = new int[array_size1];
		int[] second_array = new int[array_size2];
		System.out.println("enter the elements of the first array");
		for (int i = 0; i < array_size1; i++) {
			first_array[i] = sc.nextInt();
		}
		System.out.println("enter the elements of the second array");

		for (int i = 0; i < array_size2; i++) {
			second_array[i] = sc.nextInt();
		}
		System.out.println("the elements of the first array you entered are");
		for (int i = 0; i < array_size1; i++) {
			System.out.println(first_array[i]);
		}
		System.out.println("the elements of the second array you entered are");

		for (int i = 0; i < array_size2; i++) {
			System.out.println(second_array[i]);
		}

		joinTwoArrays(first_array, second_array);

	}

}
