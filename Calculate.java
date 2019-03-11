import java.util.*;
class Calculate
{	
	static double result;
	static int sum=0,i,j;
	public static double avg(int n, int a[])
	{
		for(int i=1;i<=n;i++)
		{	
			sum+=i;
		}
		result = sum/n;
		
		System.out.println("The average of a number:"+result);
	}
	public static void main(String args[])
	{
		Calculate c = new Calculate();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number"); 
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<=a[i];i++)
		{
			a[i] = sc.nextInt();
		}
		c.avg(n,a);
		}
}