package aula09.Solucao;

public class Arma {
    private String nome;
    private int forca;

    public Arma(String nome, int forca) {
        this.nome = nome;
        this.forca = forca;
    }

    public String getNome() {        
        return nome;
    }

    public int getForca() {
        return forca;
    }

    public void imprime() {
        System.out.println("Arma Nome: "+nome+" Força: "+forca);        
    }
}