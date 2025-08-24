// Multilevel Inheritance
package dayfive.multilevelinheritance.vehicle;

public class Chevrolet  extends Car {
	public Chevrolet() {
		System.out.println("Class Chevrolet");
	}

	public void brand() {
		System.out.println("Brand: Chevrolet");
	}
	public void speed() {
		System.out.println("Max: 400Kmph");
	}
}