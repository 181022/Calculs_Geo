import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SurfaceTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void surface() {
    }
    @Test
    public void surfaceEquals(){
        System.out.println("Test addEquals");
        assertEquals(Surface.Surface(2,2),4);
    }
    @Test
    public void surfaceNotEquals(){
        System.out.println("Test addNotEquals");
        assertNotEquals(Surface.Surface(1, 1), 3);
    }
}