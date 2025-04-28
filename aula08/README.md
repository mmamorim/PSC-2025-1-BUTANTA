<img src="/assets/teste.svg" width="100%">

# Aula 8 - 28/04/2025

# Métodos Construtores e Encapsulamento

Este aula tem por objetivo apresentar os conceitos de métodos construtores e de encapsulamento. 

## Métodos Construtores

As linguagens que disponibilizam recursos para a programação Orientada a Objetos geralmente utilizam-se de métodos específicos para “construir” um objeto. 
Estes métodos são acionados de forma automática pela própria linguagem quando um objeto é instanciado (criado). 
Desta forma, os desenvolvedores podem fazer uso deles para manipular ações que possam ser necessárias durante esses eventos. 
Este método especial é chamado de Construtor (relacionado ao momento que um objeto é instanciado).


A inicialização de um objeto pode ser tratada utilizando o conceito de métodos construtores. No Java, todo método definido com o mesmo nome da classe passa a ser caracterizado como método construtor.

O método construtor, quando definido pela classe, disponibiliza uma forma de controlar as características de criação do objeto. Isto é interessante em casos onde queremos definir valores para atributos, instanciar outras classes, executar outros métodos e até mesmo permitir uma alocação dinâmica de memória que poderia ser utilizada durante a vida do objeto.

A sintaxe utilizada na declaração do método construtor segue a mesma usada na definição de métodos comuns, com a diferença que o tipo de retorno não é especificado.

~~~java
public class Pessoa {
    int idade;
    String nome;

    // Método construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazANiversario() {
        idade++;
    }

    public void imprime() {
        System.out.println("Pessoa: "+nome);
        System.out.println("Idade: "+idade);
    }
}

// Um exemplo que instacia um objeto da classe Pessoa com método construtor
public class Pessoa {
    public static void main(String args[]) {
        Pessoa p1 = new Pessoa("Ana",20);
        p1.fazAniversario();
        p1.imprime();
    }
}
~~~

## Encapsulamento

No Exemplo anterior, após o objeto ser instanciado da classe Pessoa e ser armazenado na variável $p1$, note que qualquer valor poderia ser atribuído ao atributo \realce{idade} do objeto, como por exemplo ```p.idade = -5;```. Apesar de percebermos que no exemplo citado nenhum problema de execução possa ocorrer, dependendo da situação e do comportamento planejado pela classe para um futuro objeto da classe Pessoa, a consistência da informação armazenada no atributo ```idade```, para o caso de valores negativos, pode trazer conflito na funcionalidade do objeto. Desta forma, seria interessante neste caso, evitar que valores inválidos sejam atribuidos.

O conceito de Encapsulamento é o processo no qual nenhum acesso direto aos dados é concedido, sendo possível a sua manipulação somente por meio da interação com o objeto. O Encapsulamento é o mecanismo que provê proteção de acesso aos membros internos de um objeto.

Os modificadores de acesso implementam o conceito de encapsulamento por meio de palavras-chaves. Os modificadores que o paradigma da Orientação a Objetos conceitua são:

* **public** - Publico
* **private** - Privado
* **protected** - Protegido

#### Modificador Public

Por padrão no Java, todo atributo ou método que não esteja declarado como protected ou private, é considerado **public**.

Membros declarados como público (**public**) poderão ser acessados livremente a partir da própria classe, por classes especialistas e por outros trechos fora do escopa da classe que dela se utilizam. 

A utilização do **public** não restringe acesso aos atributos e métodos declarados como tal. Desta forma, os objetos que se relacionam com um objeto que têm seus atributos / métodos declarados como **public**, podem arbitrariamente manipular os atributos do objeto e chamar seus métodos.

Esta prática deve ser evitada, pois ao programar orientado a objetos, deve-se seguir o conceito do paradigma da Orientação a Objeto, onde o reuso do código é um ponto importante, e a utilização do encapsulamento facilita o reaproveitamento do código.

<img src="./encapsulamento.png" width="100%">

#### Modificador Private

Está é a visibilidade mais restrita do conceito de encapsulamento, ou seja, somente o próprio objeto pode acessar seus atributos e métodos declarados como privados **private**. Membros declarados como **private**, só podem ser acessados a partir da própria classe em que foram declarados, nem seus descendentes e nem programas que fazem uso desta classe poderão acessar membros declarados como **private**. 

Em resumo, a utilização do modificador **private**, se dá aos atributos e métodos que são essenciais ao funcionamento do objeto e que somente o próprio objeto pode manipular. Deve-se, portanto, utilizar o modificador **private** em membros que podem alterar o funcionamento do objeto, tornado-o instável e inseguro.

Em sistemas orientados a objetos é comum desenvolvedores declararem todos os atributos como **private** e disponibilizar métodos para manipulação destes atributos (getters e setters). O conceito do encapsulamento não obriga a
utilização de todos os manipuladores, porém cada objeto deve ser modelado buscando sua reutilização, isto implica na correta utilização dos modificadores, pois os objetos podem evoluir e sem o encapsulamento esta evolução pode impedir o reuso.


#### Modificador Protected

O modificador **protected** será descrito quando tratarmos do conceito de herança.

### Métodos de Acesso

A Programação Orientada a Objetos adota como padrão proteger o acesso direto aos seus atributos, declarando-os sempre com o modificador de acesso **private**. A idéia é que cada objeto seja responsável por controlar seus atributos. Desta forma, passa a ser resposabilidade dele julgar se aquele novo valor é válido ou não para o atributo em questão. Esta validação não deve ser controlada por quem está usando o objeto e sim por ele mesmo, possibilitando que o sistema esteja preparado para futuras mudanças.

O Exemplo abaixo apresenta a classe Pessoa com os atributos nome e idade encapsulados. Além disso, foi disponibilizado os métodos de acesso e modificador para ambos os atributos: ```getIdade```, ```setIdade```, ```getNome``` e ```setNome```. Adotamos como nomenclatura para estes métodos sempre começar com os identificadores ```get``` para acesso e ```set``` para a alteração dos valores, seguido dos respectivos nomes dos atributos. Estes métodos também são conhecidos como **getters** e **setters**.

Apesar de ser uma boa prática sempre definir os métodos de acesso, em alguns casos o acesso para alguns atributos podem não ser disponibilizados. Assim, não é obrigatório a definição dos métodos de acesso para todos os atributos, podendo ser implementados quando necessário.

~~~java
public class Pessoa {
    private int idade;
    private String nome;

    // Método construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void fazANiversario() {
        idade++;
    }

    public void imprime() {
        System.out.println("Pessoa: "+nome);
        System.out.println("Idade: "+idade);
    }
}
~~~


