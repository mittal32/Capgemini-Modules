import java.util.*;
class CheckPrime 
{
	public static void main(String[] arg)
	{
		int n, flag=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want to check");
		n = sc.nextInt();
		for(int i=2; i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("No is prime:"+n);	
		}
		else
		{
			System.out.println("No is not prime:"+n);
		}
	}
		
}