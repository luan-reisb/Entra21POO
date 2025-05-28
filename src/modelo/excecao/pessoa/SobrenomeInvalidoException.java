package modelo.excecao.pessoa;

public class SobrenomeInvalidoException extends Exception{

    public SobrenomeInvalidoException(String sobrenome){
        super("O Sobrenome " + sobrenome + " é inválido");
    }
}
