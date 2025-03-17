import java.util.Scanner;

public class Prog {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = leitor.nextLine();
        System.out.println("Seu nome é: "+nome);

        System.out.println("Oi "+nome+" tudo bem? Digite sua idade:");
        int idade = leitor.nextInt();
        System.out.println("Você digitou a idade: "+idade);


    }
}
