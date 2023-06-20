import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void peopleAwareOfSecretTest1() {
        int n = 6;
        int delay = 2;
        int forget = 4;
        int output = 5;
        Assert.assertEquals(output, new Solution().peopleAwareOfSecret(n, delay, forget));
    }

    @Test
    public void peopleAwareOfSecretTest2() {
        int n = 4;
        int delay = 1;
        int forget = 3;
        int output = 6;
        Assert.assertEquals(output, new Solution().peopleAwareOfSecret(n, delay, forget));
    }
}
