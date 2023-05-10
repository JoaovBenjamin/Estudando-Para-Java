package Exe_Arrays;

import java.util.Scanner;

public class exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[3][3];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("Digite o valor para [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }
        System.out.println("Matriz: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length;j++){
                System.out.print(matriz[i][j] + " ");
            }System.out.println();
        }
        System.out.println("Soma: " + soma);
    }
}
