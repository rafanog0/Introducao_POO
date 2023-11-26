import static org.junit.Assert.*;
import org.junit.Test;

public class ItemVendaTest {

    @Test
    public void testCalcularValorTotal() {
        ItemVenda item = new ItemVenda("Produto X", 10.0, 3);
        double valorEsperado = 30.0;
        assertEquals(valorEsperado, item.calcularValorTotal(), 0.01);
    }
}
