package JavaTest;

public class CountUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "AkHil";
		int count = 0, lowcount=0;
		for(int i=0;i<name.length();i++) {
			char c = name.charAt(i);
			if(Character.isUpperCase(c))
				count++;
			if(Character.isLowerCase(c))
				lowcount++;
		}
		System.out.println("CountUpperCase: " + count);
		System.out.println("CountLowerCase: " + lowcount);

	}

}
