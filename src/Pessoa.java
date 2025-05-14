public class Pessoa {
    private String nome;
    private String sobrenome;
    private String cpf;


    public Pessoa(String nome, String sobrenome, String cpf) {
        super();
        setNome(nome);
        setSobrenome(sobrenome);
        setCPF(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
}
