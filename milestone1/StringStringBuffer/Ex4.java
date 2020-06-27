package StringStringBuffer;

public class Ex4 {
	public static void main(String[] args)
	{
		String s=args[0];
		String output="";
		if(s.length()%2==0)
		{
			output+=s.substring(0,s.length()/2);
		}
		else
			output=null;
		System.out.println(output);
}

}