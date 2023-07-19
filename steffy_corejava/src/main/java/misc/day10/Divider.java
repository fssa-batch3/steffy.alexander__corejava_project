package misc.day10;

class Division{
	public static int divide(int a, int b)throws IllegalArgumentException{
	
		if(b==0) {
			throw new  IllegalArgumentException("incorrect");
		}
		int c=a/b;
		System.out.println(c);
		return c;
	}
	
	}
	
public class Divider {
public static void main(String[] args) {
	Division.divide(2,2);

}
}
