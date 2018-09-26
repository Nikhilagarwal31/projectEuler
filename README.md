
public class sum {

	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		for(int i=3;i<1000;i=i+3)
		{
			sum=sum+i;
		}
		for(int i=5;i<1000;i=i+5)
		{
			sum1=sum1+i;
		}
		System.out.println(sum+sum1);
	}

}
