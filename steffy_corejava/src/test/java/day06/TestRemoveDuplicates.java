package day06;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.List;
import java.util.ArrayList;
import org.junit.Test;


public class TestRemoveDuplicates {
    
@Test

    public void testUniqueElements() {
        List<String> cityList = new ArrayList<>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        List<String> cityList2 = new ArrayList<>();
        for (String element : cityList) {
            if (!cityList2.contains(element)) {
                cityList2.add(element);
            }
        }
        assertEquals(cityList, cityList2);
    }
    
@Test

    public void testDuplicateElements() {
        List<String> cityList = new ArrayList<>();
        cityList.add("Chennai");
        cityList.add("Bangalore");
        cityList.add("Mumbai");
        cityList.add("Mumbai");
        List<String> cityList2 = new ArrayList<>();
        for (String element : cityList) {
            if (!cityList2.contains(element)) {
                cityList2.add(element);
            }
        }
        assertTrue(cityList2.size() == 3);
        assertTrue(cityList2.contains("Chennai"));
        assertTrue(cityList2.contains("Bangalore"));
        assertTrue(cityList2.contains("Mumbai"));
    }
}