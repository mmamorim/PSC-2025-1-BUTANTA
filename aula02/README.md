<img src="/assets/teste.svg" width="100%">

### Estrutura da Linguagem Java

<p align="justify">
A seguir, apresentamos de forma resumida os recursos linguisticos básicos do Java.
</p>

#### Comentários

<p align="justify">
Os comentários podem ser descritos de duas formas gerais: 
</p>

~~~java
// comentário de uma única linha

/* comentário de uma 
   ou mais linhas 
   ...
/*
~~~

#### Estilo e organização

<p align="justify">
Os blocos de código são demarcados entre chaves <b>{ }</b> e ao final de cada instrução deverá ser usado o <b>;</b> (ponto e vírgula). A linguagem Java é <b>Case Sensitive</b>, isto é, significa que o compilador irá fazer a diferenciação entre letras maiusculas e minusculas. 
</p>

<p align="justify">
Toda classe em Java deverá ser definida com o mesmo nome do arquivo (<b>.java</b>), sendo adotado como padrão que o primeiro caractere de todas as palavras que compõem o identificador da classe deve ser maiúsculo. 

> **Exemplos:** 
> `Pessoa`, `ContaCorrente` e `TimeDeFutebol` 

Os Métodos, Atributos e Variáveis adotam como padrão o primeiro caracter minúsculo e demais palavras iniciando com Maiusculas.  

> **Exemplos:** 
> `media`, `calculaMedia()` e `codigoVip` 

Já as constantes devem adotar o padrão com todos os caracteres maiúsculos e divisão de palavras utilizando \_. 

> **Exemplos:** 
> `AZUL`, `AZUL_CLARO`
</p>

#### Tipos de Dados

<p align="justify">
Em Java, como em outras linguagens fortemente tipadas, toda variável deve ser declarada descrevendo o tipo da informação a ser armazenada. 
</p>

> `<tipo> <identificador>;`
> `<Tipo> <identificador> = valor;`
> `<Tipo> <identificador> = valor, <identificador> = valor... ;`


<p align="justify">
A Tabela 1.1. apresenta alguns tipos primitivos da linguagem Java. As variáveis definas para esses tipos armazenam o valor diretamente no espaço alocado em memória. As variáveis do tipo referência armazenam o endereço de memória para um determinado valor ou objeto, que dependendo da informação e execução do programa, pode ter espaço de memória variável, como por exemplo, o tipo <b>String</b> que será descrito mais adiante. 
</p>

| Tipo Java | Tipo de dado | Tamanho em Bytes |
| -- | -- | -- |
| **`int`** | inteiro | 4 |
| **`byte`** | inteiro 0 até 255 | 1 |
| **`long`** | inteiro longo | 8 |
| **`float`** | real | 4 |
| **`double`** | real longo | 8 |
| **`boolean`** | lógico | 1 |
| **`char`** | 1 caractere | 2 |

<p align="center">
Tabela 1.1. Tipos primitivos Java.
</p>

<p align="justify">

Os valores literais que representam uma informação do tipo `float`  devem receber o caractere `f` após a informação. Exemplos: `100.0f`, `5.34f` e `3.1416f`.
</p>

#### Operadores

<p align="justify">

Os operadores **aritméticos** na linguagem Java adotados são:

| Operador | Descrição |
| -- | -- |
| + | soma |
| - | subtração |
| * | multiplicação |
| / | divisão |
| % | resto da divisão (mod) |
| ++ | incremento |
| -- | decremento |
</p>

<p align="justify">

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

<p align="justify">

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
> ~~~java
> if( /*CONDIÇÃO/* ) 
>     // COMANDO 1
> ~~~
> 

> caso 2
> ~~~java
> if( /*CONDIÇÃO/* ) {
>     // COMANDO 1
>     // COMANDO 2
>     // ...
> } 
> ~~~

<p align="justify">
</p>

<p align="justify">
</p>
