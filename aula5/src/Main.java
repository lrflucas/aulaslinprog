import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aluno a = new Aluno();
        Aluno a2 = new Aluno("João",9,0,0);


        Professor professor = new Professor();


        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Diga o nome do aluno: ");
        a.setNome(sc2.nextLine());

        System.out.print("Digite a primeira nota de "+ a.getNome() + ": ");
        a.setNota1(sc.nextDouble());

        System.out.print("Digite a segunda nota: ");
        a.setNota2(sc.nextDouble());

        System.out.print("Digite a terceira nota: ");
        a.setNota3(sc.nextDouble());

        System.out.println();

        a.calcularMedia();

        a.exibirDetalhesAluno();
        a.verificarAprovacao();


        System.out.println();

        System.out.print("Diga o nome do professor: ");
        professor.setNome(sc2.nextLine());

        System.out.print("Diga quantas horas esse professor trabalha: ");
        professor.setHoras(sc.nextInt());

        System.out.print("Diga o valor por hora: ");
        professor.setValorhora(sc.nextDouble());

        professor.calcularSalario();
        System.out.print("R$"+ professor.getSalario());

    }
}