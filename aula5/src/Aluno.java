public class Aluno extends Pessoa {

    private double nota1, nota2, nota3, media;

    public Aluno() {

    }

    public Aluno(String nome, double nota1, double nota2, double nota3) {

        super(nome);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;

    }

    public void calcularMedia() {

        media = (nota1 + nota2 + nota3) / 3;

    }

    public void verificarAprovacao() {

        if (media >= 7.0) {
            System.out.println("Resultado: Aprovado");
        } else if (media < 5.0) {
            System.out.println("Resultado: Reprovado");
        } else {
            System.out.println("Resultado: Recuperação");
        }

    }

    public void exibirDetalhesAluno() {

        System.out.println("Nome do aluno: "+ nome);
        System.out.println("Nota 1: "+ nota1);
        System.out.println("Nota 2: "+ nota2);
        System.out.println("Nota 3: "+ nota3);
        System.out.println("Média: "+ media);
        System.out.println();

    }






    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }


    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }


    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }


}
