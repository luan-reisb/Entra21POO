package modelo.entidade.pessoa;

import modelo.entidade.pessoa.empregado.Empregado;
import modelo.entidade.turma.Turma;
import modelo.excecao.pessoa.CpfInvalidoException;
import modelo.excecao.pessoa.NomeInvalidoException;

public  abstract class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;


    protected Pessoa(String nome, String sobrenome, String cpf) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
        super();
        setNome(nome);
        setSobrenome(sobrenome);
        setCPF(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws NomeInvalidoException {
        if(nome.isEmpty())
            throw new NomeInvalidoException(nome);

        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) throws SobrenomeInvalidoException {
        if(sobrenome.isEmpty())
            throw new SobrenomeInvalidoException(sobrenome);

        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) throws CpfInvalidoException {
        if (cpf.isEmpty())
            throw new CpfInvalidoException(cpf);

        this.cpf = cpf;
    }

    public static class Professor extends Empregado {

        private Turma turma;

        public Professor(String nome, String sobrenome, String cpf, float salario) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
            super(nome, sobrenome, cpf, salario);
        }

        public Professor(String nome, String sobrenome, String cpf, Turma turma, float salario) throws NomeInvalidoException, SobrenomeInvalidoException, CpfInvalidoException {
            super(nome, sobrenome, cpf, salario);
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

        public float calcularSalario(){
            return getSalario() + 500;
        }

        public float calcularSalario(int quantidadedeHorasTrablhas){
            return quantidadedeHorasTrablhas * 50;
        }
    }
}
