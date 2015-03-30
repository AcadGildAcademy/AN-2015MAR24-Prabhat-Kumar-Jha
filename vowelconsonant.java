package prabhat1;

public class vowelconsonant {
	public static void main(String args[])
	{
		char tmp;
		tmp=args[0].charAt(0);

		if(tmp=='a'||tmp=='e'||tmp=='i'||tmp=='o'||tmp=='u'||tmp=='A'||tmp=='E'||tmp=='I'||tmp=='O'||tmp=='U')
		{
			System.out.println(tmp+ " is vowel");
		}
		else
			System.out.println(tmp+" is consonant");
	
	}
}

		