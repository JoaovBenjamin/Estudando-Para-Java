package Exe_Arrays;

public class Exe8 {
    private int[] num;
    public Exe8(int[] num){
        this.num = num;
    }
    public void imprimirImpares(){
        for(int i = 0; i < num.length;i++){
            if(num[i] %2 !=0){
                System.out.println(num[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        Exe8 exe8 = new Exe8(num);
        exe8.imprimirImpares();
    }
}
