//Escreva um programa que receba três números e informe se eles formam um triângulo válido.
package Condicionais;

import java.util.Scanner;

public class exe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro lado do triângulo: ");
        int lado1 = scanner.nextInt();
        System.out.print("Digite o segundo lado do triângulo: ");
        int lado2 = scanner.nextInt();
        System.out.print("Digite o terceiro lado do triângulo: ");
        int lado3 = scanner.nextInt();
        if(lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("Os lados formam um triângulo válido.");
        } else {
            System.out.println("Os lados não formam um triângulo válido.");
        }
    }
}
