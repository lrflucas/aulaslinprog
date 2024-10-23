import com.sun.security.jgss.GSSUtil;

public class Aluno extends Pessoa {

    private double nota1 = 7.0;
    private double nota2 = 8.5;
    private double nota3 = 5.0;
    private double media;

    public Aluno() {

    }

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3, double media) {
        super(nome, matricula);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = media;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Aluno");
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


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", media=" + media +
                '}';
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

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
