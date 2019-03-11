class Difference 
{
	static int sum, sum1, sum2, result;
	public static int calculateDifference(int n)
	{
		
		for (int i=1;i<=n;i++)
		{
			sum=sum+(i*i);
			sum1=sum1+ i;			
		}
		sum2 = sum1 * sum1;
		if(sum>sum2)
		{
			result = sum - sum2;
		}
		else
		{
			result = sum2-sum;
		}
		return result;
	}
	public static void main(String args[])
	{
		Difference obj = new Difference();
		System.out.println(obj.calculateDifference(4));
	}
}