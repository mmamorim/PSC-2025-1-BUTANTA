<img src="/assets/teste.svg" width="100%">

# Exercícios

#### EXERCÍCIO 1
> Construa uma classe ```Piloto``` contendo como atributos a quantidade de horas de vôo e o nome do piloto. Implemente nesta classe um método construtor que receba como parâmetro uma string com o nome do piloto, e os métodos de acesso/ modificadores apenas para o atributo do nome do piloto. Todo objeto piloto instanciado deve inicialmente estar com a quantidade de horas de vôo zerada. A classe deve disponibilizar um método ```adicionaHoras(int horas)``` que adiciona uma quantidade de horas de vôo ao piloto. 
Crie um método ```imprime()``` que imprima o nome do piloto e a quantidade de horas de vôo, sendo que deverá ser impresso o tipo do piloto: até 200 horas, co-piloto, caso contrário comandante.

#### EXERCÍCIO 2
> Construa uma classe ```Aviao``` contendo como atributo um número inteiro representando a quantidade de horas de atividade do avião e implemente nesta classe um método construtor que inicialize este atributo com zero. Crie um método ```fazVoo(int horas, Piloto piloto)``` que receba como parâmetro a quantidade de horas do vôo, e um objeto da classe Piloto. Este método deve ser responsável de incrementar a quantidade de horas de atividade do avião e atualizar a quantidade de horas de vôo do piloto. Sabe-se que um avião faz uma revisão a cada 200 horas de atividade. Vôos só devem ser realizados para aviões que tenham feito revisões a cada 200 horas. Crie um método ```fazRevisao()``` que zera a quantidade de horas de atividade do avião e um método ```imprime()``` que imprima a quantidade de horas de atividade e se o avião precisa ou não de revisão.

Exemplo de possível simulação dos objetos para Exercício 1 e 2:

~~~java
public class Prog {
    public static void main(String args[]) {
        Piloto p1, p2;
        Aviao a1;
        p1 = new Piloto(“Abreu”);
        p2 = new Piloto(“Julio”);
        a1 = new Aviao();
        a1.fazVoo(40,p1);
        a1.fazVoo(100,p2);
        a1.fazVoo(170,p2);
        a1.fazVoo(30,p1);
        a1.fazRevisao();
        a1.fazVoo(20,p1);
        p1.imprime();
        p2.imprime();
        a1.imprime();
    }
}
~~~

#### EXERCÍCIO 3
> Construa uma classe ```TimeFutebol``` contendo como atributos: o nome do time, um inteiro que representa a quantidade de jogos realizados pelo time, um inteiro que indica o número de pontos ganhos, e um inteiro que segue a seguinte representação: 0 – retranqueiro, 1 – joga no ataque. Implemente nesta classe um método construtor que receba como parâmetro uma string com o nome do time e um inteiro indicando se o time é retranqueiro ou joga no ataque. Este método construtor deve inicializar a quantidade de jogos e os pontos ganhos com zero. Crie apenas um método de acesso para retornar o valor do estilo de jogo do time. A classe deve disponibilizar um método ```venceu()```, um método ```empatou()```, e um método ```perdeu()``` para registrar respectivamente a vitória (3 pontos), empate (1 ponto), e derrota (0 pontos), atualizando devidamente os pontos ganhos e jogos realizados. Crie um método ```imprime``` que imprima qual a situação do time.

#### EXERCÍCIO 4
> Construa uma classe ```Campeonato``` contendo como atributo um número inteiro representando a quantidade de jogos realizados e implemente nesta classe um método construtor que inicialize este atributo com zero. Crie um método ```realizaJogo(TimeFutebol timeCasa, TimeFutebol timeVisitante)``` que recebe como parâmetro dois objeto da classe TimeFutebol. Este método é responsável em analisar e registrar o resultado do jogo para cada time. Sabe-se que um time retranqueiro sempre ganha quando joga na casa de um adversário que joga no ataque. Times que jogam no ataque em jogos na casa do adversário sempre ganham. As outras combinações, sempre resultam em empate. Crie um método ```imprime()``` que imprima a quantidade de jogos realizados no campeonato.

Exemplo de possível simulação dos objetos para Exercício 3 e 4:

~~~java
public class Prog {
    public static void main(String args[]) {
        TimeFutebol time1, time2, time3;
        Campeonato camp1;

        time1 = new TimeFutebol(“Bimboca”,0);
        time2 = new TimeFutebol(“BocaSeniors”,0);
        time3 = new TimeFutebol(“TerceiroTDS”,1);
        camp1 = new Campeonato();

        camp1.realizaJogo(time1,time2);
        camp1.realizaJogo(time2,time3);
        camp1.realizaJogo(time3,time1);
        camp1.realizaJogo(time3,time2);

        camp1.imprime();
        time1.imprime();
        time2.imprime();
        time3.imprime();
    }
}

~~~