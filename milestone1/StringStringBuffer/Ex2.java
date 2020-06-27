package StringStringBuffer;

public class Ex2 {
public static void main(String[] args)
{
	String s1=args[0];
	String s2=args[1];
	String s="";
	if(s1.charAt(s1.length()-1)==s2.charAt(0))
	{
		s=s1+s2.substring(1,s2.length());
	}
	else
	{
		s=s1+s2;
	}
	s=s.toLowerCase();
	System.out.println(s);
}
}
