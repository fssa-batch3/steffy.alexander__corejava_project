package day09;
import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import day09.practice.TaskSorting2;

public class TaskSorting2Test {

    @Test
    public void testCompareTo() {
        LocalDate d1 = LocalDate.of(2022, 1, 8);
        LocalDate d2 = LocalDate.of(2022, 1, 8);
        LocalDate d3 = LocalDate.of(2022, 1, 8);

        TaskSorting2 task1 = new TaskSorting2(10, "steffy", d1);
        TaskSorting2 task2 = new TaskSorting2(10, "sri", d2);
        TaskSorting2 task3 = new TaskSorting2(2, "sai", d3);

        assertEquals(0, task1.compareTo(task2)); // Same deadline and priority
        assertEquals(-1, task1.compareTo(task3)); // Same deadline, higher priority
        assertEquals(1, task3.compareTo(task2)); // Same deadline, lower priority
        assertEquals(-1, task1.compareTo(task2)); // Different deadline, same priority
        assertEquals(1, task2.compareTo(task3)); // Different deadline, same priority
        assertEquals(1, task1.compareTo(task3)); // Different deadline and priority
    }
 
    @Test
    public void testSorting() {
        LocalDate d1 = LocalDate.of(2022, 1, 8);
        LocalDate d2 = LocalDate.of(2022, 1, 8);
        LocalDate d3 = LocalDate.of(2022, 1, 8);

        TaskSorting2 task1 = new TaskSorting2(10, "steffy", d1);
        TaskSorting2 task2 = new TaskSorting2(10, "sri", d2);
        TaskSorting2 task3 = new TaskSorting2(2, "sai", d3);

        List<TaskSorting2> tasklist = new ArrayList<TaskSorting2>();
        tasklist.add(task1);
        tasklist.add(task2);
        tasklist.add(task3);

        Collections.sort(tasklist);

        assertEquals(task3, tasklist.get(0));
        assertEquals(task1, tasklist.get(1));
        assertEquals(task2, tasklist.get(2));
    }
}
