package interfaces;

public interface TestInterfaceA {
	
	//interfaces can only contain method signatures and fields.
	//By default all variables in interface are public static final.
	//Variables used for constants, not general use. Implementations should declare fields.
	//Interfaces are meant to be APIs-fields shouldn't be part of this. Should query database etc.
	public String MESSAGE = "Test message here";	
	public void sayMessage();	
	public String returnMessage();
			
}
