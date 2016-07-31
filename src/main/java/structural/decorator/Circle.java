package structural.decorator;

public class Circle implements Shape {
	
	/**
	 * Step 2 Create concrete classes implementing the same interface.
	 * */
	public Circle() {
	}
	
	@Override
	public void draw() {
		System.out.println("Shape: Circle, hinh tron");
	}
	
}
