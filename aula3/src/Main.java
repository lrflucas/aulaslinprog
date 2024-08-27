import java.util.Scanner;

/*

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();

        String r;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite sua idade atual:");
            int idade = sc.nextInt();
            System.out.println(p.idade);

            p.niver();

            System.out.println("idade futura: "+ p.idade);

        System.out.println("Para digitar outra idade, aperte r");
        r = sc.next();
        }while (r.equalsIgnoreCase("r"));



       // System.out.println("antiga: "+ p.idade);
       // p.niver();

       // System.out.println("atual: "+ p.idade);
    }
}
*/

public class Main {
    public static void main(String[] args) {

        Funcionario f = new Funcionario();
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);


        System.out.print("Matrícula ");
        f.matricula = sc.nextInt();

        System.out.print("Nome completo ");
        f.nome = sc2.nextLine();

        System.out.print("Salário bruto ");
        f.salariobruto = sc.nextDouble();

        System.out.println("Matrícula: "+ f.matricula);
        System.out.println("Nome completo: "+ f.nome);
        System.out.println("Salário Bruto: "+ f.salariobruto);

        f.desconto();

        f.salarioliquido();

    }
}