import java.util.Scanner;

/*WAJP2 calculate the average value of array elements.*/

public class Example2 
{
	public void findAverage(int a[])
	{
		int sum=0;
		int average=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			average=sum/a.length;
		}
		System.out.println(average+"is average of the given array ");
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
		Example2 e2=new Example2 ();
		e2.findAverage(a);
		

	}

}
