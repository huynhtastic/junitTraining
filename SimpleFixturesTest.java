import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.util.Collection;
import java.util.ArrayList;

public class SimpleFixturesTest {

    private Collection<Object> collection;

    @Before
    public void setUp() {
        collection = new ArrayList<Object>();
    }

    @Test
    public void testEmptyCollection() {
        assertTrue(collection.isEmpty());
    }

    @Test
    public void testOneItemCollection() {
        collection.add("itemA");
        assertEquals(1, collection.size());
    }
}

