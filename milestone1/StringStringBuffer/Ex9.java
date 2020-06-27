package StringStringBuffer;

public class Ex9 {
	public static void main(String[] args) {
		
		String s = args[0];
		String s1 = args[1];
		int l=s.length();
		String res="";
		for(int i=0;i<l;i++)
		{
			 String res2=""+s.charAt(i)+s1.charAt(i);
			
			res=res+res2;
		}
		System.out.println(res);
	}
}
