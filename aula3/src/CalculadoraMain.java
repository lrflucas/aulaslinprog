import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);

        int n1,n2;

        System.out.print("Número 1 ");
        n1 = sc.nextInt();

        System.out.print("Número 2 ");
        n2 = sc.nextInt();

        c.somar(n1,n2); // usa void e o sout tá dentro da classe

        System.out.println("Subtração: "+ c.subtrair(n1,n2)); // usa return e o sout está fora

        c.multiplicar(n1,n2);

        System.out.println("Divisão: "+ c.dividir(n1,n2));

    }
}