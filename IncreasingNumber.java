import java.util.*;
class IncreasingNumber
{
	boolean checknumber(int n)
	{
		String s=Integer.toString(n);
		int i;
		int len=s.length();
		for(i=0;i<len-2;i++)
		{
			if((int)s.charAt(i)<=(int)s.charAt(i+1))
			{
				continue;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String ar[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		IncreasingNumber c = new IncreasingNumber();
		System.out.println(c.checknumber(n));
	}
}
	