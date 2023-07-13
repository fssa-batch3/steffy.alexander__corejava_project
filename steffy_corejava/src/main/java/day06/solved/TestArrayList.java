package day06.solved;

import java.util.ArrayList;


//Pre requisite: Using Array of Strings:

//How its stored in an normal array
//String[] cityArr = new String[3];
//cityArr[0] ="Chennai";
//cityArr[1] = "Bangalore";
//cityArr[2] = "Mumbai";

public class TestArrayList {

	// without using generics

	public static void main(String[] args) {

		// Store the city names in the List
		ArrayList cityList = new ArrayList();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");

		// Display the city names

		for (Object object : cityList) {
			String cityName = (String) object; // TypeCast object to String
			System.out.println(cityName);
		}

	}

}
