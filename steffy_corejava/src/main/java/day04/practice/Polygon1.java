package day04.practice;

public abstract class Polygon1 {
protected int numberOfSides;
	
	public Polygon1 (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	
	
	public abstract double calculateArea();
	
	
	public abstract double circumference();
}


