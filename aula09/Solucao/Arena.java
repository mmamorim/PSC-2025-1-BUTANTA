package aula09.Solucao;

public class Arena {
    private String nome;
    private int qtdeTorcedores;
    private boolean estaoFelizes;

    public Arena(String nome, int qtdeTorcedores) {
        this.nome = nome;
        this.qtdeTorcedores = qtdeTorcedores;
        estaoFelizes = true;
    }

    public void realizaCombate(Gladiador glad1, Arma arma1, Gladiador glad2, Arma arma2) {
        glad1.recebeGolpe(arma2);
        glad2.recebeGolpe(arma1);
        if(glad1.getVidas() == 0 || glad2.getVidas() == 0) {
            System.out.println("Alguém morreu!");
            estaoFelizes = true;
            qtdeTorcedores = (int)(qtdeTorcedores * 1.1);
        } else {
            System.out.println("Ninguém morreu!");
            estaoFelizes = false;
            qtdeTorcedores = (int)(qtdeTorcedores * 0.75);
        }
    }

    public void imprime() {
        System.out.print("ARENA "+nome+" com "+qtdeTorcedores);
        if(estaoFelizes) {
            System.out.println(" FELIZES");
        } else {
            System.out.println(" TRISTES");
        }
    }
}
