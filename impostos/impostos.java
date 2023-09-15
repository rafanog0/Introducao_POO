import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Item produto = new Item("Produto A", 100.0);
        Item servico = new Item("Serviço B", 200.0);

        ImpostoTaxa[] impostosTaxas = {new ISS(), new ICMS(), new IPI()};

        for (ImpostoTaxa impostoTaxa : impostosTaxas) {
            double impostoTaxaValorProduto = impostoTaxa.calcularImpostoTaxa(produto);
            double impostoTaxaValorServico = impostoTaxa.calcularImpostoTaxa(servico);

            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println("Imposto/Taxa: " + impostoTaxa.getNome());
            System.out.println("Item: " + produto.getNome() + ", Valor do Imposto/Taxa: R$ " + df.format(impostoTaxaValorProduto));
            System.out.println("Item: " + servico.getNome() + ", Valor do Imposto/Taxa: R$ " + df.format(impostoTaxaValorServico));
        }
    }
}

class Item {
    private String nome;
    private double valor;

    public Item(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }
}

interface ImpostoTaxa {
    double calcularImpostoTaxa(Item item);
    String getNome();
}

class ISS implements ImpostoTaxa {
    private final double aliquota = 0.046;

    @Override
    public double calcularImpostoTaxa(Item item) {
        return item.getNome().toLowerCase().contains("serviço") ? item.getValor() * aliquota : 0;
    }

    @Override
    public String getNome() {
        return "ISS";
    }
}

class ICMS implements ImpostoTaxa {
    private final double aliquota = 0.17;

    @Override
    public double calcularImpostoTaxa(Item item) {
        return item.getValor() * aliquota;
    }

    @Override
    public String getNome() {
        return "ICMS";
    }
}

class IPI implements ImpostoTaxa {
    private final double aliquota = 0.25;

    @Override
    public double calcularImpostoTaxa(Item item) {
        return item.getNome().toLowerCase().contains("produto") ? item.getValor() * aliquota : 0;
    }

    @Override
    public String getNome() {
        return "IPI";
    }
}

