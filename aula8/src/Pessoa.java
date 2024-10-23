public abstract class Pessoa {

    protected String nome = "Lucas";
    protected int matricula = 2024111;

    public Pessoa() {

    }

    public Pessoa(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }


    public abstract void quemSouEu();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
