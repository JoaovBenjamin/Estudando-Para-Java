package Exe_Arrays;

public class exe1 {
    public static void main(String[] args) {
        int[] meuArray = new int[5];

        // Preencha o array com valores de sua escolha
        meuArray[0] = 10;
        meuArray[1] = 20;
        meuArray[2] = 30;
        meuArray[3] = 40;
        meuArray[4] = 50;

        // Exiba os elementos do array na ordem inversa
        System.out.print("Array na ordem inversa: ");
        for (int i = meuArray.length - 1; i >= 0; i--) {
            System.out.print(meuArray[i] + " ");
        }
    }
}

