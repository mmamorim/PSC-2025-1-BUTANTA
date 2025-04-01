package aula05;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double altura, peso, imc;

        System.out.println("Qual sua altura?");
        altura = leitor.nextDouble();
        System.out.println("Qual sua peso?");
        peso = leitor.nextDouble();

        System.out.println("Sua Altura: "+altura+" e Peso: "+peso);

        imc = peso / (altura * altura);
        System.out.println("IMC: "+imc);
        //if(imc <= 18.5) {
        //    System.out.println("MAGRO");
        //} 
        //if(imc > 18.5 && imc <= 25) {
        //    System.out.println("NORMAL");
        //}  
        //if(imc > 25 && imc <= 30) {
        //    System.out.println("SOBREPESO");
        //} 
        //if(imc > 30) {
        //    System.out.println("OBESO");
        //}  

        if(imc <= 18.5) {
            System.out.println("MAGRO");
        } else {
            if(imc <= 25) {
                System.out.println("NORMAL");
            } else {
                if(imc <= 30) {
                    System.out.println("SOBREPESO");
                } else {
                    System.out.println("OBESO");    
                }    
            }
        }

    }
}
