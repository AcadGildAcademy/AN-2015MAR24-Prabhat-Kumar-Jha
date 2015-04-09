package session5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricGuitar obj1=new ElectricGuitar();
		ElectricGuitar obj2=new ElectricGuitar();
		
		obj1.play();
		System.out.println(obj1.numberOfString +"\n");
		obj2.play();
		System.out.println(obj2.numberOfString +"\n");
		
ElectricBassGuitar obj3=new ElectricBassGuitar();
ElectricBassGuitar obj4=new ElectricBassGuitar();
obj3.play();
System.out.println(obj3.numberOfString +"\n");
obj4.play();
System.out.println(obj4.numberOfString +"\n");

	}

}
