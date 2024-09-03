import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args) {

        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);


        System.out.print("Número 1 ");
        c.setN1(sc.nextInt());

        System.out.print("Número 2 ");
        c.setN2(sc.nextInt());

        c.somar(c.getN1(),c.getN2()); // usa void e o sout tá dentro da classe

        System.out.println("Subtração: "+ c.subtrair(c.getN1(),c.getN2())); // usa return e o sout está fora

        c.multiplicar(c.getN1(),c.getN2());

        System.out.println("Divisão: "+ c.dividir(c.getN1(),c.getN2()));

    }
}