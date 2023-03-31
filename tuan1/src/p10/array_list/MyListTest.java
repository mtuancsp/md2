package p10.array_list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class MyListTest {
    private MyList<String> list;

    @Before
    public void setUp() {
        list = new MyList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
    }

    @Test
    public void testSize() {
        assertEquals(3, list.size());
    }

    @Test
    public void testContains() {
        assertTrue(list.contains("apple"));
        assertFalse(list.contains("pear"));
    }

    @Test
    public void testGet() {
        assertEquals("banana", list.get(1));
    }

    @Test
    public void testClone() {
        MyList<String> clone = list.clone();
        assertEquals(3, clone.size());
        assertEquals("orange", clone.get(2));
    }

    @Test
    public void testIndexOf() {
        assertEquals(1, list.indexOf("banana"));
        assertEquals(-1, list.indexOf("pear"));
    }

    @Test
    public void testRemove() {
        String removed = list.remove(1);
        assertEquals("banana", removed);
        assertEquals(2, list.size());
        assertEquals("orange", list.get(1));
    }

    @Test
    public void testClear() {
        list.clear();
        assertEquals(0, list.size());
    }

}


