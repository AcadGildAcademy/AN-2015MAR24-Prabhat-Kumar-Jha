package Threads;

public class Problem1 {
	public static void main(String args[])
		{
			Newthread obj1=	new Newthread("first");
			obj1.setPriority(Thread.MIN_PRIORITY);
			Newthread obj2=	new Newthread("second");
			obj2.setPriority(Thread.NORM_PRIORITY);
		Newthread obj3=	new Newthread("third");
		obj3.setPriority(Thread.MAX_PRIORITY );
		try
		{
			System.out.println("waiting for other threads to finish");
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{

			System.out.println("main threads interrupted");
		}
		}

}
class Newthread extends Thread
{int i;
	//Thread t;
	Newthread(String name)
	{
		super(name);
		System.out.println("child thread:"+this);
		start();
	}
	public void run()
	{
		try
		{
			for(i=1;i<10;i++)
			{
				System.out.println(this+"child thread "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(this +"chid thread interrupted");
		}
	}
}
