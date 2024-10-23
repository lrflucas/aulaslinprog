import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Professor prof = new Professor();
        Aluno a = new Aluno();
        Disciplina d = new Disciplina();
        Coordenador c = new Coordenador();

        a.quemSouEu();

        prof.quemSouEu();
        prof.explicar();
        prof.salario();

        c.quemSouEu();
        c.explicar();
        c.salario();


        System.out.print("Digite o nome da disciplina: ");
        d.setNome(sc.nextLine());

        d.cadastrarAluno(a);
        d.ministrarDisciplina(prof);

        System.out.println('\n');
        System.out.println("Informações da disciplina:");
        System.out.println(d);

        System.out.println('\n');
        System.out.println("Informações do professor:");
        prof.calcularSalario();
        System.out.println(prof);

        System.out.println('\n');

        System.out.println("Informações do aluno:");
        a.calcularMedia();
        System.out.println(a);

    }
}