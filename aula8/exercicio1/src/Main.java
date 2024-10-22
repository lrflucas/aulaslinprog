import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medico m = new Medico();
        Paciente p = new Paciente();
        Consulta c = new Consulta();

        System.out.print("Digite a data da consulta (Formato AAAA-MM-DD): ");
        String data = sc.next();

        LocalDate dataConsulta = LocalDate.parse(data);
        c.realizarConsulta(m, p, dataConsulta);

        System.out.println("Consulta realizada com sucesso!");
    }
}