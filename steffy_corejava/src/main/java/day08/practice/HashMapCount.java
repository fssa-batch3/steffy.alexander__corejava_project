package day08.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * Sample Input

Enter the string: Ram, Ram, Superman, spider, hey, hello, hey, Spider
 */

public class HashMapCount {
	public static void main(String[] args) {
		String s = "Ram,Ram,Superman,Spider,hey,hello,Spider";

		Map<String, Integer> countMap = countRepetation(s);

		for (String element : countMap.keySet()) {

			Integer count = countMap.get(element);
			System.out.println(element + ": " + count);

		}

	}

	public static Map<String, Integer> countRepetation(String s) throws IllegalArgumentException {

		HashMap<String, Integer> countMap = new HashMap<String, Integer>();
		if (s == null || "".equals(s.trim())) {
			throw new IllegalArgumentException("A string cannot be null or empty");
			
		} 

		String arr[] = s.split(",");

		for (int i = 0; i < arr.length; i++) {

			if (countMap.get(arr[i]) == null) {
				countMap.put(arr[i], 1);
			} else {
				int count = countMap.get(arr[i]);
				count++;
				countMap.put(arr[i], count);

			}

		}
		return countMap;

	}
}