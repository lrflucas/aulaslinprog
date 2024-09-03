public class Funcionario {

    private int matricula;

    private String nome;

    private double salariobruto;

    private double total,desconto;

    public void desconto(){

        desconto = salariobruto * 0.15;
        System.out.println("Dedução INSS: "+ desconto);

    }

    public void salarioliquido(){

        total = salariobruto - desconto;
        System.out.println("Salário Líquido: "+ total);

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public double getSalariobruto() {
        return salariobruto;
    }

    public void setSalariobruto(double salariobruto) {
        this.salariobruto = salariobruto;
    }


}
