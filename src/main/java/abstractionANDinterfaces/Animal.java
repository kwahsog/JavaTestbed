package abstractionANDinterfaces;

/** Example class to distinguish between abstract classes and interfaces.
 * 
 *
 */

public abstract class Animal {

	protected double weight;
	protected double length;
	protected String name;
	
	public void createAnimal(String name, double weight, double length){
		this.name = name;
		this.weight = weight;
		this.length = length;
	}
	
	public abstract void move();
	
	public abstract void talk();
	
}
	