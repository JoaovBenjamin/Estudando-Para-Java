package Exe_Arrays;

public class Exe11 {
    private int[] num;

    public Exe11(){
        num = new int[10];
    }
    public void numeros(){
        for(int i = 0; i < num.length; i++){
            num[i] = i * 2;
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        Exe11 exe11 = new Exe11();
        exe11.numeros();
    }
}
