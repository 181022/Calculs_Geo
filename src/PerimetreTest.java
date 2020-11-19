import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerimetreTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void perimetre() {
    }
    @Test
    public void perimetreEquals(){
        System.out.println("Test addEquals");
        assertEquals(Perimetre.Perimetre(2,2, 2),8);
    }
    @Test
    public void perimetreNotEquals(){
        System.out.println("Test addNotEquals");
        assertNotEquals(Perimetre.Perimetre(1, 1, 1), 3);
    }
}