public class Funcionario {

    private int horas;

    private double valorhora;

    private double salario;

    public void calculosalario() {

        salario = horas * valorhora;
        System.out.println("O salário é R$"+ salario);

    }


    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }


    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }
}
