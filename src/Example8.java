import java.util.Scanner;

/*WAJP2 add elements to a string array  */
public class Example8                                   //String array.
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
	   String s[]=new String[size] ;
	   System.out.println("Enter the element");
	   for(int i=0;i<s.length;i++)
	   {
		   s[i]=sc.next();
	   }
	   for(String x : s)
		   System.out.println(x+" ");

	}

}
