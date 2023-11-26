public class ItemVenda {
    private String descricao;
    private double valorUnitario;
    private double quantidade;

    public ItemVenda(String descricao, double valorUnitario, double quantidade) {
        this.descricao = descricao;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal() {
        return valorUnitario * quantidade;
    }

}
