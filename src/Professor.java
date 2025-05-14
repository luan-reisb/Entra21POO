public class Professor extends Pessoa {

    private Turma turma;

    public Professor(String nome, String sobrenome, String cpf){
        super(nome, sobrenome, cpf);
    }

    public Professor(String nome, String sobrenome, String cpf, Turma turma){
        super(nome, sobrenome, cpf);
        setTurma(turma);
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void realizarChamada(){
        System.out.println("\nPessoal, vamos responder a chamada");
    }
}
