package Lab1;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PersonTest2 {
    static List<Person> persons;

    @BeforeAll
    public static void setUpBeforeClass(){
        persons = new ArrayList<>();
    }

    @BeforeEach
    public void setUp(){
        persons.add(new Person(19));
        persons.add(new Person(21));
        persons.add(new Person(20));
    }

    @Test
    public void testAllAreAdults(){
        for (Person p : persons){
            assertTrue(p.isAdults());
        }
    }

    @AfterAll
    public static void tearDownAfterClass(){
        persons = null;
    }
}