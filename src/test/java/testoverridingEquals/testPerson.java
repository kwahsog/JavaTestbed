package testoverridingEquals;
import java.util.Date;
import org.junit.Test;

import overridingEquals.Person;

import static org.junit.Assert.*;

/**
 * JUnit tests for the Person class, testing equality, compareTo and hashCode().
 * See: http://www.java67.com/2013/04/example-of-overriding-equals-hashcode-compareTo-java-method.html
 */
public class testPerson {   
  
   @Test
   public void testEquals(){
       Person a = new Person("A", 27, new Date(1980,12, 1));
       Person sameA = new Person("A", 27, new Date(1980,12, 1));
       Person similar = new Person("C", 26, new Date(1981,12,1));
      
       assertTrue(a.equals(sameA));
       assertTrue(a.hashCode() == sameA.hashCode());    
       assertFalse(a.equals(null));
       assertFalse(a.equals(similar));
       assertTrue(a.hashCode() != similar.hashCode());
       assertTrue(a.compareTo(sameA) == 0);
       assertTrue(a.compareTo(similar) >= -1);
   } 
  
}