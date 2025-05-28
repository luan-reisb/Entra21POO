package modelo.entidade.pessoa.empregado.professor;
import modelo.entidade.pessoa.Pessoa;
import modelo.entidade.turma.Turma;
import modelo.excecao.pessoa.CpfInvalidoException;
import modelo.excecao.pessoa.NomeInvalidoException;
import modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Professor extends Pessoa {

    private Turma turma;

    public Professor(String nome, String sobrenome, String cpf) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
        super(nome, sobrenome, cpf);
    }

    public Professor(String nome, String sobrenome, String cpf, Turma turma) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
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
