public class prime {

	public static void main(String[] args) {
		int i=0;
		int n=2;
	
		
	while(i<=10001)
	{
		int count=0;
		for(int j=2;j<=n;j++)
		{
			if(n%j==0)
			{
			count++;
			}
			
			
		}
		if(count==1)
		{
			i++;
			
		}
		if(i==10001)
		{
			System.out.println(n);
			break;
			
		}

		n++;
			
			
	}
	}
}


