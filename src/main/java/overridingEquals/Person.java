package overridingEquals;

import java.util.*;

/** Example of overriding equals.
 * See: http://www.java67.com/2013/04/example-of-overriding-equals-hashcode-compareTo-java-method.html
 * @author Alex
 *
 */


public class Person implements Comparable<Person> {

	private String name;
	private int age;
	private Date dob;
	
	public Person(String name, int age, Date dob) {
		this.name = name;
		this.age = age;
		this.dob = dob;
	}
	
	//use getClass instead of instance operator, ie a Person class cannot be equal to its subclass.
	@Override 
	public boolean equals(Object other) {
		
		if(this == other) return true;
		
		if(other == null || (this.getClass() != other.getClass())) return false;
		
		Person newP = (Person) other;
		return ((this.age == newP.age) && (this.name !=null && name.equals(newP.name))
				&& ((this.dob != null) && dob.equals(newP.dob)));		
	}
	
	//choose prime, usually 31 to generate a uniquely distributed hashcode - helps avoid collision
	//when used in hash based collections like Hashtable and Hashmap.
	@Override
	public int hashCode() {
		int result = 0;
	    result = 31*result + age;
	    result = 31*result + (name !=null ? name.hashCode() : 0);
	    result = 31*result + (dob !=null ? dob.hashCode() : 0);
	    return result;
	}
	
	@Override
	public int compareTo(Person other) {
		return this.age - other.age;
	}


}
