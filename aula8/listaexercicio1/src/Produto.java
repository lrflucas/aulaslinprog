public class Produto implements Calculavel {
    private String nome;
    private double preco, total, imposto, juros, lucro, desconto, taxamanuseio, precofinal;
    private int quantidade;
    public CategoriaProduto cp;


    @Override
    public String toString() {
        return "- " + nome + " | " +
                "Categoria: " + cp + " | " +
                "Preço: R$ " + preco + " | " +
                "Quantidade: " + quantidade + " | " +
                "Total: R$ " + total + '\'' +
                "Imposto: R$ " + imposto + " | " +
                "Juros: R$ " + juros + " | " +
                "Lucro: R$ " + lucro + " | " +
                "Desconto: R$ " + desconto + " | " +
                "Taxa de Manuseio: R$ " + taxamanuseio + " | " +
                "Preço Final: R$ " + precofinal;
    }

    public Produto() {

    }

    public Produto(String nome, double preco, double total, double imposto, double juros, double lucro, double desconto, double taxamanuseio, double precofinal, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.total = total;
        this.imposto = imposto;
        this.juros = juros;
        this.lucro = lucro;
        this.desconto = desconto;
        this.taxamanuseio = taxamanuseio;
        this.precofinal = precofinal;
        this.quantidade = quantidade;
    }

    public CategoriaProduto getCp() {
        return cp;
    }

    public void setCp(CategoriaProduto cp) {
        this.cp = cp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public double getLucro() {
        return lucro;
    }

    public void setLucro(double lucro) {
        this.lucro = lucro;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getTaxamanuseio() {
        return taxamanuseio;
    }

    public void setTaxamanuseio(double taxamanuseio) {
        this.taxamanuseio = taxamanuseio;
    }

    public double getPrecofinal() {
        return precofinal;
    }

    public void setPrecofinal(double precofinal) {
        this.precofinal = precofinal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public double calcularImposto() {
        return preco * 0.10 + preco * 0.10 + preco * 0.10;
    }

    @Override
    public double calcularJuros() {
        return preco * 0.02 + preco * 0.02 + preco * 0.02;
    }

    @Override
    public double calcularLucro() {
        return preco * 0.15 + preco * 0.15 + preco * 0.15;
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.05 + preco * 0.05 + preco * 0.05;
    }

    @Override
    public double calcularTaxaManuseio() {
        return 10.00;
    }

    @Override
    public double calcularPrecoFinal() {
        return total + imposto + juros + taxamanuseio;
    }

    @Override
    public double calcularTotal() {
        return precofinal;
    }
}
