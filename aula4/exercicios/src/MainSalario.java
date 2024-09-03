import java.util.Scanner;

public class MainSalario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.print("Valor da hora trabalhada: R$");
        f.setValorhora(sc.nextDouble());


        System.out.print("Quantidade de horas trabalhadas: ");
        f.setHoras(sc.nextInt());

        f.calculosalario();

        System.out.println("O valor da hora é R$"+ f.getValorhora() + ", trabalhando "
                + f.getHoras() + " horas");

    }
}