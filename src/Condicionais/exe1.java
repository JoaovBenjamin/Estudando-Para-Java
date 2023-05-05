//Faça um programa que receba a idade de uma pessoa e verifique se ela é maior ou menor de idade.

package Condicionais;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();
        if(idade >= 18) {
            System.out.println("Vc é maior de idade");
        }
        else {
            System.out.println("Vc é menor de idade");
        }

    }
}
