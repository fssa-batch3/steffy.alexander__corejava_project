package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Employee {

	public static void main(String[] args) {

		String n = "HR,Ram\n" + "HR,Suresh\n" + "IT,Basker\n" + "IT,Joseph\n" + "Admin,Sundar";

		HashMap<String, List<String>> listofemployee = new HashMap<String, List<String>>();

		String[] lines = n.split("\n");

		for (String line : lines) {
			String[] parts = line.split(",");

			if (parts.length == 2) {
				String dep = parts[0].trim();
				String empname = parts[1].trim();

				List<String> empDet = listofemployee.get(dep);

				if (empDet == null) {
					empDet = new ArrayList<String>();
					listofemployee.put(dep, empDet);
				}

				empDet.add(empname);
			}
		}

		// keyset :key,value
		for (String dep : listofemployee.keySet()) {
			List<String> employees = listofemployee.get(dep);
			System.out.println(dep + ": " + employees);
		}
	}
}