package session5;

import java.util.Scanner;

public class Rectangle implements Shape {
int length,breadth;
	
	public void draw() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("enter the value of length ");
		 length=sc.nextInt();

			System.out.println("enter the value of  breadth");

		 breadth=sc.nextInt();

			System.out.println("enter the value of length and breadth:" +length + breadth);
		
		sc.close();
	}

	@Override
	public void GetArea() {
		// TODO Auto-generated method stub


		System.out.println("the required area is "+ length*breadth);
	}

}
