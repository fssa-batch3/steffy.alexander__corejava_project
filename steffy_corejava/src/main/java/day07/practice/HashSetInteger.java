package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetInteger {
    private ArrayList<Integer> integers;// value assigned after calling the constructor
    private HashSet<Integer> integersSet;

    public HashSetInteger() {
        integers = new ArrayList<Integer>();
        
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(3); 
        integers.add(2);
        integers.add(4);

        integersSet = new HashSet<Integer>();
        integersSet.add(1);
        integersSet.add(2);
        integersSet.add(3);
        integersSet.add(4); 
        integersSet.add(4); 
        integersSet.add(4); 
    }

    public ArrayList<Integer> getIntegers() {
        return integers;
    }

    public HashSet<Integer> getIntegersSet() {
        return integersSet;
    }


    public static void main(String[] args) {
		
    	HashSetInteger hashSetInt= new HashSetInteger();// calling constructor
    	 
    	System.out.println(hashSetInt.getIntegers());
    	System.out.println(hashSetInt.getIntegersSet());
   
	}
}
