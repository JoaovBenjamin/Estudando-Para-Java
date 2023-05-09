package Exe_Arrays;

import java.util.Scanner;

public class exe4 {

    public static void main(String[] args) {
        String[] frase = new String[4];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < frase.length; i++) {
            System.out.println("Digite uma frase: ");
            frase[i] = scanner.nextLine();
        }
        for (int i = 0; i < frase.length; i++) {
            System.out.println(frase[i]);
        }
    }
}