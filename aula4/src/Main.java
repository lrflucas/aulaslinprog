import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);


        System.out.print("Matrícula ");
        f.setMatricula(sc.nextInt());

        System.out.print("Nome completo ");
        f.setNome(sc2.nextLine());

        System.out.print("Salário bruto ");
        f.setSalariobruto(sc.nextDouble());

        System.out.println("Matrícula: "+ f.getMatricula());
        System.out.println("Nome completo: "+ f.getNome());
        System.out.println("Salário Bruto: "+ f.getSalariobruto());

        f.desconto();

        f.salarioliquido();

    }
}