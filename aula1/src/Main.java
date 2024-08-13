// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        /*
        int num1 = 40;
        int num2 = 20;
        int total;

        total = num1/num2;


        System.out.println(total);
         */

        /*
        if ((num1 > num2) || (num2 == 5)){
            System.out.println("é maior");
        }
        else if (num1 == num2) {
            System.out.println("é igual");
        }
        else {
            System.out.println("é menor");
        }
         */

        //                           //


        /*
        int x = 10;
        int y = 5;
        boolean resp = (x > y) && (y == 0);

        System.out.println(resp);
         */



        //         exercícios            //

        /*
        double valor = 15.00;
        int horas = 40;
        double salario = valor * horas;

        System.out.println(salario);

         */

        //                           //

        /*
        int var1 = 20;
        int var2 = 20;

        if (var1 > var2) {
            System.out.println("A variável 1 é maior que a outra");
        }
        else if (var1 == var2) {
            System.out.println("As variáveis são iguais");
        }
        else {
            System.out.println("A variável 1 é menor que a outra");
        }

         */


        //                           //

        /*
        double nota1 = 6.5;
        double nota2 = 8;
        double nota3 = 4;
        double media = (nota1 + nota2 + nota3)/3;

        if ((media >= 7) && (media <= 10)) {
            System.out.printf("O aluno está aprovado. A média foi %.2f", media);
        }
        else if ((media < 4) && (media >= 0)) {
            System.out.printf("O aluno está reprovado. A média foi %.2f", media);
        }
        else if ((media >= 4) && (media < 7)) {
            System.out.printf("O aluno está na final. A média foi %.2f",media);
        }
        else {
            System.out.printf("Média inválida. A média foi %.2f", media);
        }

         */

        //                           //

        double salario = 1800.00;

        if (salario <= 900.00) {
            System.out.println("Isento");
        }
        else if ((salario >= 901.00) && (salario <= 1500.00)) {
            System.out.println("Desconto de 5%");
        }
        else if ((salario >= 1501.00) && (salario <= 2500.00)) {
            System.out.println("Desconto de 10%");
        }
        else if ((salario > 2500.00)) {
            System.out.println("Desconto de 20%");
        }

    }
}