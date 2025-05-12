package aula09.Solucao;

public class Gladiador {
    private String nome;
    private int vidas;
    private boolean temArmadura;

    public Gladiador(String nome, boolean temArmadura) {
        this.nome = nome;
        this.temArmadura = temArmadura;
        vidas = 5;
    }

    public void recebeGolpe(Arma arma) {
        vidas = vidas - arma.getForca();
        if(temArmadura) {
            vidas++;
            if(arma.getForca() > 1) {
                vidas++;
            }
        }
    }

    public void imprime() {
        System.out.print("GLADIADOR "+nome+" com "+vidas+" vidas e ");
        if(temArmadura) {
            System.out.println("tem armadura");
        } else {
            System.out.println("não tem armadura");
        }
    }
}