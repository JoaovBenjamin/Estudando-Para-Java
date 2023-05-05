//Faça um programa que calcule o imposto de renda de uma pessoa. O programa deve receber o salário mensal e verificar em qual faixa de imposto a pessoa se encontra.

package Condicionais;

import java.util.Scanner;

public class exe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario");
        double salario = scanner.nextDouble();
        double imposto;
        if(salario <= 1903.98) {
            imposto = 0;
        } else if(salario <= 2826.65) {
            imposto = (salario * 7.5 / 100) - 142.8;
        } else if(salario <= 3751.05) {
            imposto = (salario * 15 / 100) - 354.8;
        } else if(salario <= 4664.68) {
            imposto = (salario * 22.5 / 100) - 636.13;
        } else {
            imposto = (salario * 27.5 / 100) - 869.36;
        }
        System.out.printf("O imposto de renda é de R$ %.2f%n", imposto);

        }
    }

