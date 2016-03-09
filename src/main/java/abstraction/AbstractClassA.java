package abstraction;

/** Example abstract class. C>B>A. BB>A
 * 
 *
 */
public abstract class AbstractClassA {

	protected int index;
	protected String Name;
	
	public AbstractClassA(int index, String Name){
		this.index = index;
		this.Name = Name;
	}
	
	//set index using abstract
	public abstract void setIndex(int index);
	
	//set Name using non-abstract
	public void setName(String Name){
		this.Name = Name;
	}
	
	//abstract method so subclasses must implement
	public abstract void output();
	
}
