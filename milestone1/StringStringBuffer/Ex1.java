package StringStringBuffer;

public class Ex1 {
	public static void main(String[] args)
	{
		int f=0;
		String s=args[0];
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				f=1;
				break;
			}
		}
		if(f==0)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
