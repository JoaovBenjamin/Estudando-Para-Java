package Exe_Arrays;

import java.util.Scanner;

public class Exe10 {
    private String[] frase;

    public Exe10(){
        frase = new String[4];
    }
    public void lerFrase(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < frase.length; i++){
            System.out.println("Digite uma frase: ");
            frase[i] = scanner.nextLine();
        }
    }
    public void imprimirFrase(){
        for (int i = 0; i < frase.length; i++){
            System.out.println(frase[i]);
        }
    }

    public static void main(String[] args) {
        Exe10 exe10 = new Exe10();
        exe10.lerFrase();
        exe10.imprimirFrase();
    }
}
