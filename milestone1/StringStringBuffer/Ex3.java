package StringStringBuffer;

public class Ex3 {
public static void main(String[] args)
{
	String s=args[0];
	String output="";
	for(int i=0;i<s.length();i++)
	{
		output+=s.substring(0,2);
	}
	System.out.println(output);
}
}
