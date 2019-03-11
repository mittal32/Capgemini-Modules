class Natural
{	
	int sum;
	public int calculateSum(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum += i;
			}
		}
		return sum;
	}
	public static void main(String args[])
	{
		Natural obj=new Natural();
		int s=obj.calculateSum(5);
		System.out.println("the sum of natural number:"+s);
	}
}