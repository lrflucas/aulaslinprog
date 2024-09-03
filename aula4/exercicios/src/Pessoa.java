public class Pessoa {

    private double peso, altura, imc;

    public void calculoimc() {

        imc = peso / (altura * altura);

    }

    public void tabelaimc() {

        if (imc < 18.5){
            System.out.print("Está com baixo peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.print("Está com peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.print("Está com sobrepeso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.print("Está com obesidade grau 1");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.print("Está com obesidade grau 2");
        } else {
            System.out.print("Está com obesidade grau 3");
        }

    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }
}