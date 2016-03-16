package testAbstractionANDinterfaces;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import abstractionANDinterfaces.Cat;
import abstractionANDinterfaces.Dog;

/** Testing dog/cat classes, interfaces and GSON.
 *
 *
 */
public class testingAnimalExamples {

	public static void main (String[] args){
		
		Cat cleo = new Cat();
		cleo.createAnimal("Cleo", 10.0, 10.0);
		Dog freddy = new Dog();
		freddy.createAnimal("Freddy", 15, 20);
		
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		
		System.out.println("Test output (Cat) is equal to GSON output:"+" "+gson.toJson(cleo).equals(cleo.JSONConversion()));
		System.out.println("Test output (Dog) is equal to GSON output:"+" "+gson.toJson(freddy).equals(freddy.JSONConversion()));
		System.out.println("Outputs:"+" "+gson.toJson(freddy)+","+gson.toJson(cleo));
	}
	
}
