package JavaTest;

public class ReversCasetoUpperandLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "ReViEw";
		String r = "";
		
		for(int i=0;i<name.length();i++) {
			char C = name.charAt(i);
			if(Character.isUpperCase(C)) 
				r=r+Character.toLowerCase(C);
			else 
				r=r+Character.toUpperCase(C);
		}
		System.out.print(r);
	}
}
