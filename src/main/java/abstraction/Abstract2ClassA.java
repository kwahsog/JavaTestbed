package abstraction;

public abstract class Abstract2ClassA {
	
	//abstract classes act a base class to be extended by subclasses to create a full implementation.
	//ie signal clearly to users which methods to implement.
	//e.g. here must implement action();

	public void process(){
		stepBefore();
		action();
		stepAfter();		
	}
	
    public void stepBefore() {
        //implementation directly in abstract superclass
    	System.out.println("Start:");
    }

    public abstract void action(); // implemented by subclasses

    public void stepAfter() {
    	//implementation directly in abstract superclass
    	System.out.println("End.");
    }
    
}
