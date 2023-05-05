//Escreva um programa que receba um número e informe se ele é positivo, negativo ou zero.
package Condicionais;

import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em celsius: ");
        double c = scanner.nextDouble();
        double  f = (c * 9 / 5) + 32;
        System.out.println("A temperatura de Fahrenheit é: " + f);
    }
}
