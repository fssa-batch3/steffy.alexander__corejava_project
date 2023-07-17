package day06;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesValidatorTest {

	@Test
	public void testValidRemoveDuplicates() {
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		removeDuplicates.setCityList(new ArrayList<>());

		boolean isValid = RemoveDuplicatesValidator.validateRemoveDuplicates(removeDuplicates);
		Assert.assertTrue(isValid);
	}

	@Test
	public void testNullCityList() {
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		removeDuplicates.setCityList(null);

		boolean isValid = RemoveDuplicatesValidator.validateRemoveDuplicates(removeDuplicates);
		Assert.assertFalse(isValid);
	}
}
