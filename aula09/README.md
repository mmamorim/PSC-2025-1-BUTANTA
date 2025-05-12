<img src="/assets/teste.svg" width="100%">

# Aula 9 - 12/05/2025 - Exercícios

## BATALHA DOS GLADIADORES

Classe **Arma**

> Construa uma classe ```Arma``` contendo um atributo para armazenar o nome da arma por exemplo: (```"lança"``` , ```"espada"```  e ```"arco e flecha"``` ) e um atributo inteiro para armazenar a força de destruição da arma entre 1 até 5 (5 para maior força de destruição e 1 para menor força). Implemente nesta classe um método construtor que receba como parâmetro o nome da arma e sua força de destruição. Crie um método de acesso (get) para o atributo nome da arma e um para o atributo força de destruição. Crie um método ```void imprime()``` que imprima o nome da arma e sua força de destruição.
---

Classe **Gladiador**

> Construa uma classe ```Gladiador``` contendo um atributo para armazenar o nome do gladiador, um atributo que armazene a quantidade de vidas (0 até 5) e um atributo para controlar se o gladiador está usando ou não armadura. Implemente nesta classe um método construtor que receba como parâmetro o nome do gladiador e se ele deve ter armadura. Todo objeto instanciado da classe ```Gladiador``` deve ter quantidade de vidas igual a 5. Crie apenas um método de acesso (get) para o atributo de quantidade de vidas. Crie um método ```void recebeGolpe(Arma arma)``` que receba como parâmetro um objeto da classe ```Arma```, e que realize a tarefa de retirar o numero de vidas dependendo da força de destruição da arma (Cada força de destruição retira uma vida, sendo que gladiadores com armadura conseguem proteger-se de 2 forças de destruição da arma, ou seja, se a arma tem 5 forças, apenas 3 vidas são retiradas, para 4 forças retiram-se 2 vidas e para 3 forças, 1 vida. Um gladiador estará morto caso seu número de vidas seja zero. Crie um método ```void imprime()``` que imprima o nome do gladiador, quantidade de vidas, se está de armadura e se continua vivo ou morto.
---

Classe **Arena**

> Construa uma classe ```Arena``` contendo um atributo para armazenar a quantidade de torcedores da arena e um atributo para controlar se os torcedores estão felizes ou tristes. Implemente nesta classe um método construtor que receba como parâmetro a quantidade de torcedores da arena. Todo objeto instanciado da classe Arena deve estar com seus torcedores contentes. Crie um método ```void realizaCombate(Gladiador glad1, Arma arma1, Gladiador glad2, Arma arma2)``` que receba como parâmetro dois objetos da classe ```Gladiador``` e dois objetos da classe ```Arma```, e que realize a tarefa de realizar o combate entre os gladiadores (glad1, glad2) e suas respectivas armas (arma1, arma2), ou seja, este método deve ser responsável de efetuar os golpes em cada gladiador com a arma do adversário. Quando os dois gladiadores continuam vivos após um combate, os torcedores ficam tristes e 25% deles deixam a arena. Caso contrário, eles ficam felizes e a arena sofre um acréscimo de 10% de torcedores. Crie um método ```void imprime()``` que imprima a quantidade de torcedores da arena e se eles estão contentes ou tristes.
---

Classe **SimulaCombate** (sugestão)

Uma possível simulação de interação entre objetos instaciados das classes acima é apresentada abaixo.  

~~~java
public class SimulaCombate {
    public static void main(String args[]) {
        Arma arma1, arma2, arma3;
        Gladiador glad1, glad2;
        Arena arena;
        arma1 = new Arma("Arco e flecha",2);
        arma2 = new Arma("Lança",3);
        arma3 = new Arma("Espada",5);
        glad1 = new Gladiador("Maximus",false);
        glad2 = new Gladiador("He-man",true);
        arena = new Arena("Itaquerão");
        arena.realizaCombate(glad1,arma1,glad2,arma2);
        arena.realizaCombate(glad1,arma3,glad2,arma2);
        arma1.imprime();
        arma2.imprime();
        arma3.imprime();
        glad1.imprime();
        glad2.imprime();
        arena.imprime();
    }
}
~~~