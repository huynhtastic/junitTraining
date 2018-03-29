import org.junit.Test;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.ArrayList;

public class SimpleTest {

    @Test
    public void testEmptyCollection() {
        Collection collection = new ArrayList();
        assertTrue(collection.isEmpty());
    }
}

