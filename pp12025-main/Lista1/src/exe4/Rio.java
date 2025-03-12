package exe4;

public class Rio {

    public String nome;

    public float nivel;

    public boolean poluido;

    // construtor sem parametro

    public Rio() {
        this.nome = "Sem nome";
    }

    // construtor com parametro

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    //poluido
    public void poluir(){
        this.poluido = true;
    }

    public void limpar(){
        this.poluido = false;
    }

    public void chover(float x) {
        this.nivel += x;
    }


    public void ensolarado(float x) {
        if(this.nivel >= x){
            this.nivel -= x;
        }
        else{
            System.out.println("Nivel do rio não foi alterado");
        }

    }
    // botão da direita, genereite, to string

    public String exibirDados() {
        return "Rio{" +
                "nome='" + nome + '\'' +
                ", nivel=" + nivel +
                ", poluido=" + (poluido? "Sim": "Não") +
                '}';
    }
}
