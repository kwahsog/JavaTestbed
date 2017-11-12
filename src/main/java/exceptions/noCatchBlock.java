package exceptions;

public class noCatchBlock {

	public static Integer divide(int a, int b){ 
		try {
			return a/b;
		}
		/*
		catch (Exception ex){
			System.out.println("catch call in divide method");		
			System.out.println(ex.getMessage());		
			return 0;
		}*/
		finally {
			System.out.println("finally call in divide method");
		}
	}

	//if the catch block is missing, the exception will bubble and be caught in the main method.
	//finally always executes, unless crash or system.exit()
	public static void main (String args[]) {
		try {
			System.out.println(divide(4,0));
		}
		catch (Exception ex) {
			System.out.println("catch call in main method");		
			System.out.println(ex.getMessage());		
		}
	}
}
