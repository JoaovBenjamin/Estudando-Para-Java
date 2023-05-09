package Exe_Arrays;

public class exe5 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        for(int vetor:num){
        System.out.println(vetor);
        }
        System.out.println();
        for(int i = 0; i < num.length; i++){
            if(num[i] %2 !=0){
                System.out.println(num[i]);
            }
        }
    }
}
