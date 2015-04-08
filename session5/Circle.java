package session5;

import java.util.Scanner;

public class Circle implements Shape {
int radius;
	
	public void draw() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of radius");
		 radius=sc.nextInt();
		 sc.close();
		
		
		
	}

	
	public void GetArea() {
		// TODO Auto-generated method stub
		System.out.println("the required area of circle is:"+ 3.14*radius*radius);
		
	}

}
