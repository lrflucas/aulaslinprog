import model.*;
import service.PessoaService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pessoa p = new Professor();
        PessoaService ps = new PessoaService();

        System.out.print("Digite o nome: ");
        p.setNome(sc.next());

        System.out.print("Digite a matrícula: ");
        p.setMatricula(sc.nextInt());

        //criar
        ps.cadastrarPessoas(p);
        System.out.println(ps.listar());

        //atualizar
        System.out.print("Digite o nome da pessoa que deseja atualizar: ");
        String nome = sc.next();
        System.out.print("Digite o novo nome da pessoa: ");
        String novoNome = sc.next();
        ps.atualizar(nome, novoNome);

        //deletar
        System.out.print("Digite o nome da pessoa que deseja deletar: ");
        String nomeDeletar = sc.next();
        ps.deletar(nomeDeletar);



        /*
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

         */

    }
}