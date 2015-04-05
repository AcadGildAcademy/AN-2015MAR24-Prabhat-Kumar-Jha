package prabhat1;

public class bankOverriding
{
	public static void main(String args[])
	{sbi ob1=new sbi("sbi");
	ob1.getRoi();
	axis ob2=new axis("axis");
	ob2.getRoi();
	icici ob3=new icici("icici");
	ob3.getRoi();

	}
}
class bank
{int roi=0;
	
	int getRoi(){
		return 0;
	}
}
class sbi extends bank
{ private String name;
	sbi(String name)
	{
		//super(x);
		this.name=name;
	}
	int getRoi(){
	System.out.println(	"roi is "+ 8);
	return 8;
}
}
class axis extends bank
{private String name;
	axis(String name)
	{
		//super(x);
		this.name=name;
	}
	int getRoi(){
		System.out.println(	"roi is "+ 7);
		
		return 7;
}
}
class icici extends bank
{
	private String name;
	icici(String name)
	{
		this.name=name;
	}
	int getRoi()
	{System.out.println(	"roi is "+ 9);
	
		return 9;
	}

}
