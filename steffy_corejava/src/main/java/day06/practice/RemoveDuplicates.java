package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");

		// creating a new arraylist as newList
		List<String> newList = new ArrayList<String>();

		// returning a foreach method & assining the cityList to city
		for (String city : cityList) {
			if (!newList.contains(city)) {
				// if city not contains any duplicates
				newList.add(city);
				// add to newlist

			}
		}
		System.out.println(newList);
	}

}
