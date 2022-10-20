import java.util.Scanner;

public class CommonElement 
{
	public void findCommon(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			boolean flag=false;
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
					{
					System.out.println("common number is:"+a[i]);
					break;
					}
				
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int [] {4,4,9,8,41,32};
		int b[]=new int [] {41,4,90,80,411,321};
		CommonElement c=new CommonElement ();
		c.findCommon(a, b);

	}

}
