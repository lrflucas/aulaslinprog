package model;

public class Professor extends Pessoa implements Explicacao, ControleFinanceiro {

    private double salario;
    private double valorhora = 15;

    private int horas = 40;



    public void calcularSalario() {

        salario = horas * valorhora;

    }


    public Professor() {

    }

    public Professor(String nome, int matricula, double salario, double valorhora, int horas) {
        super(nome, matricula);
        this.salario = salario;
        this.valorhora = valorhora;
        this.horas = horas;
    }


    @Override
    public String toString() {
        return "model.Professor{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", salario=" + salario +
                ", valorhora=" + valorhora +
                ", horas=" + horas +
                '}';
    }

    @Override
    public void quemSouEu() {
        System.out.println("model.Professor");
    }

    @Override
    public void explicar() {
        System.out.println("Estou explicando a aula");
    }

    @Override
    public void salario() {
        System.out.println("Salário de R$3400.00");
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
