package Lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testIsAdultsPositive() {
        Person p = new Person(18);
        assertTrue(p.isAdults());
    }

    @Test
    void testIsAdultsNegative() {
        Person p = new Person(17);
        assertFalse(p.isAdults());
    }
}
