package abstraction;

/**
 * Example abstraction class. Extend Abstract2ClassA to print fib seq.
 *
 */

public class Abstract2ClassB extends Abstract2ClassA {

	public int xxaxdf = 1;
	@Override
	public void action() {
		int a = 1;
		int b = 1;
		int c = 1;
		System.out.println(1);
		while(c < 100){
		System.out.println(c);
		c = a + b;
		a = b;
		b = c;		
		}
	}

	
}
