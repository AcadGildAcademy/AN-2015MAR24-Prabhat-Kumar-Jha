package prabhat1;

public class vote {
	public static void main(String args[])
	{
	System.out.println("enter your age");
	int y;
	y=Integer.parseInt(args[0]);
	if(y>=18)
	{
		System.out.println("congrats you are eligible for voting");
	
	}
	else
	{
		System.out.println("sorry!! you are not eligible to vote");
	}
	}

}
