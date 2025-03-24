package JavaTest;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number = 4;
		boolean isprime = checkprimre(number);

		if(isprime) {
			System.out.println(number + " isprime true");
		}else {
			System.out.println(number + " isprime false");
		}
	}

	public static boolean checkprimre(int n) {
		
		if(n<=1) {
			return false;
		}
		for (int i=2; i<=Math.sqrt(n);i++) {
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
		
		
	}
	
	
	
}
