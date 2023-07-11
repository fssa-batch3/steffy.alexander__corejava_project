package day04.practice;

public class PolygonTest {
	public static void main(String[] args) {
		try {
			RightAngledTriangle tri = new RightAngledTriangle(14.0, 3.0);
			Rectangle1 rec = new Rectangle1(2.5, 1.5);
			Polygon1 poly = new Polygon1();
			System.out.println(tri.calculateArea());
			System.out.println(rec.calculateArea());
			System.out.println(tri.circumference());
			System.out.println(rec.circumference());

		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}
