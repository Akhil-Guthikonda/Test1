package JavaTest;

public class UpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "AkHil";
		
	for(int i=0;i<name.length();i++) {
		char c= name.charAt(i);
		//if(Character.isLowerCase(c))
			if(Character.isUpperCase(c))
		System.out.print(c);
	}
		
		
	}

}
