public class NotaFiscal {
    private Cliente cliente;
    private Produto produto1, produto2, produto3;
    private double valortotal;


    public void adicionaCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionaProduto1(Produto produto) {
        this.produto1 = produto;
    }

    public void adicionaProduto2(Produto produto) {
        this.produto2 = produto;
    }

    public void adicionaProduto3(Produto produto) {
        this.produto3 = produto;
    }

    public void emitirNota() {

    }


    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }
}
