public class Funcionario {

    int matricula;

    String nome;

    double salariobruto;

    double total,desconto;

    public void desconto(){

        desconto = salariobruto * 0.15;
        System.out.println("Dedução INSS: "+ desconto);

    }

    public void salarioliquido(){

        total = salariobruto - desconto;
        System.out.println("Salário Líquido: "+ total);

    }

}
