package aula06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Exercicio1 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        int num, erros = 0;
        int numSorteado;
        numSorteado = (int)(Math.random()*10);

        System.out.println("Advinha o número:");
        //num = leitor.nextInt();
        num = Integer.parseInt(JOptionPane.showInputDialog("Advinha o número"));
        while(num != numSorteado) {
            erros++;
            JOptionPane.showMessageDialog(null, "Você já errou "+erros+" vezes !!!");
            num = Integer.parseInt(JOptionPane.showInputDialog("Advinha o número"));
            //System.out.println("Você já errou "+erros+" vezes !!! Advinha o número:");
            //num = leitor.nextInt();    
        }
        System.out.println("Você acertou!!! Numero sorteado: "+numSorteado);
    }
}
