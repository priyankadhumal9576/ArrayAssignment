import java.util.Scanner;

/*WAJP2 find the index of an array element value. */

public class Example4
{
	public void findIndex(int a[],int num)
	{
		int i=0;
		int index=0;
		while(i<a.length)
		{
			if(a[i]==num)
			{
				index=i;
				break;
			}
			else
				i++;
		}
		System.out.println(index+ ":is index");
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
		System.out.println("Enter the array element");
		int num=sc.nextInt();
		Example4 e4=new Example4();
		e4.findIndex(a,num);
		

	}

}
