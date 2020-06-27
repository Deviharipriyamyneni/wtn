package StringStringBuffer;

public class Ex10 {
public static void main(String[] args) {
		
		String s = args[0];
		int n = Integer.parseInt(args[1]);
		String s1="",s2=s.substring(s.length()-n,s.length());
		for(int i=0;i<n;i++)
		{
			s1+=s2;
		}
		System.out.println(s1);
};

}
