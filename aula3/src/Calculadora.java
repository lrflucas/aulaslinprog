public class Calculadora {

    int total;

    double total2;

    public void somar(int x, int y) {  // void precisa do "sout" pra exibir o resultado

        total = x + y;
        System.out.println("Adição: "+ total);

    }

    public int subtrair(int x, int y) { // return precisa do tipo da variável

        total = x - y;
        return total;

    }

    public void multiplicar(double x, double y) {

        total2 = x * y;
        System.out.println("Multiplicação: "+ total2);

    }

    public double dividir(double x, double y) {

        total2 = x / y;
        return total2;

    }
}
