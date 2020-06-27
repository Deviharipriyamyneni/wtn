package StringStringBuffer;

public class Ex7 {
	public static void main(String[] args)
	{
		String s=args[0];
		if(s.charAt(0)=='x'||s.charAt(0)=='X')
			s=s.substring(1,s.length());
		if(s.charAt(s.length()-1)=='x'||s.charAt(s.length()-1)=='X')
			s=s.substring(0,s.length()-1);
		System.out.println(s);
	}
}
