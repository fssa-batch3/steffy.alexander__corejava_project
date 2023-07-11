package day04.practice;

public class RightAngledTriangle extends Polygon1 {

	protected double height;
	protected double base;
	protected double hypotenuse;

	public RightAngledTriangle(double height, double base) throws Exception {
		super(4);
		if (height <= 0 || base <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.height = height;
		this.base = base;
		this.hypotenuse = Math.sqrt(Math.pow(height, 2) + Math.pow(base, 2));/// a2+b2

	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.height * this.base;
	}

	public double circumference() {

		return this.height + this.base + this.hypotenuse;
	}

	public int getNumberOfSides() {
		return super.numberOfSides;
	}

}
