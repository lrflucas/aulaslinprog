public class Calculadora {

    private int total;

    private double total2;

    private int n1, n2;

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




    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public double getTotal2() {
        return total2;
    }

    public void setTotal2(double total2) {
        this.total2 = total2;
    }


    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }


    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
