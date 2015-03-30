package prabhat1;

public class leapyear {

	public static void main(String args[])
	{

		System.out.println("enter year");
		int year;
		year=Integer.parseInt(args[0]);
		if(year%100==0)
		{
			if(year%400==0)
			{

				System.out.println(+year+" is leap year");
			}
			else 
			{
			System.out.println(+year+" is not a leap year");
			}
		}
		else
		{
			if(year%4==0)
			{

				System.out.println(year +" is a leap year");
			}
			else
			{

				System.out.println(year +" is not leap year");
			}
		}
	}


}