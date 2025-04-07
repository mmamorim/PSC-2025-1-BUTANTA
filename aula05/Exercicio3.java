package aula05;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, n3, maior;

        System.out.println("Digite N1:");
        n1 = leitor.nextInt();
        System.out.println("Digite N2:");
        n2 = leitor.nextInt();
        System.out.println("Digite N3:");
        n3 = leitor.nextInt();
        System.out.println("N1: "+n1+" N2: "+n2+" N3: "+n3);

        maior = n1;
        if(n2 > maior) {
            maior = n2;
        }
        if(n3>maior) {
            maior = n3;
        }
        System.out.println("O maior é: "+maior);
    }
}
