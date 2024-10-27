package Lab1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonTest {
    static Person p;

    @BeforeAll
    public static void setUpBeforeClass(){
        p = new Person(6);
    }
    @Order(1)
    @Test
    public void testCanGoToSchool(){
        assertTrue(p.canGoToSchool());
    }

    @Order(2)
    @Test
    public void testIsAdultsPositive() {
        Person p = new Person(19);
        assertTrue(p.isAdults());
    }

    @Order(3)
    @Test
    public void testIsAdultsNegative() {
        assertFalse(p.isAdults());
    }

    @Order(4)
    @Test
    public void testLessThan0Age() {


       Exception e = assertThrows(IllegalArgumentException.class , ()->{
           new Person(-2);
       });

       assertEquals("A person’s age cannot be less than 0", e.getMessage());
    }
}
