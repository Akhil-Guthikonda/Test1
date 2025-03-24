package JavaTest;

public class PalindromeCheck {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Name = "madam";
		String reverse = "";
		
		for (int i=Name.length()-1;  i>=0;  i--) {
	          reverse +=Name.charAt(i);
		}
		System.out.println(reverse);
		if(Name.equals(reverse)) {
			System.out.println(Name + ": Palindrome");
		}else {
			System.out.println(Name + ": NOT Palindrome");
		}	
	}
}
