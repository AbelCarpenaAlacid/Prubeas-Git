import org.example.recetas.Gachasmiguero;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Testing {

    @Test
    public void test1() {
        assertEquals("1", Gachasmiguero.catar(1));
        assertEquals("2", Gachasmiguero.catar(2));
        assertEquals("Gacha", Gachasmiguero.catar(3));
        assertEquals("4", Gachasmiguero.catar(4));
        assertEquals("Migas", Gachasmiguero.catar(5));
        assertEquals("Gacha", Gachasmiguero.catar(6));
        assertEquals("7", Gachasmiguero.catar(7));
        assertEquals("8", Gachasmiguero.catar(8));
        assertEquals("Gacha", Gachasmiguero.catar(9));

    }
}
