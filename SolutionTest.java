public class SolutionTest {
    public static void main(String[] args) {
        assertEquals(new Solution().sum(1, 1), 2);
        assertEquals(new Solution().sum(1, 2), 3);
        assertEquals(new Solution().sum(-1, 1), 0);
        assertEquals(new Solution().sum(Integer.MAX_VALUE, Integer.MIN_VALUE), -1);
    }
    
    private static void assertEquals(int actual, int expected) {
        if(expected != actual) {
            throw new IllegalStateException("Expected result is " + expected + ", but actual value is " + actual);
        } 
    }
}
