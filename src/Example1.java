import java.util.Scanner;

/*WAJP2 
a. add elements to single dimensional int array 
b. print elements from single dimensional int array */

public class Example1
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		System.out.println("Elements of the array are:");
		int a[]=new int [size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int x:a)
		{
			System.out.println(x+" ");
		}

	}

}
