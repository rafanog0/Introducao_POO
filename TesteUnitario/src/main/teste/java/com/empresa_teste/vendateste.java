import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class VendaTest {

    private Venda venda;

    @Before
    public void setUp() {
        venda = new Venda("Cliente Y");
    }

    @Test
    public void testAdicionarItem() {
        ItemVenda item = new ItemVenda("Produto Y", 20.0, 2);
        venda.adicionarItem(item);
        assertEquals(40.0, venda.getValorVenda(), 0.01);
    }

    @Test
    public void testCalcularValorFinalSemDesconto() {
        venda.adicionarItem(new ItemVenda("Produto Z", 50.0, 1));
        double valorFinalEsperado = 50.0;
        assertEquals(valorFinalEsperado, venda.calcularValorFinal(), 0.01);
    }

    @Test
    public void testCalcularValorFinalComDesconto() {
        venda.adicionarItem(new ItemVenda("Produto A", 100.0, 2));
        venda.setValorDesconto(20.0);
        double valorFinalEsperado = 180.0;
        assertEquals(valorFinalEsperado, venda.calcularValorFinal(), 0.01);
    }
}
