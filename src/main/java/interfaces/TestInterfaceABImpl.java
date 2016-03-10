package interfaces;

public class TestInterfaceABImpl implements TestInterfaceA, TestInterfaceB {

	//implement all methods in TestInterfaceA
	public void sayMessage() {
		System.out.println(MESSAGE);
	}

	public String returnMessage() {
		return MESSAGE;
	}

	//implement all methods in TestInterfaceB
	public void sayHello() {
		System.out.println(HELLO);
		
	}

	//this is not needed, as default method is created.
	/*
	public String returnHello() {
		return HELLO;
	}
	*/

}
