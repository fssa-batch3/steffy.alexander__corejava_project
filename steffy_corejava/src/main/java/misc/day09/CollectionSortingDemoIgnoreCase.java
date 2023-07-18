package misc.day09;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSortingDemoIgnoreCase {
	public static void main(String[] args) {
		ArrayList<String> cityNames = new ArrayList<String>();
		cityNames.add("Delhi");
		cityNames.add("Chennai");
		cityNames.add("bangalore");

		System.out.println("Before Sort:" + cityNames);
		Collections.sort(cityNames);
		
		Collections.sort(cityNames, String::compareToIgnoreCase);
		System.out.println("Converting to string: "+(String.join(",",cityNames)));
		System.out.println("After Sort:" + cityNames);
	}
}