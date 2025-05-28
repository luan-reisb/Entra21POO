package modelo.excecao.pessoa;

public class NomeInvalidoException extends Exception {

    public NomeInvalidoException(String nome){
        super("O nome " + nome + " é inválido");
    }
}
