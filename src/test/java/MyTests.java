import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    private LinkedList<String> linkedList;

    @BeforeEach
    public void setUp() {
        linkedList = new LinkedList<>();
    }

    @Test
    public void testAppend() {
        linkedList.append("Apple");
        linkedList.append("Banana");

        assertEquals(2, linkedList.size());
        assertEquals("Apple", linkedList.get(0));
        assertEquals("Banana", linkedList.get(1));
    }

    @Test
    public void testInsert() {
        linkedList.append("Apple");
        linkedList.append("Banana");

        linkedList.insert(1, "Mango");

        assertEquals(3, linkedList.size());
        assertEquals("Apple", linkedList.get(0));
        assertEquals("Mango", linkedList.get(1));
        assertEquals("Banana", linkedList.get(2));
    }

    @Test
    public void testRemove() {
        linkedList.append("Apple");
        linkedList.append("Banana");

        linkedList.remove("Apple");

        assertEquals(1, linkedList.size());
        assertEquals("Banana", linkedList.get(0));
    }

    @Test
    public void testGet() {
        linkedList.append("Apple");
        linkedList.append("Banana");

        assertEquals("Apple", linkedList.get(0));
        assertEquals("Banana", linkedList.get(1));
    }

    @Test
    public void testSize() {
        assertEquals(0, linkedList.size());

        linkedList.append("Apple");
        linkedList.append("Banana");

        assertEquals(2, linkedList.size());

        linkedList.remove("Banana");

        assertEquals(1, linkedList.size());
    }

    @Test
    public void testEmptyList() {
        assertTrue(linkedList.isEmpty());
        assertEquals(0, linkedList.size());
        assertThrows(IndexOutOfBoundsException.class, () -> linkedList.get(0));
    }
}