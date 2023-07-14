package day07.practice;


import java.util.ArrayList;
import java.util.HashSet;


public class HashSetInteger {
public static void main(String[] args) {
	ArrayList<Integer> integers = new ArrayList<Integer>();

	integers.add(1);
	integers.add(2);
	integers.add(6);
	integers.add(2);
	
	
	HashSet<Integer> integersSet = new HashSet<Integer>();
	integersSet.add(1);
	integersSet.add(2);
	integersSet.add(3);
	integersSet.add(4);

	System.out.println("Using Hashset :" +integersSet);
}
}
