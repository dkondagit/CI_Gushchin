package logic;

import logic.SimpleCalculator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleCalculatorTest {

    SimpleCalculator calculator;

    public SimpleCalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        calculator = new SimpleCalculator();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testMultiply() {
        System.out.println("TESTING CALCULATOR #1");
        System.out.println("multipky operation");
        int x = 2;
        int y = 4;
        int expResult = x * y;
        int result = calculator.multiply(x, y);
        assertEquals(expResult, result);
        System.out.println("parameters:" + x + "," + y + "; Result:OK");
    }

    @Test
    public void testPlus() {
        System.out.println("TESTING CALCULATOR #2");
        System.out.println("plus operation");
        int x = 5;
        int y = 6;
        int expResult = x + y;
        int result = calculator.plus(x, y);
        assertEquals(expResult, result);
        System.out.println("parameters:" + x + "," + y + "; Result:OK");
    }

    @Test
    public void testMinus() {
        System.out.println("TESTING CALCULATOR #3");
        System.out.println("minus operation");
        int x = 4;
        int y = 2;
        SimpleCalculator instance = new SimpleCalculator();
        int expResult = x - y;
        int result = calculator.minus(x, y);
        assertEquals(expResult, result);
        System.out.println("parameters:" + x + "," + y + "; Result:OK");
    }

}
