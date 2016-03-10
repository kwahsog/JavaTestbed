package interfaces;

public interface TestInterfaceB {

	public String HELLO = "Hello";	
	public void sayHello();	
	//example of interface default methods
	default String returnHello() {
		return HELLO;
	}
			
}
