package aula09.Solucao;

public class Simulacao {
    public static void main(String[] args) {
        Arma lanca = new Arma("Lança",3);
        Arma espada = new Arma("Espada",5);
        Arma arco = new Arma("Arco e Flecha",2);
        Gladiador maximus = new Gladiador("Maximus",false);
        Gladiador heman = new Gladiador("He-man",true);

        maximus.recebeGolpe(lanca);

        a1.imprime();
        a2.imprime();
        a3.imprime();
        maximus.imprime();
        heman.imprime();
    }
}
