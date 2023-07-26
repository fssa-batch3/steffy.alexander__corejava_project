package day07;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import day07.practice.HashSetInteger;

public class HashSetIntegerTest {

    private HashSetInteger hashSetInteger;



    @Test
    public void testGetIntegers() { 
    	HashSetInteger hashSetInteger = new HashSetInteger();//
        assertEquals(6, hashSetInteger.getIntegers().size());
        assertTrue(hashSetInteger.getIntegers().contains(1));
        assertTrue(hashSetInteger.getIntegers().contains(2));
        assertTrue(hashSetInteger.getIntegers().contains(4));
        assertFalse(hashSetInteger.getIntegers().contains(6)); // 6 should not be present in the ArrayList
    }

    @Test
    public void testGetIntegersSet() {
    	hashSetInteger = new HashSetInteger();
        assertEquals(4, hashSetInteger.getIntegersSet().size());
        assertTrue(hashSetInteger.getIntegersSet().contains(1));
        assertTrue(hashSetInteger.getIntegersSet().contains(2));
        assertTrue(hashSetInteger.getIntegersSet().contains(3));
        assertTrue(hashSetInteger.getIntegersSet().contains(4));
    }


}

