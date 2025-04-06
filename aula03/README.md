<img src="/assets/teste.svg" width="100%">

# Aula 3 - 17/03/2025

## Comandos de Leitura e Escrita

O Java disponibiliza diversas classes que manipulam a entrada e saída básicas para ler e escrever em arquivos, envio de dados via rede e o **console** (Console é o nome dado a janela de linha de comandos também conhecida como **prompt (Windows)** ou **terminal (Linux)**. 

A classe ```System``` disponibiliza o acesso para a saída e entrada padrão por meio do ```System.out``` e ```System.in``` respectivamente. Estes pacotes oferecem métodos de impressão e leitura usados para manipular dados em um programa no console.


### Saída de Dados

O pacote de classes ```System.out``` oferece dois métodos básicos para impressão. O ```print``` para apresentar dados na tela sem quebra de linha e ```println``` para apresentar dados na tela com quebra de linha ao final da impressão.

~~~java
int qtde = 5; 
System.out.print("Tenho " + qtde + " amigos."); 
double valor = 1.55;
System.out.print("Tenho apenas R\$:" + valor);
~~~

### Leitura de Dados

O Java disponibiliza a classe ```Scanner``` do pacote ```java.util```. Essa classe implementa as operações de entrada de dados pelo teclado no ```console```. 

Para utilizar a classe ```Scanner``` deve-se importar o respectivo pacote, adicionando a linha ```import java.util.Scanner;``` no início do arquivo de código. Além disso, deve-se instanciar um objeto desta classe, conforme apresentado no exemplo abaixo.

~~~java
import java.util.Scanner; \\

class TesteLeitura { \
    public static void main(String args[]) {
         Scanner leitor = new Scanner(System.in); 
         System.out.println("Informe uma idade:");
         int n = leitor.nextInt();
         System.out.println("Valor da idade digitada: "+n);
    }
}
~~~

A leitura dos diversos tipos diferentes é apresentada pela tabela abaixo. 

| Método | Tipo de dado | Exemplo |
| -- | -- | -- |
| nextInt() | inteiro | int n = leitor.nextInt(); |
| nextDouble() | double | double n = leitor.nextDouble(); |
| next() | String (uma palavra) | String n = leitor.next(); |
| nextLine() | String (linha inteira) | String n = leitor.nextLine(); |

Enquanto ```leitor.next()``` é usado na leitura de palavras simples, ou seja, não são separados pelo caractere de espaço, o comando ```leitor.nextLine()``` é usado na leitura de palavras compostas, como por exemplo, ```"oi gente"```.

# Exercícios

#### Exercício 1
> Ler um número inteiro de 3 dígitos e apresentar a unidade, dezena e centena deste número. 
> Exemplo para a leitura do inteiro 742
> CENTENA: 7
> DEZENA: 4
> UNIDADE: 2

import java.util.Scanner;

public class SepararDigitos {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar ao usuário que insira um número inteiro de 3 dígitos
        System.out.print("Digite um número inteiro de 3 dígitos: ");
        int numero = scanner.nextInt();
        
        // Calcular a centena, dezena e unidade
        int centena = numero / 100;         // Dividir por 100 para obter o primeiro dígito (centena)
        int dezena = (numero / 10) % 10;    // Dividir por 10 e pegar o resto da divisão por 10 (dízena)
        int unidade = numero % 10;          // Pegar o resto da divisão por 10 para obter o último dígito (unidade)
        
        // Exibir os resultados
        System.out.println("CENTENA: " + centena);
        System.out.println("DEZENA: " + dezena);
        System.out.println("UNIDADE: " + unidade);
        
        // Fechar o scanner
        scanner.close();
    }
}

#### Exercício 2
> Ler o horário de início e término de uma reunião e apresentar o tempo de duração da reunião.

import java.util.Scanner;

public class DuracaoReuniao {
    public static void main(String[] args) {
        // Criando o objeto Scanner para ler a entrada
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar o horário de início (horas e minutos)
        System.out.print("Digite o horário de início (horas e minutos): ");
        int horaInicio = scanner.nextInt();
        int minutoInicio = scanner.nextInt();
        
        // Solicitar o horário de término (horas e minutos)
        System.out.print("Digite o horário de término (horas e minutos): ");
        int horaFim = scanner.nextInt();
        int minutoFim = scanner.nextInt();
        
        // Converter os horários para minutos desde a meia-noite
        int totalMinutosInicio = horaInicio * 60 + minutoInicio;
        int totalMinutosFim = horaFim * 60 + minutoFim;
        
        // Calcular a duração da reunião em minutos
        int duracaoMinutos = totalMinutosFim - totalMinutosInicio;
        
        // Caso a reunião tenha passado da meia-noite, corrigimos o cálculo
        if (duracaoMinutos < 0) {
            duracaoMinutos += 24 * 60;  // Adicionamos 24 horas em minutos (1440 minutos)
        }
        
        // Converter a duração de minutos para horas e minutos
        int horasDuracao = duracaoMinutos / 60;
        int minutosDuracao = duracaoMinutos % 60;
        
        // Exibir o tempo de duração
        System.out.println("Duração da reunião: " + horasDuracao + " horas e " + minutosDuracao + " minutos.");
        
        // Fechar o scanner
        scanner.close();
    }
}

