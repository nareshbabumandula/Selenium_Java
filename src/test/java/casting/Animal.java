package casting;

/**
 * Casting is converting one data type into another. There are two types of casting available in Java
 * 
 * 1. Primitive casting : e.g int to double or double to int
 * 
 * 2. Reference Casting (Object Casting): Converting one object reference type into another within the class hierarchy
 * 
 *
 */
public class Animal {
	
	public void makeSound() {
		System.out.println("Animal makes sound");
	}

}


class Dog extends Animal {
	
	public void bark() {
		System.out.println("Dog barks");
	}
	
	@Override
	public void makeSound() {
		System.out.println("Dog makes a sound");
	}
	
}
