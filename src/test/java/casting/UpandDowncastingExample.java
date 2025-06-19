package casting;

/**
 * Casting is converting one data type into another. There are two types of casting available in Java
 * 
 * 1. Primitive casting : e.g int to double or double to int
 * 2. Reference Casting (Object Casting): Converting one object reference type into another within the class hierarchy
 * 
 *
 */
class Animal {
	
	// Generic behavior of an animal and this works for all subclasses.
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

/**
 * Upcasting is when you cast(convert) a subclass object to a superclass reference
 * It is also called as implicit casting
 * 
 * Why use Upcasting?
	--> Allows writing generic code that works for all subclasses.
    --> Common in polymorphism (e.g., passing objects to methods expecting superclass type).
    
    Downcasting (Explicit Casting): Downcasting is casting a superclass reference back to a subclass reference.
    
    Note: Must be done explicitly and is risky unless you're sure of the actual object type.
 */
public class UpandDowncastingExample{
	
	public static void main(String[] args) {
		Dog dog = new Dog(); // Dog object
		Animal animal = dog; // Upcasting: Dog -> Animal this is same as Animal animal = new Dog();
		animal.makeSound(); // Dog makes a sound
		// animal.bark(); Not accessible through Animal reference
		
		// Down casting
		Dog d = (Dog) animal; // Downcasting (safe because animal is actually a Dog)
		dog.makeSound();
		dog.bark();
			
	   // What happens if the cast is invalid?
	   Animal a = new Animal(); // Just an animal
	   Dog d1 =(Dog)a; // unsafe: Throws ClassCastException:
	   d1.bark(); // Never reached
	   
	}
	
}

