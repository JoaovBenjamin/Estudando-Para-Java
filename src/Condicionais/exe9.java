//Faça um programa que pergunte o dia da semana e informe se é um dia útil ou não.
package Condicionais;

import java.util.Scanner;

public class exe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana (1-7)");
        int d = scanner.nextInt();
        if (d >=2 && d<=6){
            System.out.println("É um dia útil");
        } else if (d == 1 || d == 7) {
            System.out.println("Não é dia útil");
        }else {
            System.out.println("Dia invalido");
        }
    }
}
