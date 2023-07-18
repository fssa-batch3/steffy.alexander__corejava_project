package day09.practice;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class IntegerNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int count = 0;
		//intially count is 0
		
		ArrayList<Integer> arr = new ArrayList<Integer>();

		while (count < num) {
			int num1 = scan.nextInt();
			arr.add(num1);
			count++;
		}

		Collections.sort(arr); 
		
		// Sorting the ArrayList in ascending order

		System.out.println(arr);
	}

}
