package modelo.excecao.pessoa;

public class CpfInvalidoException extends Exception{

    public CpfInvalidoException(String CPF){
        super("O CPF "+ CPF + "é inválido");
    }
}
