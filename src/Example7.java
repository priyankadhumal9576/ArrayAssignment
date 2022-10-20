/* Write two methods that return the average of an array with 
following headers. 
a. public static int average(int[] array) 
b. public static double average(double[] array). 
c. Use {1,2,3,4,5,6} , {6.0,3.4,6.4,1.2,4.0} to test the method*/

public class Example7 
{
	public static int average(int a[])
	{
		int a1[]=new int[a.length];
		int sum=0;
		int i=0;
		int average=sum+a[i]/a.length;
		return average;
		                                               //unresolve
	}
	public static double average(double b[])
	{
		double x[]=new double[b.length];
		double sum=0;
		int i=0;
		double average=sum+b[i]/b.length;
		return average;
		
	}
	

	public static void main(String[] args) 
	{
		int a[]=new int[] {1,2,3,4,5,6};
		double b[]=new double[] {6.0,5.0,3.0,4.0};
		double x[]=b;
		Example7 e7=new Example7 ();
		e7.average(b);

	}
	
}


