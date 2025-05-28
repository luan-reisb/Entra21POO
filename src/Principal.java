import modelo.entidade.pessoa.Pessoa;
import modelo.entidade.pessoa.empregado.diretor.Diretor;
import modelo.entidade.pessoa.empregado.Empregado;
import modelo.entidade.pessoa.empregado.professor.Professor;
import modelo.excecao.pessoa.CpfInvalidoException;
import modelo.excecao.pessoa.NomeInvalidoException;
import modelo.excecao.pessoa.SobrenomeInvalidoException;

public class Principal {
    public static void main(String[] args){

        try {


            Empregado[] empregados = new Empregado[3];
            empregados[0] = new Professor("Juscelino", "Tem", "tem", 3000);
            empregados[1] = new Diretor("Sonia", "Abraão", "fofoca", 5000);
            empregados[2] = new Professor("fabio", "silva", "cpf", 3000);

            for (Empregado empregado : empregados) {
                System.out.println(empregado.calcularSalario());
            }
        }

            catch(NomeInvalidoException exception){
                System.out.println(exception.getMessage());
            }

            catch(SobrenomeInvalidoException exception){
                System.out.println(exception.getMessage());
            }

            catch(CpfInvalidoException exception){
                exception.printStackTrace();
        }

        finally {
            System.out.println("entrou");
        }
    }
}
