package session5;

import java.util.Scanner;

public class Rectangle implements Shape {
int length,breadth;
	
	public void draw() {
		// TODO Auto-generated method stub
		Scanner rt=new Scanner(System.in);

		System.out.println("enter the value of length ");
		 length=rt.nextInt();

			System.out.println("enter the value of  breadth");

		 breadth=rt.nextInt();

			System.out.println("enter the value of length and breadth:" +length + breadth);
		
		rt.close();
	}

	@Override
	public void GetArea() {
		// TODO Auto-generated method stub


		System.out.println("the required area is "+ length*breadth);
	}

}
