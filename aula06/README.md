<img src="/assets/teste.svg" width="100%">

# Aula 6 - 07/04/2025

# Laços de repetição

Estruturas de repetição, também conhecidas como loops (laços), são utilizadas para executar repetidamente uma instrução ou bloco de instrução enquanto determinada condição estiver sendo satisfeita.

As principais estruturas de repetição na maioria das linguagens são o **while** e o **for**.

### Estrutura while

O while é uma estrutura de repetição utilizada quando não sabemos exatamente quantas vezes o código será repetido.

O while a seguinte estrutura:
 
~~~java
while (<condição>) {
    // Trecho de código a ser repetido
}
~~~

Perceba que a condição para interrupção da repetição do trecho dentro do while se dá através de uma condição booleana.

### Estrutura For

O for é uma estrutura de repetição na qual seu ciclo será executado por um tempo ou condição pré-determinados e em uma quantidade de vezes que determinamos.

O for possui a seguinte estrutura:

~~~java
for (<variável de controle>, <análise da variável de controle>, <incremento da variável de controle>) {
    // Código a ser executado
}
~~~

Quando utilizamos o for, precisamos de uma variável para auxiliar a controlar a quantidade de repetições a serem executadas. Essa variável é chamada de variável de controle e é declarada no primeiro argumento do for.

O segundo argumento do for é utilizado para definir até quando o for será executado. Geralmente, trata-se de uma condição booleana em cima da variável de controle.

O terceiro argumento indica o quanto a variável de controle será modificada no final de cada execução dentro do for.

# Exercícios

#### Exercício 1
> Sorteie um número entre 0 e 9 e peça para o usuário adivinhar qual número foi sorteado até descobrir. 

#### Exercício 2
> Dado um número inteiro N maior que zero, imprima todos os números de 1 até N.  

#### Exercício 3
> Dado um número inteiro N, calcule a somatória de 1 até N.

#### Exercício 4
> Dado um número inteiro N, calcule o fatorial de N.

#### Exercício 5
> Dado um número inteiro N, imprima a sequência de Fibinacci até N-ésima posição.


# Modularização 

Em Java, a modularização de código através de métodos (funções) permite dividir um programa complexo em partes menores e reutilizáveis, facilitando a organização, leitura, manutenção e teste do código. 

Um método em Java é uma sequência de instruções que realiza uma tarefa específica.

### Vantagens 

##### Reutilização de Código:

Uma vez criado, um método pode ser chamado de vários lugares do código, evitando a repetição de blocos de código.

##### Melhor Organização:

Métodos agrupados em classes (ou pacotes) permitem organizar o código de forma lógica e clara.

##### Facilidade de Manutenção:

Códigos modularizados são mais fáceis de identificar e corrigir erros, pois cada método tem uma responsabilidade específica.

##### Melhora a Legibilidade:

A modularização torna o código mais fácil de entender e ler, tanto pelo desenvolvedor original quanto por outros que venham a trabalhar com ele. 

##### Exemplo:

Imagine que você precisa criar um programa que calcula a área de diferentes figuras geométricas. Você pode criar métodos para calcular a área de um quadrado, retângulo, círculo, etc. 

~~~java
public class CalculadoraGeometrica {

    // Método para calcular a área de um quadrado
    public static double areaQuadrado(double lado) {
        return lado * lado;
    }

    // Método para calcular a área de um retângulo
    public static double areaRetangulo(double base, double altura) {
        return base * altura;
    }

    // Método para calcular a área de um círculo
    public static double areaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public static void main(String[] args) {
        // Exemplo de uso dos métodos
        double ladoQuadrado = 5;
        double baseRetangulo = 4;
        double alturaRetangulo = 3;
        double raioCirculo = 2;

        System.out.println("Área do quadrado: " + areaQuadrado(ladoQuadrado));
        System.out.println("Área do retângulo: " + areaRetangulo(baseRetangulo, alturaRetangulo));
        System.out.println("Área do círculo: " + areaCirculo(raioCirculo));
    }
}
~~~