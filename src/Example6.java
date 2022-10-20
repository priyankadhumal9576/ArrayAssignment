import java.util.Scanner;

/*WAJP2 print reverse of an array*/

public class Example6 
{
	public void doReverse(int a[])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
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
		Example6 e6=new Example6();
		e6.doReverse(a);

	}

}
