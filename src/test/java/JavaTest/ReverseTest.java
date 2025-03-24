package JavaTest;

public class ReverseTest {

	public static void main(String[] args) {
		//How do you reverse a string in Java?
		//input = How do you reverse a string in Java?
		//output = lihka ma i

		String OriginalValue = "How do you reverse a string in Java?";
		String ReversValue = "";
		
		for(int i=OriginalValue.length()-1;i>=0;i--) {
			ReversValue += OriginalValue.charAt(i);
		}
		System.out.println("OriginalValue: " + OriginalValue);
		System.out.println("ReversValue: " + ReversValue);
	}

	}
	
