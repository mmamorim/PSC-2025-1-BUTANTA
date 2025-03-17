import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = leitor.nextInt();

        int centena = numero / 100;
        System.out.println("CENTENA: "+centena);
        int dezena = (numero % 100)/10;
        System.out.println("DEZENA: "+dezena);
        int unidade = numero % 10;
        System.out.println("UNIDADE: "+unidade);


    }
}
