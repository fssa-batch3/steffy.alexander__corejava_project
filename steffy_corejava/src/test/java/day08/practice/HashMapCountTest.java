package day08.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Map;

import org.junit.Test;

public class HashMapCountTest {

	@Test
	public void testCountRepetation_CaseInsensitive() {
		String input = "Ram,ram,RAM,Ram";
		Map<String, Integer> result = HashMapCount.countRepetation(input);

		assertEquals(2, (int) result.get("Ram"));
	}



	@Test
	public void testCountRepetation_NullInput() {
		String input = null;
		try {

			Map<String, Integer> result = HashMapCount.countRepetation(input);
		} catch (IllegalArgumentException e) {
			
			assertEquals(e.getMessage(),"A string cannot be null or empty");

		}

		// This test case should throw IllegalArgumentException
	}
}
