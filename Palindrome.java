package string;

public class Palindrome {
	public static void main(String[] args) {
		String name = "madam";
		String rev="";
		int length = name.length();

		for(int i = length-1;i>=0;i--) {
			rev = rev + name.charAt(i);
			System.out.println(rev);
			
		}
		if(name.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("NotAPalindrome");
		}
	}

}
