<img src="/assets/teste.svg" width="100%">

# Aula 5 - 31/03/2025

# Desvios Condicionais

antes...Como representar expressões lógicas?

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

Exemplos dos **operadores / expressões lógicas** na vida real:

#### E (Conjunção): &&

> Se amanha tiver: **```SOL```** **E** **```CHUVA```** então **```SaioDeCasa```**

> ```SOL = true```  ```CHUVA = true``` 
> Vou sair de casa? **```SaioDeCasa``` = ???**

> ```SOL = false```  ```CHUVA = true``` 
> Vou sair de casa? **```SaioDeCasa``` = ???**

> ```SOL = false```  ```CHUVA = false``` 
> Vou sair de casa? **```SaioDeCasa``` = ???**

#### OU (Disjunção): ||

> Se amanha tiver: **```SOL```** **OU** **```CHUVA```** então **```SaioDeCasa```** **```SaioDeCasa``` = ???**

> ```SOL = true```  ```CHUVA = true``` 
> Vou sair de casa? **```SaioDeCasa``` = ???**

> ```SOL = false```  ```CHUVA = true``` 
> Vou sair de casa? **```SaioDeCasa``` = ???**

> ```SOL = false```  ```CHUVA = false``` 
> Vou sair de casa? **```SaioDeCasa``` = ???**


#### Tabela verdade Conjunção (E) &&:

| V2| V1 | V1 && V2 |
| -- | -- | -- |
| false | false | false |
| true | false | false |
| false | true | false |
| true | true | true |

#### Tabela verdade Disjunção (OU) ||:

| V2| V1 | V1 \|\| V2 |
| -- | -- | -- |
| false | false | false |
| true | false | true |
| false | true | true |
| true | true | true |


### Estrutura if..else

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
> Dado o valor atual do salário de um funcionário, informe o valor de seu salário reajustado, de acordo com os percentuais indicados a seguir:
> - 50% para aqueles que recebem até R$ 2.000,00.
> - 20% para aqueles que recebem mais de R$ 2.000,00 e menos de R$ 5.000,00.
> - 10% para os demais.

#### Exercício 2
> O índice de massa corpórea de uma pessoa (imc) é dado pelo seu peso (em quilogramas) dividido pelo quadrado de sua altura (em metros). Dados o peso e altura de uma pessoa, informe a sua situação, de acordo com os critérios a seguir:
> - imc ≤ 18,5 ⇒ magro
> - 18,5 < imc ≤ 25,0 ⇒ normal
> - 25,0 < imc ≤ 30,0 ⇒ sobrepeso
> - imc > 30,0 ⇒ obeso
> 
#### Exercício 3
> Ler 3 números inteiros e apresentar o maior deles.

#### Exercício 4
> Ler 3 números inteiros e apresentá-los em ordem crescente.

