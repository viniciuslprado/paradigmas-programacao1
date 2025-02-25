package exe0;
import javax.swing.*;

public class Carro {
    //variaveis
    //do tipo primitivo (começa com letra minuscula)
    public int ano;
    public float velocidade;
    //do tipo classe
    public String marca, modelo;

    //todo metodo constrtutor é o mesmo nome da classe
    //metodo construtor com parametro
    public Carro() {
        this.marca = "Marca inválida";
        this.modelo = "Modelo Inválido";
    }

    //metodo construtor sem parametro
    public Carro(int ano, int velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }
    //metodos
    public void exibirDetalhes() {
        //System.out.println("Marca: " + this.marca + " Modelo:  " + this.modelo + " Ano: " + this.ano + " Velocidade: " + this.velocidade);
        JOptionPane.showMessageDialog(null, "Marca: " + this.marca + " Modelo:  " + this.modelo + " Ano: " + this.ano + " Velocidade: " + this.velocidade);
    }

    // vai acelerar o carro de X unidade
    public void acelerar(float x) {
        this.velocidade = this.velocidade + x;
    }

    public void frear(float x) {
        if(this.velocidade - x >= 0){
            this.velocidade = this.velocidade - x;
        }
        else{
            System.out.println("Não é possivel frear");
        }
    }
}