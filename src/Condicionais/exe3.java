//Escreva um programa que receba as notas de três provas de um aluno e calcule sua média. Se a média for maior ou igual a 7, o aluno está aprovado. Caso
package Condicionais;

import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nota: ");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite sua nota: ");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite sua nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;
        if(media >= 7){
            System.out.println("Voce foi aprovado");
        }else {
            System.out.println("Voce foi reprovado");
        }
    }
}
