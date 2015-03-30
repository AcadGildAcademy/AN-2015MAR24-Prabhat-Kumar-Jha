package prabhat1;

public class calendar {
	public static void main(String args[])
	{

		System.out.println("input 1 for january ,2 for february and so on");
		int x;
		x= Integer.parseInt(args[0]);
		switch(x)
		{
		case(1): System.out.println("january has 31 days");
		break;
		case(2):System.out.println("february has 28 days");
		break;
		case(3): System.out.println("march has 31 days");
		break;
		case(4):System.out.println("april has 30 days");
		break;
		case(5):System.out.println("may has 31 days");
		break;
		case(6):System.out.println("june has 30 days");
		break;
		case(7):System.out.println("july has 31 days");
		break;
		case(8):System.out.println("august has 31 days");
		break;
		case(9):System.out.println("september has 30 days");
		break;
		case(10):System.out.println("octoberhas 31 days");
		break;
		case(11):System.out.println("november has 30 days");
		break;
		case(12):System.out.println("december has 31 days");
		break;
		default:System.out.println("enter between 1 to 12");
		
		}
	}
}

