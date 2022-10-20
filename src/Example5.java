/*. WAJP2 copy an array by iterating the array*/

import java.util.Arrays;
import java.util.Scanner;

public class Example5 
{
	public void copyArray(int a[],int[] new_array)
	{
		for(int i=0;i<a.length;i++)
		{
			new_array[i]=a[i];
			
		}
		for( int x :new_array)
		{
			System.out.println(x+" ");
		}
	}

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
		System.out.println(Arrays.toString(a));
		int new_array[]=new int[size];
		
		Example5 e5=new Example5();
		e5.copyArray(a,new_array);
		

	}

}
