import java.util.Scanner;

/*
public class Main {
    public static void main(String[] args) {

        int repetir;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Escolha um número de 1 a 3");
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Ótima escolha!");
                    break;
                case 2:
                    System.out.println("O valor da blusa é R$2,00");
                    break;
                case 3:
                    System.out.println("Falar com atendente");
                    break;
                default:
                    System.out.println("Inválido");
                    break;
            }
            System.out.println("Para repetir, digite 0");
            repetir = sc.nextInt();
        }while (repetir == 0);
    }
}

 */

//                    //

/*
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Informe um número");
        int x = sc.nextInt();
        System.out.println(x);

        System.out.println("Digite um numero");
        double y = sc.nextDouble();
        System.out.println(y);

        System.out.println("Digite uma frase");
        String z2 = sc2.nextLine();
        System.out.println(z2);

    }
}

 */

//  exercicio 1                 //

/*
public class Main {
    public static void main(String[] args) {

        String repetir;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        do {
            System.out.println("Informe seu nome completo:");
            String nome = sc2.nextLine();
            System.out.println(nome);

            System.out.println("Digite sua idade:");
            String idade = sc.next();
            System.out.println(idade);

        System.out.println("Para fazer um novo cadastro, aperte s");
        repetir = sc.next();
        }while(repetir.equalsIgnoreCase("s"));

    }

}

 */

// exercicio 2       //

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Digite sua matrícula");
        int matricula = sc.nextInt();
        System.out.println(matricula);

        System.out.println("Informe seu nome completo");
        String nome = sc2.nextLine();
        System.out.println(nome);

        System.out.println("Informe o seu salário bruto");
        double salario = sc.nextDouble();
        System.out.println(salario);

        double desconto = ;
        System.out.println(desconto);

    }
}