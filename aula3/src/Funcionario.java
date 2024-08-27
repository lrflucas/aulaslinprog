public class Funcionario {

    int matricula;

    String nome;

    double salariobruto;

    double total,desconto;

    public void desconto(){

        desconto = (salariobruto - (15.0 / 100.0));
        System.out.println("Dedução INSS: "+ total);

    }

    public void salarioliquido(){

        total = salariobruto - desconto;
        System.out.println("Salário Líquido: "+ total);

    }

}
