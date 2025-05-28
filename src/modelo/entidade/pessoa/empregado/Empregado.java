package modelo.entidade.pessoa.empregado;

import modelo.entidade.pessoa.Pessoa;
import modelo.enumeracao.empregado.Situacao;
import modelo.excecao.pessoa.CpfInvalidoException;
import modelo.excecao.pessoa.NomeInvalidoException;
import modelo.excecao.pessoa.SobrenomeInvalidoException;

public abstract class Empregado extends Pessoa {

    private float salario;
    private Situacao situacao;

    protected Empregado(String nome, String sobrenome, String cpf, float salario) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
        super(nome, sobrenome, cpf);
        setSalario(salario);
        setSituacao(Situacao.ATIVO);
    }


    protected Empregado(String nome, String sobrenome, String cpf, float salario, Situacao situacao) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
        super(nome, sobrenome, cpf);
        setSalario(salario);
    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Situacao getSituacao(){
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public abstract float calcularSalario();
}
