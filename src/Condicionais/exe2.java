//Crie um programa que verifique se um número é par ou ímpar.
package Condicionais;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();
        if(num %2 == 0){
            System.out.println("O numero é par");
        }else {
            System.out.println("O numero é ímpar");
        }
    }
}
