import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
    }
    @Test
    public void addEquals(){
        System.out.println("Test addEquals");
        assertEquals(Addition.add(5,3),8);
    }
    @Test
    public void addNotEquals(){
        System.out.println("Test addNotEquals");
        assertNotEquals(Addition.add(1, 1), 3);
    }
}