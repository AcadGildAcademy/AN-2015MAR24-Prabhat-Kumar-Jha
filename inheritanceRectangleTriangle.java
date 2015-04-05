package prabhat1;


	class rectangle1
	{
		private int length;
		private int breadth;
		public	rectangle1(int x,int y)
		{
			this.length=x;
			this.length=y;	
		}
		void area()
		{
			System.out.println(length*breadth);
		}
	}
	class triangle extends rectangle
	{
		private int base;
		private int height;
		public triangle(int a ,int b,int c,int d)
		{
			super(a,b);
			base=c;
			height=d;
			
		}
			void area()
			{
				super.area();
			System.out.println("area of triangle");
			System.out.println(0.5*base*height);
			
			}
		
	}
	public class inheritanceRectangleTriangle {

		public static void main(String[] args)
		{
			
		triangle ob1=new triangle(10,20,30,40);
		
		ob1.area();


		}
	}


