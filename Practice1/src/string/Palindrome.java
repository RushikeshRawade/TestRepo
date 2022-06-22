package string;

public class Palindrome {

	
	public static void main(String[] args)
	{
		
		String s1 = "madam";
		StringBuilder sb = new StringBuilder(s1);
		StringBuilder t = sb.reverse();
		String s2 = t.toString();
		
		
		if(s1.equals(s2))
		{
			System.out.println("Palindrome");
		}
		
		
		if(!s1.equals(s2))
		{
			System.out.println("Not Palindrome");
		}
		
	}
}
