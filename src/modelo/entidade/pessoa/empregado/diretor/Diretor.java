package modelo.entidade.pessoa.empregado.diretor;

import modelo.entidade.pessoa.empregado.Empregado;
import modelo.entidade.pessoa.empregado.RH;

public class Diretor extends Empregado implements RH {
    public Diretor(String nome, String sobrenome, String cpf, float salario) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
        super(nome, sobrenome, cpf, salario);
    }

    public float calcularSalario(){
        return getSalario() + 1500;
    }

    @Override
    public void contratarEmpregado(Empregado empregado) {
        empregado.setSituacao(Situacao.ATIVO);
    }

    public void demitirEmpregado(Empregado empregado){
        empregado.setSituacao(Situacao.INATIVO);
    }
}
