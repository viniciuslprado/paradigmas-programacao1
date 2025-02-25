import exe1.Aluno;

public class MainAluno {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(); // chama construtor sem parametro
        System.out.println( "Media do Aluno " + obj1.nome + " é " + obj1.notafinal());
        obj1.dadosAlunos();
        // chama construtor com parametros
        Aluno obj2 = new Aluno(123, "Pedro", 19, 7.5f, 9.5f);
        System.out.println( "Média do Aluno " + obj2.nome + " é " + obj2.notafinal());
        obj2.dadosAlunos();
    }
}
