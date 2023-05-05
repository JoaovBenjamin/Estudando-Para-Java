//Escreva um programa que receba dois números e verifique qual é o maior.
package Condicionais;

import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        if(num1 > num2){
            System.out.println("O numero um é o maior");
        } else if (num2 > num1) {
            System.out.println("O numero dois é o maior");
        }else {
            System.out.println("Os numeros são iguais");
        }
    }
}
