package aula05;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int n1, n2, n3, aux;

        System.out.println("Digite N1:");
        n1 = leitor.nextInt();
        System.out.println("Digite N2:");
        n2 = leitor.nextInt();
        System.out.println("Digite N3:");
        n3 = leitor.nextInt();
        System.out.println("N1: "+n1+" N2: "+n2+" N3: "+n3);

        if(n1>n2) {
            aux = n2;
            n2 = n1;
            n1 = aux;    
        }
        if(n2>n3) {
            aux = n3;
            n3 = n2;
            n2 = aux;    
        }
        if(n1>n2) {
            aux = n2;
            n2 = n1;
            n1 = aux;    
        }

        System.out.println("A ordem é: "+n1+","+n2+","+n3);
    }
}
