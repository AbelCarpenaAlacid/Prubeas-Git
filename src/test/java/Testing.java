import org.example.recetas.Gachamiguer;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testing {

    @Test
    public void test1() {
        assertEquals("1", Gachamiguer.hayGachasmigas(1));
        assertEquals("2", Gachamiguer.hayGachasmigas(2));
        assertEquals("Gacha", Gachamiguer.hayGachasmigas(3));
        assertEquals("4", Gachamiguer.hayGachasmigas(4));
        assertEquals("Migas", Gachamiguer.hayGachasmigas(5));
        assertEquals("Gacha", Gachamiguer.hayGachasmigas(6));
        assertEquals("7", Gachamiguer.hayGachasmigas(7));
        assertEquals("8", Gachamiguer.hayGachasmigas(8));
        assertEquals("Gacha", Gachamiguer.hayGachasmigas(9));

    }
}
