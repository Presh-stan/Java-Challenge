package javaChallenge;

public class PhrasePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A man, a plan, a canal:Panama";
		String s1,s2,rev="";
		s1 = s.replaceAll("[^a-zA-Z0-9]", "");
		s2=s1.toLowerCase();
		System.out.println("value of s1 " + s2);
		if(s=="")
			System.out.println("It is a palindrome");
		for(int i=s2.length()-1;i>=0;i--)
			{rev=rev+s2.charAt(i);
			}
		if(s2.equals(rev))
			System.out.println("True, Its a palindrome");
		else
			System.out.println("False, Its not a palindrome");
	}

}
