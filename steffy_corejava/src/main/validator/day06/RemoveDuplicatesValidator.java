package day06;

public class RemoveDuplicatesValidator {

	public static boolean validateRemoveDuplicates(RemoveDuplicates removeDuplicates) {
		if (removeDuplicates.getCityList() == null) {
			System.out.println("City list is required.");
			return false;
		}

		return true;
	}
}
