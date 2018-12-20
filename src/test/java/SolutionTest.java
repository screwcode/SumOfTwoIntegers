import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void sumTest() {
        assertEquals(new Solution().sum(1, 1), 2);
        assertEquals(new Solution().sum(1, 2), 3);
        assertEquals(new Solution().sum(-1, 1), 0);
        assertEquals(new Solution().sum(Integer.MAX_VALUE, Integer.MIN_VALUE), -1);
    }
}
