//Escreva um programa que receba um número e informe se ele é positivo, negativo ou zero.
package Condicionais;

import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        double num = scanner.nextDouble();
        if(num > 0){
            System.out.println("O numero é maior que 0");
        } else if (num < 0) {
            System.out.println("O numero é menor que 0");
        }else {
            System.out.println("O numero é 0");
        }
    }
}
