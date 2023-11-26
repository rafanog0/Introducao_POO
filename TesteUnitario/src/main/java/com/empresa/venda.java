import java.util.ArrayList;
import java.util.List;

public class Venda {
    private String cliente;
    private List<ItemVenda> itens;
    private double valorVenda;
    private double valorDesconto;

    public Venda(String cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.valorVenda = 0.0;
        this.valorDesconto = 0.0;
    }

    public void adicionarItem(ItemVenda item) {
        itens.add(item);
        valorVenda += item.calcularValorTotal();
    }

    public double calcularValorFinal() {
        return valorVenda - valorDesconto;
    }
}
