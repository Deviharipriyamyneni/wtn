package StringStringBuffer;

public class Ex6 {
	public static void main(String[] args)
	{
		String s1=args[0];
		String s2=args[1];
		String s="";
		if(s1.length()<s2.length())
		{
			s+=s1+s2+s1;
		}
		else
		{
			s+=s2+s1+s2;
		}
		System.out.println(s);
	}
}
