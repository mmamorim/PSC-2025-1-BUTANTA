package aula05;

public class Testes {
    public static void main(String[] args) {
        
        int x = 10;
        boolean temSol = false;
        boolean EstahChovendo = true;
        boolean sairDeCasa = temSol||EstahChovendo;

        if(sairDeCasa)
            System.out.println("Eu vou sair de casa!!!");
        else
            System.out.println("Eu NÃO vou sair de casa!!!");
    }
}
