package Exe_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        for(int i =0; i < vetorA.length;i++){
            System.out.println("Digite um valor: ");
            vetorA[i] = scanner.nextInt();
            vetorB[i] = vetorA[i];
        }
        System.out.println("Vetor A: ");
        for(int i=0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor B: ");
        for (int i = 0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }

}
