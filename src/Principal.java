public class Principal {
    public static void main(String[] args){

        System.out.println("Dados da Turma");

        System.out.println("\nProfessor:");

        Professor professor = new Professor("Erick","Silva","123.456.789-05");

        System.out.println("\nNome :" + professor.getNome());
        System.out.println("Sobrenome :" + professor.getSobrenome());
        System.out.println("CPF :" + professor.getCPF());

        professor.realizarChamada();


        System.out.println("\nAlunos:");

        Aluno aluno = new Aluno("Lucio","Morningstar","123.456.789-05");

        System.out.println("\nNome :" + aluno.getNome());
        System.out.println("Sobrenome :" + aluno.getSobrenome());
        System.out.println("CPF :" + aluno.getCPF());

        aluno.responderChamada();

        aluno.setNome("Devon");
        aluno.setSobrenome("Zogratis");
        aluno.setCPF("123.456.789-05");

        System.out.println("\nNome :" + aluno.getNome());
        System.out.println("Sobrenome :" + aluno.getSobrenome());
        System.out.println("CPF :" + aluno.getCPF());

        aluno.responderChamada();

        aluno.setNome("Linus");
        aluno.setSobrenome("Torvalds");
        aluno.setCPF("123.456.789-05");

        System.out.println("\nNome :" + aluno.getNome());
        System.out.println("Sobrenome :" + aluno.getSobrenome());
        System.out.println("CPF :" + aluno.getCPF());

        aluno.responderChamada();


        System.out.println();
    }
}
