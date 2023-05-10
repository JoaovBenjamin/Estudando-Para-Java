package Exe_Arrays;

import java.util.Scanner;

public class exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[4][4];
        int maior = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length;j++){
                System.out.printf("Digite um valor para [%d][%d]",i,j);
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > maior){
                    maior = matriz[i][j];
                }
            }
        }
        System.out.println("Matriz: ");
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Maior valor: " + maior);
    }
}
