package Exe_Arrays;

import java.util.Scanner;

public class Exe9 {
    private int[] num;
    public Exe9(){
        num = new int[10];
    }
    public void lerNum(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < num.length; i++){
            System.out.println("Digite um numero: ");
            num[i] = scanner.nextInt();
        }
    }
    public void imprimirImpar(){
        for(int i = 0; i < num.length; i++){
            if(num[i] %2 !=0){
                System.out.println(num[i]);
            }
        }
    }

    public static void main(String[] args) {
        Exe9 exe9 = new Exe9();
        exe9.lerNum();
        exe9.imprimirImpar();
    }
}
