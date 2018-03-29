import org.junit.Test;

import java.util.ArrayList;

public class TestThrownException {

    @Test(expected=IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsException() {
        ArrayList<Object> emptyList = new ArrayList<>();
        Object o = emptyList.get(0);
    }

    @Test
    public void testIndexOutOfBoundsExceptiionNotRaised()
        throws IndexOutOfBoundsException {

        ArrayList<Integer> emptyList = new ArrayList<>();
        Object o = emptyList.get(0);
    }
}

