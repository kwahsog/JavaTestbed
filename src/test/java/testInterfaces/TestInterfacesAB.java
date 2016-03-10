package testInterfaces;

import interfaces.TestInterfaceA;
import interfaces.TestInterfaceABImpl;

/*Testing interfaces TestInterfaceA/TestInterfaceB/TestInterfaceABImpl
 * 
 */
public class TestInterfacesAB {

	public static void main(String[] args) {

		TestInterfaceABImpl a = new TestInterfaceABImpl();
		a.sayHello();
		a.sayMessage();
		System.out.println(a.returnHello());
		System.out.println(TestInterfaceA.MESSAGE);
		
	}

}
