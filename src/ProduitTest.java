import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProduitTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void produit() {
    }
    @Test
    public void produitEquals(){
        System.out.println("Test addEquals");
        assertEquals(Produit.produit(5,3),15);
    }
    @Test
    public void produitNotEquals(){
        System.out.println("Test addNotEquals");
        assertNotEquals(Produit.produit(1, 1), 3);
    }
}