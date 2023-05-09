package Exe_Arrays;

public class Exe12 {
    private int[] num;
    public Exe12(int[] num){
        this.num = num;
    }
    public void numeros(){
        for(int i = 0; i < num.length;i++){
            System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        Exe12 exe12 = new Exe12(num);
        exe12.numeros();
    }
}
