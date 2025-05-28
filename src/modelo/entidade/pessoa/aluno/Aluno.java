package modelo.entidade.pessoa.aluno;

import modelo.entidade.pessoa.Pessoa;
import modelo.entidade.turma.Turma;
import modelo.excecao.pessoa.CpfInvalidoException;
import modelo.excecao.pessoa.NomeInvalidoException;
import modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Aluno extends Pessoa {

    private Turma turma;

    public Aluno(String nome, String sobrenome, String cpf) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
        super(nome, sobrenome, cpf);
    }

    public Aluno(String nome, String sobrenome, String cpf, Turma turma) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
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
