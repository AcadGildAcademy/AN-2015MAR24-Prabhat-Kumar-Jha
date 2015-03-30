package prabhat1;

public class prime {


	public static void main(String args[])
	{
		int i,j;
		for(i=1;i<=100;i++)
		{
			for(j=2;j<i;)
			{
			if(i%j==0)
				break;
			else
				j++;
			}
			if(j==i)System.out.println(i+" is prime");
		}
	}

}
