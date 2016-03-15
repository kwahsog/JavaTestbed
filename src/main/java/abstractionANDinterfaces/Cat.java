package abstractionANDinterfaces;

/** Example class to distinguish between abstract classes and interfaces.
 * 
 *
 */

public class Cat extends Animal implements JSONConversion {

	@Override
	public void createAnimal(String name, double weight, double length){
			this.name = name;
			this.weight = weight;
			this.length = length;
	}
				
	@Override
	public void move() {
		System.out.println("The cat runs away.");
	}

	@Override
	public void talk() {
		System.out.println("Meow.");
	}

	@Override
	public String JSONConversion() {
		return "{\"weight\":"+ weight+",\"length\":"+length+",\"name\":\""+name+"\"}";

	}

}

	