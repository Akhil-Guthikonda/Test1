package JavaTest;

public class SwappingNumbers {

	public static void main(String[] args) {
		/* How do you swap two numbers without using a third variable in Java?
		 * Swapping numbers without using a third variable is a three-step process that’s better visualized in code:

                 b = b + a; // now b is sum of both the numbers
                a = b - a; // b - a = (b + a) - a = b (a is swapped)
                b = b - a; // (b + a) - b = a (b is swapped)
		 */

		int a = 20;
		int b=40;
		
		System.out.println("a:" + a+"," + "b:" + b);
		
		a=a+b;//a=60
		b=a-b;//b=20
		a=a-b;//60-20=40
		
		System.out.println("After Swapping: a is "+  a + " b is " + b);
		
	}

}
