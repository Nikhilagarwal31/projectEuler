public class primefactor {

	public static void main(String[] args) {
		long n=600851475143;long i;long j;
		boolean bool=true;
		for( i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				bool=true;
				for( j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						bool=false;
						break;
					}
				}
				if(bool==true)
				{
					System.out.println(i);
				}
			}
		}
	}
}

