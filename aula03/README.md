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

#### Exercício 2
> Ler o horário de início e término de uma reunião e apresentar o tempo de duração da reunião.

## Operadores Relacionais

Os operadores **relacionais** na linguagem Java adotados são:

| Operador | Descrição |
| -- | -- |
| > | maior |
| >= | maior ou igual |
| > | menor |
| <= | menor ou igual |
| == | igualdade |
| != | diferente |
</p>


Os operadores **lógicos** na linguagem Java adotados são:

| Operador | Descrição |
| -- | -- |
| && | conjunção (E) |
| \|\| | disjunção (OU) |
| ! | negação (NÃO) |
</p>

### Desvios Condicionais

<p align="justify">

A Linguagem Java, como qualquer outra linguagem de programação, suporta desvios condicionais utilizando a estrutura **`if`..`else`**. Quando temos mais de um comando a ser executado para um determinada condição, devemos agrupar estes comandos em um bloco delimitado por chaves, conforme indicado no Exemplo abaixo.
</p>

> caso 1
~~~java
if( /*CONDIÇÃO*/ ) 
   comando1();
~~~


> caso 2
~~~java
if( /*CONDIÇÃO*/ ) {
   comando1();
   comando2();
   // ...
} 
~~~

> caso 3
~~~java
if( /*CONDIÇÃO*/ ) 
  comando1();
else
  comando2();
~~~

> caso 4
~~~java
if( /*CONDIÇÃO*/ ) {
  comando1();
  comando2();
   // ...
} else
  comando3();
~~~

> caso 5
~~~java
if( /*CONDIÇÃO*/ ) 
  comando1();
else {
  comando2();
  comando3();
   // ...
}
~~~

> caso 6
~~~java
if( /*CONDIÇÃO*/ ) {
  comando1();
  comando2();
   // ...
} else {
  comando3();
  comando4();
   // ...
}
~~~

# Exercícios

#### Exercício 1
> Ler 3 números inteiros e apresentar o maior deles.

#### Exercício 2
> Ler 3 números inteiros e apresentá-los em ordem crescente.