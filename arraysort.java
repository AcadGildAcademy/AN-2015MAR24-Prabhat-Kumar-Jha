
package prabhat1;

import java.util.Arrays;

public class arraysort
{
	public static void main(String args[])
	{
		int i,tos=-1;
		int arr[]=new int[5];
		for(i=0;i<5;i++)
		{
			arr[i]=Integer.parseInt(args[i]);
			tos++;
		}
		System.out.println("before insertion sorted array is");
		Arrays.sort(arr);
		for(i=0;i<5;i++)
		{
			System.out.println(arr[i]);
		
		}
		arraysort ob=new arraysort();
		ob.insertElement(arr,tos);
	}


void insertElement(int a[],int tos)
{
	int j=0,top=-1;
	if(tos==a.length-1)
	{
		System.out.println("array is full");
		int temp[]=new int[6];
		for(j=0;j<5;j++)
		{
			temp[j]=a[j];
			top++;
		}
		
		
			//temp[5]=Integer.parseInt(args[5]);why this line is not working
		temp[5]=90;
		System.out.println("now the array is");
		for(j=0;j<6;j++)
		{
		System.out.println(	temp[j]);
			
		}
		Arrays.sort(temp);
		System.out.println("after sorting");
		for(j=0;j<6;j++)
		{
		System.out.println(	temp[j]);
			
		}
		
		
		
	}
}
}
	
	
