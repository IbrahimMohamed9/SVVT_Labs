package Lab1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
//    @BeforeAll
//    public static void setUpBeforeClass() {
//        System.out.println("Before all tests");
//    }
//
//    @BeforeEach
//    public void setUp() {
//        System.out.println("Before each test");
//    }
//
//    @AfterEach
//    public void tearDown() {
//        System.out.println("After each test");
//    }
//
//    @AfterAll
//    public static void tearDownAfterClass() {
//        System.out.println("After all tests");
//    }

    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(10, 5);
        assertEquals(15, result, "10 + 5 should equal 15");
    }

    @Test
    public void testAdditionNegative() {
        Calculator calculator = new Calculator();
        assertNotEquals(6, calculator.add(2, 3), "2 + 3 should not equal 6");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 5);
        assertEquals(5, result, "10 - 5 should equal 5");
    }

    @Test
    public void testFactoryNegative() {
        Calculator calculator = new Calculator();
        assertNotEquals(5, calculator.factory( 3), "3! should not equal 5");
    }

    @Test
    public void testFactoryPositive() {
        Calculator calculator = new Calculator();
        int result = calculator.factory(9);
        assertEquals(362880, result, "9! should equal 362880");
    }

    @Test
    public void testSplitStringToArrayPositive() {
        Calculator calculator = new Calculator();
        String str = "Ibrahim Moataz Mohamed Safwat Said Alawas";
        String[] expect = {"Ibrahim", "Moataz", "Mohamed", "Safwat", "Said", "Alawas"};
        assertArrayEquals(expect, calculator.splitStringToArray(str));
    }

    @Test
    public void testSplitStringToArrayReturnNull() {
        Calculator calculator = new Calculator();
        assertNull(calculator.splitStringToArray(null));
        assertNotNull(calculator.splitStringToArray("Ibrahim Mohamed"));
    }
    @Test
    public void testSortIntegersArrayWithNoneEmptyArray() {
        Calculator calculator = new Calculator();
        int[] arr = {1, 5, 6, 8, 0};
        int[] expect = {0, 1, 5, 6, 8};
        assertArrayEquals(expect, calculator.sortIntegersArray(arr));
    }

    @Test
    public void testSortIntegersArrayWithEmptyArray() {
        Calculator calculator = new Calculator();
        int[] test = {};
        assertNotNull(calculator.sortIntegersArray(test));
    }
}
