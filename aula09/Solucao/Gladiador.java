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

    public int getVidas() {
        return vidas;
    }

    public void recebeGolpe(Arma arma) {
        vidas = vidas - arma.getForca();
        if(temArmadura) {
            vidas++;
            if(arma.getForca() > 1) {
                vidas++;
            }
        }
        if(vidas <= 0) {
            vidas = 0;
            System.out.println("GLADIADOR "+nome+" está morto!");
        }
    }

    public void imprime() {
        System.out.print("GLADIADOR "+nome+" com "+vidas+" vidas e ");
        if(temArmadura) {
            System.out.print("tem armadura");
        } else {
            System.out.print("não tem armadura");
        }
        if(vidas <= 0) {
            System.out.println(" estou morto!");
        } else {
            System.out.println(" estou vivo!");
        }
    }
}