public class Aluno extends Pessoa {

    private Turma turma;

    public Aluno(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    public Aluno(String nome, String sobrenome, String cpf, Turma turma) {
        super(nome, sobrenome, cpf);
        setTurma(turma);
    }

    public Turma getTurma() {
        return turma;
    }

    private void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void responderChamada(){
        System.out.println(getNome() + " está presente, querido professor!");
    }
}
