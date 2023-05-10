package Exe_Arrays;

import java.util.Random;
import java.util.Scanner;

public class JogoDeDados {
    private static final int NUM_FACES_DADO = 6;
    private int numJogadas;
    private int[] resultados;
    private Random random;

    public JogoDeDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de jogadas: ");
        numJogadas = scanner.nextInt();
        resultados = new int[NUM_FACES_DADO];
        random = new Random();
    }

    public void jogarDados() {
        for (int i = 0; i < numJogadas; i++) {
            int resultadoJogada = random.nextInt(NUM_FACES_DADO) + 1;
            resultados[resultadoJogada - 1]++;
            System.out.println("Jogada " + (i + 1) + ": " + resultadoJogada);
        }
    }

    public void exibirRelatorio() {
        System.out.println("Relatório de resultados:");
        for (int i = 0; i < NUM_FACES_DADO; i++) {
            System.out.println("Face " + (i + 1) + ": " + resultados[i] + " vezes");
        }
    }

    public static void main(String[] args) {
        JogoDeDados jogo = new JogoDeDados();
        jogo.jogarDados();
        jogo.exibirRelatorio();
    }
}
