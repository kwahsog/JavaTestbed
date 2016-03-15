package abstractionANDinterfaces;

/** Example class to distinguish between abstract classes and interfaces.
 * 
 *
 */

public class Dog extends Animal implements JSONConversion {

	@Override
	public void createAnimal(String name, double weight, double length){
				this.name = name;
				this.weight = weight;
				this.length = length;
	}
		
	@Override
	public void move() {
		System.out.println("The dog runs to you.");		
	}

	@Override
	public void talk() {
		System.out.println("Woof!");
	}

	@Override
	public String JSONConversion() {
		return "{\"weight\":"+ weight+",\"length\":"+length+",\"name\":\""+name+"\"}";
	}

}
