package testAbstraction;

import abstraction.AbstractClassB;
import abstraction.AbstractClassBB;
import abstraction.AbstractClassC;

public class TestAbstractClasses {

	public static void main(String[] args){
		
		//invalid constructor as abstract class.
		//AbstractClassA testa = new AbstractClassA(100, "test");
		AbstractClassB testb = new AbstractClassB(10, "test");
		testb.setIndex(100);
		testb.setName("newtestb");
		AbstractClassBB testbb = new AbstractClassBB(20, "test");
		testbb.setIndex(100);
		AbstractClassC testc = new AbstractClassC(30, "test");
		
		testb.output();
		testbb.output();
		testc.output();
		
	}
}
