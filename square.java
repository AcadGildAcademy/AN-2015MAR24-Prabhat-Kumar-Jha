package prabhat1;

public class square {
	private int side;
	public square()
	{
		side=0;
	}
	public square(int a)
	{
		this.side=a;
	}
	void area()
	{System.out.println(side*side);
	}
	
		
	public static void main(String args[])
	{
		square ob1=new square();
		ob1.area();
		square ob2=new square(5);
		ob2.area();
		rectangle ob3=new rectangle();
		ob3.area();
		rectangle ob4=new rectangle(6);
		ob4.area();
		rectangle ob5=new rectangle(8,9);
		
	ob5.area();
	}

}
 class rectangle
{
	private int  length;
	private int breadth;
public	rectangle()
	{length=breadth=0;
		
	}
public rectangle(int a)
{
	length=breadth=a;
}
public rectangle(int a,int b)
{
	length=a;
	breadth=b;
}
void area()
{
	System.out.println(length*breadth);
}
}
 

