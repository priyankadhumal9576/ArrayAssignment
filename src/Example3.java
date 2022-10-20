import java.util.Scanner;

/*WAJP2 test if an array contains a specific value. */

public class Example3 
{
	public void findSpecific(int a[],int num)
	{
		
		
		int value=num;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			int n=0;
			if(n==value)
			{
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println(value+"is find");
		else
			System.out.println(value+"is find");
		
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
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Example3 e3=new Example3();
		e3.findSpecific(a,num);

	}

}
