import java.util.Scanner;

public class MainIMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.print("Informe seu peso: ");
        p.setPeso(sc.nextDouble());

        System.out.print("Informe sua altura: ");
        p.setAltura(sc.nextDouble());

        p.calculoimc();

        System.out.println("Seu peso de "+ p.getPeso() + "kg e sua altura de " + p.getAltura() + "m obtêm um IMC de "+ p.getImc());
        p.tabelaimc();

    }

}