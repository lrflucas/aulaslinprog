package model;

public class Coordenador extends Pessoa implements Explicacao, ControleFinanceiro {

    @Override
    public void quemSouEu() {
        System.out.println("model.Coordenador");
    }

    @Override
    public void explicar() {
        System.out.println("Estou explicando sobre o curso");
    }

    @Override
    public void salario() {
        System.out.println("Salário de R$6700.00");
    }
}
