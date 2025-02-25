package exe1;

import javax.swing.*;

public class Aluno {
    public int  nroAluno, idade;
    public float p1, p2;
    public String nome;

    // metodo construtor

    public Aluno() {
        this.nome = "Sem nome";
    }

    public Aluno(int nroAluno, String nome, int idade, float p1, float p2) {
        this.nroAluno = nroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public float notafinal(){
        return (this.p1 + this.p2)/2;
    }

    public String passou(){
        return (this.notafinal() >= 6) ? "Passou" : "Não Passou";
        /* alternativa mais longa
        if (this.notafinal() >= 6) {
            return "Passou";
        } else{
           return "Não passou";
        }*/
    }

    public void dadosAlunos(){
        System.out.println("Nro Aluno: " + this.nroAluno
                + "\nNome: " + this.nome
                + "\nSituação: " + this.passou());
    }
}
