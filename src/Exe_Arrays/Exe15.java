package Exe_Arrays;

import java.util.Scanner;

public class Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[2][3];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.printf("Digite um valor [%d][%d]: ",i,j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matriz.length; i++ ){
            double soma = 0;
            for(int j = 0; j < matriz[i].length;j++){
                System.out.println(matriz[i][j] + " ");
                soma+=matriz[i][j];
            }
            double media = soma/ matriz[i].length;
            System.out.println("Media da linha " + (i+1) + ": " + media);
        }
    }
}
