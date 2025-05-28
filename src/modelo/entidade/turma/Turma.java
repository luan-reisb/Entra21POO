package modelo.entidade.turma;

import modelo.entidade.pessoa.Pessoa;
import modelo.entidade.pessoa.aluno.Aluno;

public class Turma {

    private String codigo;
    private byte cargaHoraria;
    private Pessoa.Professor professor;
    private Aluno[] alunos;
    private final static byte TAMANHO_TURMA = 25;
    private int quantidadeAlunos;


    public Turma(String codigo, byte cargaHoraria){
        setCodigo(codigo);
        setCargaHoraria(cargaHoraria);
        alunos = new Aluno[TAMANHO_TURMA];
        quantidadeAlunos = 0;
    }

    public Turma(String codigo, byte cargaHoraria, Pessoa.Professor professor){
        setCodigo(codigo);
        setCargaHoraria(cargaHoraria);
        setProfessor(professor);
        alunos = new Aluno[TAMANHO_TURMA];
        quantidadeAlunos = 0;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public byte getCargaHoraria(){
        return cargaHoraria;
    }

    public void setCargaHoraria(byte cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public Pessoa.Professor getProfessor(){
        return professor;
    }

    public void setProfessor(Pessoa.Professor professor){
        this.professor = professor;
    }

    public boolean adicionarAluno(Aluno aluno){
        if(TAMANHO_TURMA == quantidadeAlunos)
            return false;
        for (int i = 0; i < TAMANHO_TURMA;i++){
            if(alunos[i].getCPF().equals(aluno.getCPF()))
                return false;
        }
        alunos[quantidadeAlunos] = aluno;
        quantidadeAlunos++;
        return  true;
    }

    public boolean removeraluno(Aluno aluno){
        if (quantidadeAlunos == 0)
            return false;
            for (int i = 0; i < TAMANHO_TURMA; i++){
                if(alunos[i].getCPF().equals(aluno.getCPF()))
                    alunos[i] = null;
                    alunos = reorganizarVetor(alunos);
                    quantidadeAlunos--;
                    return true;
        }
        return false;
    }

    private Aluno[] reorganizarVetor(Aluno[] alunos){
        for(int i = 0; i < alunos.length; i++){
            if(alunos[i] != null){
                Aluno temp = alunos[i];
            }
        }
        return null;
    }
}
