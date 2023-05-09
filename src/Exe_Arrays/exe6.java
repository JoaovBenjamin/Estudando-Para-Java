package Exe_Arrays;

import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {
        int[] num = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < num.length; i++){
            System.out.println("Digite um numero: ");
            num[i] = scanner.nextInt();
        }
        System.out.println();
        for(int i = 0; i < num.length; i++){
            if(num[i] %3 == 0){
                System.out.println(num[i]);
            }
        }
    }
}
