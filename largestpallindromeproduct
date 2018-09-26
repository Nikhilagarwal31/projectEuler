public class pallindrome {

	public static void main(String[] args) {
	int n;int max=0;
	for(int i=100;i<=999;i++)
	{
		for(int j=999;j>=100;j--)
		{
			n=i*j;
			int temp=n;int r;
			int sum=0;
			while(n>0)
			{
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
			if(temp==sum)
			{
				if(temp>max)
				{
					max=temp;
				}
				else 
				{
					max=max;
				}
			}
			
		}
	}
	System.out.println(max);
	}
	
}
