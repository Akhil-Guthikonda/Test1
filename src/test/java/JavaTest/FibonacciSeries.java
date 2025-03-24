package JavaTest;

public class FibonacciSeries {

	public static void main(String[] args) {
		// Fibonacci series

		int num = 10;

		System.out.println(num);
		
		for(int i=0; i<=num; i++) {
			System.out.print(Fibonacci(i) + "");
		}
	}
	
	public static int Fibonacci(int n) {
		
		if (n==0){
			return 0;
		}else if (n==1) {
			return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
		
	}

}
