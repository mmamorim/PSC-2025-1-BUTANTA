import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite horas início reunião:");
        int horaIni = leitor.nextInt();
        System.out.println("Digite minutos início reunião:");
        int minIni = leitor.nextInt();
        System.out.println("Digite horas fim reunião:");
        int horaFim = leitor.nextInt();
        System.out.println("Digite minutos fim reunião:");
        int minFim = leitor.nextInt();

        int tempoInicio = (horaIni*60)+minIni;
        int tempoFim = (horaFim*60)+minFim;
        int tempoTotal = tempoFim - tempoInicio;
        int hora = tempoTotal/60;
        int minutos = tempoTotal%60;

        System.out.println("Tempo de duração: "+hora+":"+minutos);

    }
}
