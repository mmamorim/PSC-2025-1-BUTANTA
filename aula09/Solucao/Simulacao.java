package aula09.Solucao;

public class Simulacao {
    public static void main(String[] args) {
        Arma lanca = new Arma("Lança",3);
        Arma espada = new Arma("Espada",5);
        Arma arco = new Arma("Arco e Flecha",2);
        Gladiador maximus = new Gladiador("Maximus",false);
        Gladiador heman = new Gladiador("He-man",true);
        Arena morumbis = new Arena("Morumbis",1000);

        morumbis.realizaCombate(maximus,lanca,heman,espada);

        lanca.imprime();
        espada.imprime();
        arco.imprime();
        maximus.imprime();
        heman.imprime();
        morumbis.imprime();
    }
}
