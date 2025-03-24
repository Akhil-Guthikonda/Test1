package JavaTest;

public class StringWithDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value = "Akhil 12 chintu";
		String d="", r="";
		
		for(int i=0;i<value.length();i++) {
			char c = value.charAt(i);
			if(Character.isDigit(c))
			{
				d=d+c;
			}else {
				r=r+c;
			}
		}
		String StringWithDigit = d+r;
		System.out.println("StringWithDigit original: " + value);
		System.out.println("StringWithDigit: " + StringWithDigit);
		
	}

}
