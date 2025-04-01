package aula05;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); 
        double salario, salarioNovo;

        System.out.println("Digite o salário:");
        salario = leitor.nextDouble();
        System.out.println("Salário: "+salario);

        //if(salario<=2000) {
        //    salarioNovo = salario * 1.5;
        //    System.out.println("Salário Novo: "+salarioNovo);    
        //} 
        //if(salario>2000 && salario<=5000) {
        //    salarioNovo = salario * 1.2;
        //    System.out.println("Salário Novo: "+salarioNovo);
        //}
        //if(salario>5000) {
        //    salarioNovo = salario * 1.1;
        //    System.out.println("Salário Novo: "+salarioNovo);
        //}

        if(salario<=2000) {
            salarioNovo = salario * 1.5;
        } else {
            if(salario <= 5000) {
                salarioNovo = salario * 1.2;
            } else {
                salarioNovo = salario * 1.1;
            }
        }
        System.out.println("Salário Novo: "+salarioNovo);    

    }
}
