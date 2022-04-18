 import static org.junit.Assert.*;
import org.junit.Test;

public class MinicalcTest {
    private static final double DELTA = 1e-11;
    Minicalc calculator = new Minicalc();
    @Test
    public void test_root_TruePositive() {
        double actual=calculator.root(121.0);
        double exp=11.0;
        assertEquals(actual,exp, DELTA);
    }
    @Test
    public void test_fact_TruePositive() {
        double actual=calculator.factorial(7);
        double exp=5040;
        assertEquals(actual,exp, DELTA);
    }
    @Test
    public void test_ln_TruePositive() {
        double actual=calculator.log(1096.63315843);
        double exp=7;
        assertEquals(actual,exp, DELTA);
    }
    @Test
    public void test_power_TruePositive() {
        double actual=calculator.power(3.0,5.0);
        double exp=243.0;
        assertEquals(actual,exp, DELTA);
    }

    @Test
    public void test_root_FalsePositive() {
        double actual=calculator.root(645.0);
        double exp=6.0;
        assertNotEquals(actual,exp, DELTA);
    }
    @Test
    public void test_fact_FalsePositive() {
        double actual=calculator.factorial(3);
        double exp=3241;
        assertNotEquals(actual,exp, DELTA);
    }
    @Test
    public void test_ln_FalsePositive() {
        double actual=calculator.log(52342);
        double exp=6.0;
        assertNotEquals(actual,exp, DELTA);
    }
    @Test
    public void test_power_FalsePositive() {
        double actual=calculator.power(5.0,3.0);
        double exp=2.0;
        assertNotEquals(actual,exp, DELTA);
    }
}