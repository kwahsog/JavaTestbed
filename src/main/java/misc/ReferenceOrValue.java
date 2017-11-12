package misc;

import java.util.*;

/**
 * Illustrating that Java is always PASS BY VALUE. Objects will change, primitives won't.
 * See: https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
 * "Java is always pass-by-value. Unfortunately, they decided to call the location of an object a "reference". When we pass the value of an object, we are passing the reference to it."
 */
public class ReferenceOrValue {

	public static void main (String args[]) {
		
		int int1 = 10;
		String string1 = "Starting string";
		ArrayList<Double> arrayDoubles = new ArrayList<Double>();
		arrayDoubles.add(2.0);
		arrayDoubles.add(2.0);
		//starting values
		System.out.println("Testing: "+Integer.toString(int1)+" "+string1+" " + arrayDoubles.toString());
		changeInt(int1);
		changeString(string1);
		changeArrayValues(arrayDoubles);
		//tests to see if primitives VS objects change.
		//primitives don't change, array does.
		System.out.println("Testing: "+Integer.toString(int1)+" "+string1+" " + arrayDoubles.toString());
		changeArrayClear(arrayDoubles);
		System.out.println("Testing: "+Integer.toString(int1)+" "+string1+" " + arrayDoubles.toString());
		//testing custom object, object will change.
		Dog freddy = new Dog(1,"freddy");
		System.out.println(freddy.toString());
		changeDog(freddy);
		System.out.println(freddy.toString());		
	}

	public static void changeInt(int test) {
		test = 2;
	}
	
	public static void changeString(String test) {
		test = "Changed string";
	}
	
	public static void changeArrayClear(ArrayList<Double> test) {
		test.clear();
	}
	
	public static void changeArrayValues(ArrayList<Double> test) {
		test.set(0,1.0);
	}
	
	public static void changeDog(Dog dog) { 
		dog.setAge(2);
		dog.setName("olderFreddy");
	}
}
