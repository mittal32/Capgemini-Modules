import java.util.*;
class BubbleSort
{
	public static void main(String args[])
	{
		int temp,i,j,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements you want to insert");
		n = sc.nextInt();
		int arr[] = new int[n];

		for(i=0; i<n; i++)
		arr[i] =sc.nextInt();

		for(i=0; i<(n-1);i++)
		{
			for(j=0; j<(n-i-1);j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] =temp;
				}
			}
		}
		System.out.println("Sorted list of elements:");
		for(i=0;i<n;i++)
		{
			System.out.print(arr[i]+ " ");
		}
	
	}
}