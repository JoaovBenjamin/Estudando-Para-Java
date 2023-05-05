package Condicionais;

import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o número de horas trabalhadas: ");
            int horasTrabalhadas = scanner.nextInt();
            System.out.print("Digite o valor da hora de trabalho: ");
            double valorHora = scanner.nextDouble();
            double salarioBruto = horasTrabalhadas * valorHora;
            double inss = salarioBruto * 0.1;
            double sindicato = salarioBruto * 0.03;
            double ir = salarioBruto * 0.075;
            double descontos = inss + sindicato + ir;
            double salarioLiquido = salarioBruto - descontos;
            System.out.printf("Salário Bruto: R$ %.2f%n", salarioBruto);
            System.out.printf("INSS: R$ %.2f%n", inss);
            System.out.printf("Sindicato: R$ %.2f%n", sindicato);
            System.out.printf("Imposto de Renda: R$ %.2f%n", ir);
            System.out.printf("Total de Descontos: R$ %.2f%n", descontos);
            System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);
            scanner.close();
        }
    }


