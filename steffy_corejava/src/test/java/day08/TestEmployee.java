import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class TestEmployee {

    @Test
    public void testHashMapEmployees() {
        String[] input = {
            "Hr,John",
            "Engineering,Alice",
            "Hr,Smith",
            "Finance,Bob",
            "Engineering,Eve"
        };

        Map<String, List<String>> expectedDepartmentEmployees = new TreeMap<>();
        expectedDepartmentEmployees.put("Engineering", Arrays.asList("Alice", "Eve"));
        expectedDepartmentEmployees.put("Finance", Arrays.asList("Bob"));
        expectedDepartmentEmployees.put("Hr", Arrays.asList("John", "Smith"));

        Map<String, List<String>> departmentEmployees = new TreeMap<>();
        for (String str : input) {
            String[] arrstr = str.split(",");
            if (departmentEmployees.get(arrstr[0]) == null) {
                departmentEmployees.put(arrstr[0], new ArrayList<>());
                departmentEmployees.get(arrstr[0]).add(arrstr[1]);
            } else {
                departmentEmployees.get(arrstr[0]).add(arrstr[1]);
            }
        }

        for (Map.Entry<String, List<String>> ex : departmentEmployees.entrySet()) {
            List<String> empNames = ex.getValue();
            Collections.sort(empNames);
        }

        assertEquals(expectedDepartmentEmployees, departmentEmployees);
    }
}
