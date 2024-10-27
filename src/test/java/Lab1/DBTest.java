package Lab1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DBTest {
    static DB database;
    @BeforeAll
    public static void setUpBeforeClass() {
        database = new DB();
        database.connect();
    }

    @BeforeEach
    public void setUp() {
        database.insert("Element 1");
        database.insert("Element 2");
    }

    @Order(1)
    @Test
    public void testGetMethod() {
        assertEquals(database.get(1), "Element 2");
    }
    @Order(2)
    @Test
    public void testInsert() {
        database.insert("Element 3");
        assertEquals(3, database.count());
        assertEquals(database.get(2), "Element 3");
    }


    @AfterEach
    public void tearDown() {
        database.clear();
    }

    @AfterAll
    public static void tearDownAfterClass() {
        database.disconnect();
    }
}