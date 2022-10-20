import java.util.Arrays;
import java.util.Scanner;

/* WAJP2 delete an element from an array at specified position. */

public class Example9
{
	public void doDeletion(int a[],int index,int size)
	{
		for(int i=index;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		size=size-1;
		System.out.println("The new array");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(Arrays.toString(a));
			//System.out.println(a[i]+" ");
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
		System.out.println("Enter the index");
		int index=sc.nextInt();
		Example9 e9=new Example9();
		e9.doDeletion(a,index,size);
		

	}

}
