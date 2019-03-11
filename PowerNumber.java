import java.util.*;
class PowerNumber
{
	public boolean checkNumber(int n)
	{
		if(n==0)
		{
			return false;
		}
		else if(n==1)
		{
			return true;
		}
		else
		{
			while(n!=1)
			{
				if(n%2!=0)
				{
					return false;
				}
				n=n/2;
			}
			return true;
		}
	}	
	public static void main(String args[])
	{
		PowerNumber obj = new PowerNumber();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(obj.checkNumber(n));
		
	}
}