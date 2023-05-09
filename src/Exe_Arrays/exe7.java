package Exe_Arrays;

import java.util.Scanner;

public class exe7 {
    private int[] num;

    public exe7(){
        num = new int[10];
    }
    public void lerNum(){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < num.length; i++){
            System.out.println("Digite um numero: ");
            num[i] = scanner.nextInt();
        }
    }public void divTres(){
        for (int i = 0; i < num.length;i++){
            if(num[i] %3 == 0){
                System.out.println(num[i]);
            }
        }
    }

    public static void main(String[] args) {
        exe7 exe7 = new exe7();
        exe7.lerNum();
        exe7.divTres();
    }
}
